package test;

import java.util.Arrays;

class TestSwitch {
	// a = 10; b = 20; a,b 를 출력 a,b값을 바꿔서 다시 한번 출력
	int a;
	int b;
	
	TestSwitch(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void meth_1() {
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	/////////////////
	}
	
	void meth_2() {
		int c = a;
		int d = b;
		b = c;
		a = d;
	}
	
	
	void meth_3() {
		System.out.println("결과");		
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	}
	
	void meth_4() {
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

public class Test_02 {
	

	public static void main(String[] args) {
		TestSwitch ts = new TestSwitch(10, 20); 	//10, 20
		
		ts.meth_1();
		ts.meth_2();
		ts.meth_3();
		ts.meth_4();
		
		TestSwitch ts3040 = new TestSwitch(30, 40); 	//30, 40 - 멤버변수에 값을 주고 싶을때는 생성자에 값을 넘겨준다.
		ts3040.meth_1();
		ts3040.meth_2();
		ts3040.meth_3();
		ts3040.meth_4();
	}

}
