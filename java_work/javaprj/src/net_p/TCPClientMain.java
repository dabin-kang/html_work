package net_p;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientMain {

	public static void main(String[] args) {
		try {
			//2. 클라이언트 서버 접속
			Socket socket = new Socket("192.168.0.110",7777);
			
			//4. steam 생성
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			
			//6. 서버 -> 클라이언트 데이터 수신 
			System.out.println("수신 :"+dis.readUTF());
			
			//7.닫기
			dis.close();
			is.close();
			
			socket.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
