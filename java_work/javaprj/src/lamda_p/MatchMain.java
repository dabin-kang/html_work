package lamda_p;

import java.util.Arrays;

public class MatchMain {

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10};
		
		System.out.println("all 2의 배수 : "+Arrays.stream(arr).allMatch(a->a%2==0));//all 짝수 : true
		System.out.println("all 3의 배수 : "+Arrays.stream(arr).allMatch(a->a%3==0));//all 3의 배수 : false
		
		System.out.println("any 3의 배수 : "+Arrays.stream(arr).anyMatch(a->a%3==0));//any 3의 배수 : true , 하나라도 있으면 true
		System.out.println("any 7의 배수 : "+Arrays.stream(arr).anyMatch(a->a%7==0));//any 7의 배수 : false
		
		System.out.println("none 3의 배수 : "+Arrays.stream(arr).noneMatch(a->a%3==0));//none 3의 배수 : false
		System.out.println("none 7의 배수 : "+Arrays.stream(arr).noneMatch(a->a%7==0));//none 7의 배수 : true
	}

}
