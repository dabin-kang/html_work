package array_p;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		int a =10;
		int [] arr1 = {11,22,33,44};
		
		System.out.println("a:"+a);
		System.out.println("arr1:"+arr1); 
		//[I@33c7353a
		// [ : 1차원배열
		// I : int
		//@ : 구분자
		//33c7353a : 주소?(해시코드)
		
		
		// 원소값 호출과 대입
		System.out.println("arr1[0] :" +arr1[0]);
		
		arr1[0] = 1357;
		System.out.println("arr1[0] :" +arr1[0]);
		
		
		a = 20 ;
		//arr1 = {100,200,300,400};
		
		int [] arr2 = new int[5];// 초기값
		// new int[]{0,0,0,0,0};
		
		System.out.println("arr2:"+arr2);//arr2:[I@3af49f1c
		System.out.println("arr2[0] :" +arr2[0]);
		System.out.println("arr2[1] :" +arr2[1]);
		System.out.println("arr2[2] :" +arr2[2]);
		System.out.println("arr2[3] :" +arr2[3]);
		System.out.println("arr2[4] :" +arr2[4]);
//		System.out.println("arr[5] :" +arr2[5]);  에러발생
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//		at array_p.ArrayMain.main(ArrayMain.java:34)
		
		
		int [] arr3 = new int[]{0,0,0,0,0};
		System.out.println("arr3:"+arr3);
		System.out.println("arr3[0] :" +arr3[0]);
		System.out.println("arr3[1] :" +arr3[1]);
		System.out.println("arr3[2] :" +arr3[2]);
		System.out.println("arr3[3] :" +arr3[3]);
		System.out.println("arr3[4] :" +arr3[4]);
		
		
		int [] arr4 = {0,0,0,0,0};
		System.out.println("arr4:"+arr4);
		System.out.println("arr4[0] :" +arr4[0]);
		System.out.println("arr4[1] :" +arr4[1]);
		System.out.println("arr4[2] :" +arr4[2]);
		System.out.println("arr4[3] :" +arr4[3]);
		System.out.println("arr4[4] :" +arr4[4]);
		
		
		//동적할당하여 대입가능
		arr1 = new int[] {123,466,798};
		//arr1 = {132,465,798};
		//new int[] 는 배열 초기화 시에만 생략이 가능하다.
		
		
		// 원소의 내용을 가져올 때 편하게 사용할 수 있다
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		//length를 가져올 수도 있다.
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		
		
		int [] arr5 = {12,34,564,78};
		int [] arr6 = {12,34,564,78};
		int [] arr7 = new int[] {12,34,564,78};
		int [] arr8 = arr5; // 얄은 복사 (shallow copy) 주소만 복사한것, 주소를 공유한다.
		int [] arr9 = arr5.clone(); // 깊은 복사 새로운 공간을 만들어서 원소를 복사하는 것
		int [] arr10 = {arr5[0],arr5[1],arr5[2],arr5[3]};
		
		System.out.println("arr5:"+Arrays.toString(arr5)+","+arr5+","+arr5.length);
		System.out.println("arr6:"+Arrays.toString(arr6)+","+arr6+","+arr6.length);
		System.out.println("arr7:"+Arrays.toString(arr7)+","+arr7+","+arr7.length);
		System.out.println("arr8:"+Arrays.toString(arr8)+","+arr8+","+arr8.length);
		System.out.println("arr9:"+Arrays.toString(arr9)+","+arr9+","+arr9.length);
		System.out.println("arr10:"+Arrays.toString(arr10)+","+arr10+","+arr10.length);
		
		
		System.out.println("arr5 == arr6:" + (arr5 ==arr6));
		System.out.println("arr5 == arr7:" + (arr5 ==arr7));
		System.out.println("arr5 == arr8:" + (arr5 ==arr8));
		System.out.println("arr5 == arr9:" + (arr5 ==arr9));
		System.out.println("arr5 == arr10:" + (arr5 ==arr10));
		
		
		
		arr5[1] = 369;		
		System.out.println("arr5:"+Arrays.toString(arr5)+","+arr5+","+arr5.length);
		System.out.println("arr6:"+Arrays.toString(arr6)+","+arr6+","+arr6.length);
		System.out.println("arr7:"+Arrays.toString(arr7)+","+arr7+","+arr7.length);
		System.out.println("arr8:"+Arrays.toString(arr8)+","+arr8+","+arr8.length);
		System.out.println("arr9:"+Arrays.toString(arr9)+","+arr9+","+arr9.length);
		System.out.println("arr10:"+Arrays.toString(arr10)+","+arr10+","+arr10.length);
	}

}
