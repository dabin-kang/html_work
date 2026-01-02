package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			//1. 서버생성
			server = new ServerSocket(7777);
			
			while(true) {
				System.out.println("클라이언트 접속대기");
				
				//3. 클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress()+"접속");
				
				
				//4. 서버 -> 클아이언트 데이터 송신
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("강다빈이 보내는 메세지");
				
				// 7.stream 닫기
				dos.close();
				os.close();
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//8.서버 닫기
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
