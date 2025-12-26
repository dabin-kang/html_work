package test;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aa = new int[6] ;
		System.out.println(Arrays.toString(aa));
		for(int i = 0; i < aa.length;i++) {
			aa[i] = 22*(i+1);
		}
	System.out.println(aa[1]);
	
	
//	int[] nums = {3, 7, 1, 9, 4};
//	System.out.println(Arrays.toString (nums)); 
	
	int tot = 0;
	int[] nums = {5, 2, 8, 3, 1};
	for(int i = 0; i <= 4 ; i++) {
		tot = tot + nums[i];
	}
	System.out.println(tot);
	
	
	}
	
	
//	int[] nums = {5, 2, 8, 3, 1};
	
	
	
	
	
}



/*정수 배열

int[] nums = {3, 7, 1, 9, 4};


위 배열의 모든 값을 순서대로 출력하세요.
*/



