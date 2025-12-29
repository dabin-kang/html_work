package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileMain {

	public static void main(String[] args)  {
		
		try {
			FileInputStream fis = new FileInputStream ("fff/ccc.txt");
			
			byte [] dst = new byte[300];
			int len = fis.read(dst);
			String ttt = new String(dst);
			
			System.out.println(len);
			System.out.println(ttt);
			
			FileOutputStream fos = new FileOutputStream("ggg/ddd.txt");
			fos.write(dst);
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}


/*
 * FileMain
 * fff/ccc.txt ==> ggg/ddd.txt 복사하세요
 * 
 * 
 */