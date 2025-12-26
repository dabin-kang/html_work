package com.example.stickermusic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import org.json.JSONObject;
import java.io.File;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 스티커 스캐너 액티비티
 * 카메라로 스티커를 촬영하고, AI 서버로 전송하여 인식한 후,
 * 해당 스티커에 매칭되는 음악 플레이리스트를 여는 기능을 수행합니다.
 */
public class StickerScannerActivity extends AppCompatActivity {
    
    // 카메라 촬영 요청을 구분하기 위한 코드
    private static final int REQUEST_IMAGE_CAPTURE = 100;
    
    // YOLO 서버 주소 (스티커 인식을 위한 AI 서버)
    private static final String YOLO_SERVER_URL = "http://YOUR_SERVER_IP:5000/detect";
    
    // 플레이리스트 API 서버 주소 (스티커 ID로 플레이리스트 URL을 받아오는 서버)
    private static final String PLAYLIST_API_URL = "http://YOUR_SERVER_IP:8080/sticker/";
    
    // 촬영한 사진 파일을 저장할 변수
    private File photoFile;
    
    // HTTP 통신을 위한 클라이언트 객체
    private OkHttpClient client;

    /**
     * 액티비티가 생성될 때 호출되는 메서드
     * 앱이 처음 시작될 때 실행됩니다.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticker_scanner);
        
        // HTTP 클라이언트 초기화
        client = new OkHttpClient();
        
        // 카메라 실행하여 스티커 촬영 시작
        captureSticker();
    }

    /**
     * 카메라를 실행하여 스티커 사진을 촬영하는 메서드
     */
    private void captureSticker() {
        // 카메라 앱을 실행하기 위한 인텐트 생성
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        
        // 촬영한 사진을 저장할 파일 생성 (앱 전용 폴더에 "sticker.jpg"로 저장)
        photoFile = new File(getExternalFilesDir(null), "sticker.jpg");
        
        // 안드로이드 7.0 이상에서 파일 공유를 위한 URI 생성
        Uri photoUri = FileProvider.getUriForFile(this, 
            "com.example.stickermusic.fileprovider", photoFile);
        
        // 카메라 앱에게 사진을 저장할 위치를 알려줌
        intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
        
        // 카메라 앱이 설치되어 있는지 확인 후 실행
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }
    }

    /**
     * 카메라 앱에서 돌아왔을 때 호출되는 메서드
     * 사진 촬영이 완료되면 여기서 결과를 받습니다.
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
        // 카메라 촬영 요청이고, 촬영이 성공했다면
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            // 촬영한 이미지를 YOLO 서버로 전송하여 스티커 감지
            detectSticker(photoFile);
        }
    }

    /**
     * 촬영한 이미지를 YOLO 서버로 전송하여 스티커를 인식하는 메서드
     * @param imageFile 촬영한 이미지 파일
     */
    private void detectSticker(File imageFile) {
        // HTTP 요청 본문(body) 생성 - 이미지 파일을 포함
        RequestBody body = new MultipartBody.Builder()
            .setType(MultipartBody.FORM) // 폼 데이터 형식으로 설정
            .addFormDataPart(
                "image",              // 서버에서 받을 파라미터 이름
                "sticker.jpg",        // 파일명
                RequestBody.create(imageFile, MediaType.parse("image/jpeg")) // 이미지 파일 첨부
            )
            .build();

        // HTTP POST 요청 생성
        Request request = new Request.Builder()
            .url(YOLO_SERVER_URL)  // YOLO 서버 주소
            .post(body)             // POST 방식으로 body 전송
            .build();

        // 비동기 방식으로 서버에 요청 전송 (메인 스레드를 차단하지 않음)
        client.newCall(request).enqueue(new Callback() {
            /**
             * 서버 통신이 실패했을 때 호출되는 메서드
             */
            @Override
            public void onFailure(Call call, IOException e) {
                // UI 스레드에서 토스트 메시지 표시
                runOnUiThread(() -> 
                    Toast.makeText(StickerScannerActivity.this, 
                        "스티커 인식 실패: " + e.getMessage(), 
                        Toast.LENGTH_SHORT).show()
                );
            }

            /**
             * 서버 통신이 성공했을 때 호출되는 메서드
             */
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    // 서버 응답을 문자열로 변환
                    String responseBody = response.body().string();
                    try {
                        // JSON 형식의 응답을 파싱
                        // 예: {"sticker_id": "travel_01"}
                        JSONObject json = new JSONObject(responseBody);
                        String stickerId = json.getString("sticker_id");
                        
                        // 인식된 스티커 ID로 플레이리스트 조회
                        getPlaylistForSticker(stickerId);
                        
                    } catch (Exception e) {
                        // JSON 파싱 오류 처리
                        runOnUiThread(() -> 
                            Toast.makeText(StickerScannerActivity.this, 
                                "응답 파싱 오류: " + e.getMessage(), 
                                Toast.LENGTH_SHORT).show()
                        );
                    }
                }
            }
        });
    }

    /**
     * 스티커 ID를 사용하여 해당하는 플레이리스트 URL을 서버에서 가져오는 메서드
     * @param stickerId 인식된 스티커의 ID (예: "travel_01")
     */
    private void getPlaylistForSticker(String stickerId) {
        // HTTP GET 요청 생성
        Request request = new Request.Builder()
            .url(PLAYLIST_API_URL + stickerId)  // URL 예: http://서버주소/sticker/travel_01
            .get()
            .build();

        // 비동기 방식으로 서버에 요청 전송
        client.newCall(request).enqueue(new Callback() {
            /**
             * 플레이리스트 조회 실패 시
             */
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(() -> 
                    Toast.makeText(StickerScannerActivity.this, 
                        "플레이리스트 조회 실패", 
                        Toast.LENGTH_SHORT).show()
                );
            }

            /**
             * 플레이리스트 조회 성공 시
             */
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    // 서버에서 받은 플레이리스트 URL
                    String playlistUrl = response.body().string();
                    
                    // "none"이 아니면 플레이리스트가 존재하는 것
                    if (!playlistUrl.equals("none")) {
                        // UI 스레드에서 플레이리스트 열기
                        runOnUiThread(() -> openPlaylist(playlistUrl));
                    } else {
                        // 해당 스티커에 매칭된 플레이리스트가 없는 경우
                        runOnUiThread(() -> 
                            Toast.makeText(StickerScannerActivity.this, 
                                "이 스티커에 해당하는 플레이리스트가 없습니다", 
                                Toast.LENGTH_SHORT).show()
                        );
                    }
                }
            }
        });
    }

    /**
     * 플레이리스트 URL을 브라우저나 음악 앱에서 여는 메서드
     * @param playlistUrl 열고자 하는 플레이리스트 URL
     */
    private void openPlaylist(String playlistUrl) {
        // 웹페이지나 링크를 여는 인텐트 생성
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(playlistUrl));  // URL 설정
        startActivity(intent);  // 기본 브라우저나 음악 앱에서 열기
    }
}

