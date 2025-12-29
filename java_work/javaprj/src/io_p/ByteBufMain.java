package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufMain {
	public static void main(String[] args) {
		ByteArrayOutputStream AAA = new ByteArrayOutputStream(); 
		byte [] data1 = {1,3,5,7,9,11,13,15,17,19,21,23,25};
		byte [] data2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14};
		byte [] data3 = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
		
		
		
		try {
			System.out.println(Arrays.toString(data1));
			System.out.println(Arrays.toString(data2));
			System.out.println(Arrays.toString(data3));
			
			
			AAA.write(data1);
			//System.out.println(Arrays.toString(AAA.toByteArray()));
			AAA.write(data2);
			//System.out.println(Arrays.toString(AAA.toByteArray()));
			AAA.write(data3);
			//System.out.println(Arrays.toString(AAA.toByteArray()));
			
//			System.out.println(Arrays.toString(AAA));

			//byte [] arr = AAA.toByteArray();
			AAA.close();
			byte [] arr = AAA.toByteArray();
			System.out.println(Arrays.toString(arr));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



/*
 * byte [] data1 = {1,3,5,7,9,11,13,15,17,19,21,23,25};
 * byte [] data2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14};
 * byte [] data3 = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
 * buf를 이용하여 데이터를 읽어와서'
 * 한 개의 배열로 출력하세요
 */