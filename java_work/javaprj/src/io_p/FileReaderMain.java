package io_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderMain {

	public static void main(String[] args) {
		try {
			Reader rr = new FileReader("fff/aaa.txt");
			
			int data;
			while((data =rr.read())!=-1) {
				System.out.print((char)data); // 한글이 깨지지 않게 사용하기
			}
			
			rr.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
