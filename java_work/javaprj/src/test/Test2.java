package test;

import java.util.Scanner;

class Dan {
	int d;
	
	Dan(int d) {
		this.d = d;
	}
	
	void start() {
		for(int a = 1; a <= 9; a++ ) {
			System.out.println(d +" x " +a +" = " +a*d);
		}
	}
	
	void end() {
		for(int a = 9; a >=1; a-- ) {
			System.out.println(d +" x " +a +" = " +a*d);
		}
	}
}

public class Test2 {
	
	
	public static void meth(int b) {
		
		for(int a = 1; a <= 9; a++ ) {
			System.out.println(b +" x " +a +" = " +a*b);
		}
	}
	
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("몇 단?(0 : 종료) : ");
			b = sc.nextInt();
			if(b == 0) {
				System.out.println("구구단 종료");
				break;
				
			}
			//b=2
			for( a = 1; a <= 9; a++ ) {
				System.out.println(b +" x " +a +" = " +a*b);
			}
		}
		
		b=2;
		for( a = 1; a <= 9; a++ ) {
			System.out.println(b +" x " +a +" = " +a*b);
		}
		b=3;
		for( a = 1; a <= 9; a++ ) {
			System.out.println(b +" x " +a +" = " +a*b);
		}
		b=4;
		for( a = 1; a <= 9; a++ ) {
			System.out.println(b +" x " +a +" = " +a*b);
		}
		
		
		//2단, 3단 출력.
		//정순12346789, 역순987654321
		
		b=2;
		for( a = 1; a <= 9; a++ ) {
			System.out.println(b +" x " +a +" = " +a*b);
		}
		int c=3;
		for( a = 9; a >=1; a-- ) {
			System.out.println(c +" x " +a +" = " +a*c);
		}	
		int d=4;
		for( a = 9; a >=1; a-- ) {
			System.out.println(d +" x " +a +" = " +a*d);
		}
		int f=6;
		for( a = 1; a >=9; a++ ) {
			System.out.println(f +" x " +a +" = " +a*f);
		}
		
		Dan dan3 = new Dan(3);
		Dan dan4 = new Dan(4);
		Dan dan5 = new Dan(5);
		Dan dan6 = new Dan(6);
		
		
		dan3.start();
		dan4.end();
		dan5.start();
		dan6.start();
		
	}

}


//{a} x {b} = {a*b}
