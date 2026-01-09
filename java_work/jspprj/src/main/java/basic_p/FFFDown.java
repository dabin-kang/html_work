import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FFFDown")
public class FFFDown extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // 1. 파라미터로 넘어온 파일명 가져오기
        String fileName = request.getParameter("fname");
        String savePath = request.getServletContext().getRealPath("/fff");
        File file = new File(savePath + File.separator + fileName);

        // 2. 파일이 존재하는지 확인
        if (file.exists()) {
            // 브라우저가 파일을 다운로드 창으로 띄우도록 헤더 설정
            String mimeType = getServletContext().getMimeType(file.toString());
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }
            response.setContentType(mimeType);

            // 파일명 인코딩 (한글 깨짐 방지)
            String encodedName = new String(fileName.getBytes("UTF-8"));
            response.setHeader("Content-Disposition", "attachment; filename=\"" + encodedName + "\"");

            // 3. 파일 읽어서 전송
            try (FileInputStream in = new FileInputStream(file);
                 OutputStream out = response.getOutputStream()) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
        } else {
            response.getWriter().println("파일을 찾을 수 없습니다.");
        }
    }
}