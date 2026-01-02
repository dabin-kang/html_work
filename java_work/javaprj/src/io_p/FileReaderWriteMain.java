package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class FileReaderWriteMain {

	public static void main(String[] args)  {
		
		try {
			Reader rr = new FileReader("fff/aaa.txt");
			Writer ww = new FileWriter ("ggg/eee.txt");// 쓰기
			
//			변환해서 가져오기
			char [] buf = new char[8];
			
			while(true) {
				int len = rr.read(buf);
				if(len<0) {
					break;
				}
				
				String ttt = new String(buf,0,len);
				System.out.println(ttt+":"+len);
				ww.write(ttt);//쓰기
			}
		
			
			ww.close();
			rr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}


