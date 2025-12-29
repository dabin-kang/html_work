package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByreBufOutMain {

	public static void main(String[] args) {
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			byte [] buf = {11,22,33,44,55,66,77};
			
			bos.write(buf,2,3); //원하는 원소 가져오기, 배열2번째부터 3개를 가져오기,[33, 44, 55]
			bos.write(buf,1,4); //중복되어서 나온다 , [33, 44, 55, 22, 33, 44, 55]

			
			byte [] arr = bos.toByteArray();
			
			bos.close();
			
			System.out.println(Arrays.toString(arr));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
