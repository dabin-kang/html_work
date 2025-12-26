package pac_1;

import pac_2.CCC;
//import pac_2.EEE;  //public 하지 않아서 가지고 올수가 없다
//import pac_2.FFF;
import pac_2.*;  // pac_2의 접근 가능한 모든 클래스 허용

class AAA{
	String a = "p1.AAA.a";
	private String d = "p1.AAA.private_d";//클래스 내부에서만 접근가능
	
	void mm1() {
		System.out.println("p1.AAA.mm1() 실행");
	}
	private void mm4() {
		System.out.println("p1.AAA.private_mm4() 실행");
	}
	void meth() {
		System.out.println("AAA.meth 시작-----------------");
		System.out.println(a+","+d);
		mm1();
		mm4();
		System.out.println("AAA.meth 끝-----------------");
	}
}

public class PacMain {

	public static void main(String[] args) {
		System.out.println("메인시작------------");
		
	// 자료형 변수= 변수공간생성	
		AAA p1a = new AAA();
		BBB p1b = new BBB();
		pac_1.CCC p1c = new pac_1. CCC();
		CCC p2c = new CCC();//다른 패키지에서 가져올때는 import pac_2.CCC;
		FFF p2f = new FFF();
		
		
		System.out.println("p1a.a:"+p1a.a);
		p1a.mm1();
//		System.out.println("p1a.d:"+p1a.d);
//		p1a.mm4();
//		p1a.meth();
		
		
//		BBB를 불러오기
		System.out.println("p1b.a:"+p1b.a);
		p1b.mm1();
		
		System.out.println("p1c.a:"+p1c.a);
		p1c.mm1();
		System.out.println("p2c:"+p2c);
		System.out.println("p2c.b:"+p2c.b);
		p2c.mm2();
		
		System.out.println("p2f.a:"+p2f.b);
		p2f.mm2();
		
		Gchild gc = new Gchild();
//		System.out.println("gc.a:"+gc.a); // publc만 가능
		System.out.println("gc.b:"+gc.b);
//		System.out.println("gc.c:"+gc.c);
//		System.out.println("gc.c:"+gc.d);
//		gc.mm1();
		gc.mm2();
//		gc.mm3();
//		gc.mm4();

	}

}
