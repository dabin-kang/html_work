package oops_p;


class StaticCla{
	String a = "인스턴스 a";
	int b = setB();
	int c = setC();
	int d = 40;
	int e = setE();
	int f = setF();
	
	
	StaticCla(){
		System.out.println("생성자");
	}
	
	int setB() {
		System.out.println("인스턴스  setB() 실행");
		return 10;
	}
	
	int setC() {
		System.out.println("인스턴스  setC() 실행");
		return 20;
	}
	int setE() {
		System.out.println("인스턴스  setE() 실행"+d);
		return d;
	}
	int setF() {
		System.out.println("인스턴스  setF() 실행"+g);
		return g;
	}
	void meth_1() {
		System.out.println("인스턴스 meth_1() 실행:" +a +"," +b +"," +c+"," +d+"," +e+"," +f+"," +g);
		System.out.println("인스턴스 meth_1() 스태틱:" +sa +"," +sb +"," +sc+"," +sd+"," +se+"," +sf);
		meth_2();
		meth_s2();
		System.out.println("인스턴스 meth_1끝 -----------------------------");
	}
	
	void meth_2(){
		int i = 1357;
		System.out.println("인스턴스  meth_2 실행:"+i);
		
		//매소드 안에서 매소드 정의 불가
//		void methSub() {
			
//		}
	}
	static void meth_s2(){
		int i = 2468;
//		static int j = 7766;
		System.out.println("스태틱 meth_s2 실행"+i);
	}
	
	int g = 70;	
	
	static int sa = 100;
//	static int sb = setB();
	static int sb = setSB();
	static int sc = 300;
	static int sd = setSD();
	static int se = setSE();
	static int sf = 600;
	
	static int setSB() {
		int rr = 200;
		System.out.println("스태틱 setSB() 실행:" +rr);
		return rr;	
	}
	static int setSD() {
		System.out.println("스태틱 setSD() 실행"+sc);
		return sc;	
	}
	static int setSE() {
		System.out.println("스태틱 setSE() 실행"+sf);
		return sf;	
	}
	
	static void meth_s1() {
		System.out.println("스택틱 meth_s1() 실행:" +sa +"," +sb +"," +sc+"," +sd+"," +se+"," +sf);
		meth_s2();
		System.out.println("스태틱 meth_s1 끝 ---------------------------------");
	}
}


public class StaticMain {
	
	int a = 2345;
	static int sv = 5678;
	
	public StaticMain() {
		System.out.println("main 생성자");
		System.out.println(a+","+sv);
	}

	public static void main(String[] args) {
//		System.out.println(StaticCla);
//		System.out.println(StaticCla.sa);
		StaticCla.meth_s1();
		StaticCla.sa = 1111;
		StaticCla.meth_s1();
		System.out.println("-----------------------------");
		StaticCla s1 = new StaticCla();
		System.out.println("-----------------------------");
		StaticCla s2 = new StaticCla();
		System.out.println("-----------------------------");
		s1.b = 101010;
		s2.c = 2345;
		s1.sb = 2468;
		s2.sc = 3210;
		s1.meth_1();
		s2.meth_1();
		System.out.println("-----------------------------");
		new StaticMain(a +sv);
	}

}


// 스태틱은 인스턴스들이 공용으로 사용한다.
