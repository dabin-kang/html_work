package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListNumMain {

	public static void main(String[] args) {
		int [] arr = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29};
		System.out.println("arr주소 값 : " +arr);
		
//		각 배수를 저장할 ArrayList를 생성한다.
		ArrayList sum2 = new ArrayList();
		System.out.println("sum2 값 : " +sum2);
		
//		2의 배수 찾기
		for (int num : arr) {
			System.out.println(num);
			if(num%2 == 0) {
				sum2.add(num);
				System.out.println(sum2+",");
			}
		}
		System.out.println("sum2 값 : " +sum2);
	}

}


/*
 *23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29
 *2,3,5, 의 배수로 나누어 ArrayList로 정리하세요
 */