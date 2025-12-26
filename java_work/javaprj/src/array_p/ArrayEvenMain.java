package array_p;

import java.util.Arrays;

public class ArrayEvenMain {

	public static void main(String[] args) {
		int [] arr1 = {67,89,23,46,12,57,83,52,91,73};
		
		// 배열형태로 arr1을 보여준다
		System.out.println(Arrays.toString(arr1));
		
		//arr1.length는 배열의 길이 10,
		int [] arr3 = new int[arr1.length];
		System.out.println(arr3);
		
		//arr1.length 길이 만큼 반복 실행
		for (int i = 0; i < 10; i++) {
			
			//arr1의 짝수를 구하는 식
			if(arr1[i]%2 == 0) {
				
				//arr1[i]로 구한 짝수를 보여주기
				System.out.println(arr1[i]);
			}
			
			//공간을 만들어 있는 arr3에 arr1의 짝수 값들을 넣는다
			arr3[i] = arr1[i] ;
			System.out.println(arr3[i]);
		}
		
		
	}

}

////원소 정의
//int [] ori = {67,89,23,46,12,57,83,52,91,73};
//
//// 비어있는 even 배열 변수 생성
//int [] even = {};
//
////반복문 i가 0, 0보다 10 일때  조건 ; i증가
//for (int i = 0; i < ori.length; i++) {
//	
//	//i에 따라 2를 나누어 나머지가 0 인수를 찾지
//	if(ori[i]%2==0) {
//		
//		//even.length는 비어있는 배열 0
//		// 1을 더한다
//		//1을 더한 even.length 값을 buf[]에 담는다
//		int [] buf = new int[even.length+1];
//		
//		// even.length = 0
//		// j = 0
//		// 0 < 0 조건값을 만족하지 않는다.
//		for (int j = 0; j < even.length; j++) {
//			
//			// buf[j] = 1 , even[j] = 0
//			buf[j] = even[j];
//		}
//		
//		//even.length = 0	짝수 값
//		buf[even.length] = ori[i];
//		
//		//주소참조
//		even=buf;
//		
//	}
//}
//
//System.out.println(Arrays.toString(even));
