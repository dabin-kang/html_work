package test;

import java.util.Arrays;

public class Test_01 {
	

	public static void main(String[] args) {
		// a = 10; b = 20; a,b 를 출력 a,b값을 바꿔서 다시 한번 출력
		
		//int a = 10;
		int a;
		a = 10;
		int b; 
		b = 20;
		
		System.out.println("a:" +a);
		System.out.println("b:" +b);
/////////////////
		
		int c = a;
		int d = b;
		b = c;
		a = d;
		
		
		
		
////////////////
		System.out.println("결과");		
		System.out.println("a:" +a);
		System.out.println("b:" +b);
//////////////
		System.out.println("결과2");
		//순서대로 진행
				//b = a;
				//a = c;
				int e = a;
				a = b;
				b = e;
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	}

}