/**
 * 스티커 정보를 담는 데이터 클래스
 */
class Sticker {
    private String stickerId;  // 스티커 고유 ID
    private String name;       // 스티커 이름
    
    public Sticker(String stickerId, String name) {
        this.stickerId = stickerId;
        this.name = name;
    }
    
    // Getter 메서드들
    public String getStickerId() { return stickerId; }
    public String getName() { return name; }
}

/**
 * 플레이리스트 정보를 담는 데이터 클래스
 */
class Playlist {
    private String playlistId;  // 플레이리스트 고유 ID
    private String url;         // 플레이리스트 URL
    
    public Playlist(String playlistId, String url) {
        this.playlistId = playlistId;
        this.url = url;
    }
    
    // Getter 메서드들
    public String getPlaylistId() { return playlistId; }
    public String getUrl() { return url; }
}

/**
 * 스티커와 플레이리스트의 매칭 정보를 담는 데이터 클래스
 */
class StickerPlaylist {
    private String stickerId;     // 스티커 ID
    private String playlistUrl;   // 매칭된 플레이리스트 URL
    
    public StickerPlaylist(String stickerId, String playlistUrl) {
        this.stickerId = stickerId;
        this.playlistUrl = playlistUrl;
    }
    
    // Getter 메서드들
    public String getStickerId() { return stickerId; }
    public String getPlaylistUrl() { return playlistUrl; }
}