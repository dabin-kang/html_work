package oops_p;

import oops_p.NSOuter.NSInner;

class NLOuter{
	String a;
	int b;
	
	static String sa = "외부sa";
	static int sb = 1000;
	
//	제어문과 같은 코딩연산 불가
//	선언과 정의만 가능
	void meth_1() {
		System.out.println("외부meth_1() : -------------------------------------시작");
		
//		메소드 내부에 정의
		class NLInner{
				 String a;
				 int bb;
				 
				 static String sa = "InnMMsa";
				 static  int sc = 2222;
				 
				 void meth_3() {
						System.out.println("내부meth_3()시작--------------");
						System.out.println("외부 : "+NLInner.this.a+","+b);
						System.out.println("외부스태틱 : "+NLInner.sa+","+sb);
						meth_2();
						NLInner.this.meth_4();
						NLInner.meth_s1();
						System.out.println("내부 : " +a+","+bb);
						System.out.println("내부 스태틱 : " +sa+","+sc);
						meth_4();
						meth_s3();
						System.out.println("외부meth_3()끝--------------");
					}
				 void meth_4() {
						System.out.println("외부meth_4()");
					}
				 static void meth_s1() {
						System.out.println("외부meth_s1() 시작------------------");
//						System.out.println("외부 : "+NLInner.this.a+","+b);
						System.out.println("외부스태틱 : "+NLInner.sa+","+sb);
//						meth_2();
//						NLInner.this.meth_4();
						NLInner.meth_s1();
//						System.out.println("내부 : " +a+","+bb);
						System.out.println("내부 스태틱 : " +sa+","+sc);
//						meth_4();
						meth_s3();
						System.out.println("외부meth_s1() 끝------------------");
					}
				 static void meth_s3() {
						System.out.println("외부meth_s3()");
					}
				  NLInner(String aa, int bb) {
					this.a = aa;
					this.bb = bb;
					
					
				 }
				  @Override
				  public String toString() {
					return "NLInner [aa=" + a + ", bb=" + bb + "]";
				  }	 
		}
//		지역이너클래스는 정의
		NLInner ni = new NLInner("아기상어",3456);
		System.out.println("ni:"+ni);
		System.out.println("NLInner : "+NLInner.sa+"," +NLInner.sb);
		ni.meth_3();
		ni.meth_s1();
		
//		메소드 내부에 메소드 정의불가
//		void meth_1234() { }
		
		System.out.println("외부meth_1() : -------------------------------------끝");
	}
	void meth_2() {
		System.out.println("외부meth_2()");
	}
	void meth_4() {
		System.out.println("외부meth_4()");
	}
	static void meth_s1() {
		System.out.println("외부스태틱meth_s1() : ");
	}
	NLOuter(String a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "NLOuter [a=" + a + ", b=" + b + "]";
	}
}

public class NestedLocalMain {

	public static void main(String[] args) {
		NLOuter oo1 = new NLOuter("차은우",1234);
		System.out.println(oo1);
		oo1.meth_1();
//		NLOuter .NLInner ni

	}

}
