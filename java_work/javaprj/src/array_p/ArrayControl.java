package array_p;

import java.util.Arrays;

public class ArrayControl {
	public static void main(String[] args) {
		//{11,22,33,44}배열 값들을 자료형 int[] 배열로 공간을 생성한변수 arr1 에 입력하겠다 
		int[] arr1 = {11,22,33,44};
		int arr2 [] = {55,66,47,88};
		
		//출력 						배열을 문자로 변환
		System.out.println("arr1 :"+Arrays.toString(arr1)+"," +arr1);
		System.out.println("arr2 :"+Arrays.toString(arr2)+"," +arr2);
		
		//arr1[4] = 1234;
		int [] arr3 = new int[arr1.length+1];
		System.out.println("arr3 :"+Arrays.toString(arr3)+"," +arr3);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			arr3[i] = arr1[i];
		}
		arr3[arr1.length] = 55;
		System.out.println("arr3 :"+Arrays.toString(arr3)+"," +arr3);
		
		arr1 = arr3;
		System.out.println("arr1 :"+Arrays.toString(arr1)+"," +arr1);
		
		
		
		
		//67,89,23,46,12,57,83,52,91,73 --> 숫자 중에서 짝수로 구성 된 배열을 구현하세요

	
		
		
	}
}
