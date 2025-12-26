package test;

public class Test3 {

	static int meth_1(int n) { //n=3
		
		for(int i =1; i <=n ;i++) {
			//i=1 *=1 enter
			for(int s =1; s<=i; s++) {
				//s=1 s<=1
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		System.out.println("------------------");
		int i =3;
		for(int s = 1 ; s <= i; s++ ) {
			System.out.print("*");
		}
		System.out.println();
		i=3;
		for(int s = 1 ; s <= 3; s++ ) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("------------------");
		
		int a=10, b=20;
		String ttt = a+"-"+b+"-"+b+","+b+","+b+","+b+","+b+","+b+","+b+","+b+b;
		System.out.println(ttt);
		
		System.out.println("------------------");
		

		for(int j = 5; j >= 1; j--) {
			//j=5 n=1 1<=5 *
			//j=4 *4
			//
			for(int n = 1; n<=j; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		int aaa = meth_1(4); //meth_1 : 11
		System.out.println(aaa);
		meth_1(5);
		
//		for(int i =1; i <=4 ;i++) {
//			//i=1 *=1 enter
//			for(int s =1; s<=i; s++) {
//				//s=1 s<=1
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		for(int i =1; i <=5 ;i++) {
//			//i=1 *=1 enter
//			for(int s =1; s<=i; s++) {
//				//s=1 s<=1
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		
		
		
	}

}
//*
//**
//***
//****
//*****

//*****
//****
//***
//**
//*


