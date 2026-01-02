package io_p;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterMain {

	public static void main(String[] args) {
		String ttt = "2026년은 병오년 happy new year~~";
		
		char [] arr = ttt.toCharArray();
		Writer ww;
		try {
			ww = new FileWriter("fff/ddd.txt",true);// 빈 파일을 생성 , true: 이전 내용 붙여쓰기 , false(생략시):새로쓰기
			
			for (char c: arr) {
				ww.write(c);// 여러 번 실행 시켜도 내용은 한 번 만들어간다, dd에 내용 입력하기
			}
			
			ww.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
