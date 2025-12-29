package io_p;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutMain {

	public static void main(String[] args) {
		String str = "qwe yuiorewq\n cvneradf\n 1029384756\n 개나리 개나리 얼룱 개나리\n #$%$^(!)";
		
		System.out.println(str);
		
//		바이트화 시키기
		byte [] arr = str.getBytes();
		System.out.println(Arrays.toString(arr));
		
//		파일 쓰기
		try {
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			
			fos.write(arr);
	
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}







