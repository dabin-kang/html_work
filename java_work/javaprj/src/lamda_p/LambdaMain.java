package lamda_p;

@FunctionalInterface //람다식 : 추상메소드가 1개인 인터페이스(함수형 인터페이스)
					//2개 이상의 추상메소드를 선언 할 수 없다

interface QwerP2{
	
//	리턴 있음, 매개 변수 2개
	String mmm(int a, int b);
	
	//String mmm(int a, int b);
}
interface QwerP1{
	
//	리턴 있음, 매개 변수 1개
	String mmm(int a);
}

interface QwerP0{
	
//	리턴 있음, 매개 변수 1개
	String mmm();
}

interface QwerRX{
	
//	리턴 없음, 매개 변수 1개
	void mmm();
}


class LamMem{
	String pid;
	int age;
	boolean marriage;
	@Override
	public String toString() {
		return "LamMem [pid=" + pid + ", age=" + age + ", marraige=" + marriage + "]";
	}
}


interface QwerMem{
//	리턴 LamMem, 매개변수 0개
	LamMem mmm();
}


class LamAAA{
	void meth_1() {
		System.out.println("meth_1() 이지롱");
	}
	
	void meth_2(QwerP2 qq) {
		System.out.println("meth_2()-------------------------------------------");
		
		qq.mmm(10 , 20);
		
		System.out.println("meth_2()끝-------------------------------------------");
	}
	
	void meth_11(QwerP1 qq) {
		System.out.println("meth_11()-------------------------------------------");
		
		String rr =qq.mmm(100);
		
		System.out.println("meth_11()끝"+rr);
	}
	
	void meth_00(QwerP0 qq) {
		System.out.println("meth_00()-------------------------------------------");
		
		String rr =qq.mmm();
		
		System.out.println("meth_00()끝"+rr);
	}
	
	void meth_rx(QwerRX qq) {
		System.out.println("meth_rx()-------------------------------------------");
		
		qq.mmm();
		
		System.out.println("meth_rx()끝");
	}
	


	void meth_mem1(QwerMem qq) {
		System.out.println("meth_mem1()-------------------------------------------");
		
		LamMem mem = qq.mmm();
		mem.pid = "루키아";
		mem.age= 27;
		mem.marriage = false;
		
		System.out.println("meth_mem1()끝"+mem);
	}
	
	void meth_mem2(QwerMem qq) {
		System.out.println("meth_mem1()-------------------------------------------");
		
		LamMem mem = qq.mmm();
		mem.pid = "켄파티";
		mem.age= 37;
		mem.marriage = true;
		
		System.out.println("meth_mem2()끝"+mem);
	}
}


class LamQQ implements QwerP2{
	@Override
	public String mmm(int a, int b) {
		System.out.println("LamQQ.mmm() 이지롱"+(a-b));
		return "아기상어";
		
	}
}


class MyLamb{
	public String wsxcde(int a, int b) {
		System.out.println("MyLamb.인스턴스 wsxcde()"+a+","+b);
		return"이치고";
	}
	
	public static String  mm_s(int a, int b) {
		System.out.println("MyLamb.인스턴스 mm_s()"+a+","+b);
		return"아이젠소스케";
	}
}

public class LambdaMain {

	public static void main(String[] args) {
		LamAAA la = new LamAAA();
		la.meth_1();
		
		LamQQ lq = new LamQQ();
		la.meth_2(lq);
		
		
		la.meth_2(new QwerP2(){
			@Override
			public String mmm(int a, int b) {
				System.out.println("생성시 재정의 mmm()"+(a+b));
				return"엄마상어";
			}
		});
		
		//람다식
		la.meth_2((a,b)->{
			System.out.println("람다식 mmm():"+a*b);
			return "아빠상어"; 
		});
		
		//람다식 : 메소드 정의 구간 {} 생략 및 리턴 값 바로 정의
		la.meth_2((a,b)->"할머니상어"+(b/a));

		la.meth_11((a)->"할아버지상어"+a);
		
//		매개변수 1개인 경우 () 생략 가능
		la.meth_11(a->"삼촌상어"+a);
		
		la.meth_00(()->"고모상어");
		
		//매개변수 0() 생략불가
		//la.meth_00(()->"고모상어");
		
		la.meth_rx(()->{
			System.out.println("리턴없이 람다식");
		});
		
		//리턴x {} 없이 리턴 값 불가
		//la.meth_rx(()->"고모상어");
		
		//메소드 참조
		MyLamb myl = new MyLamb();
		
		la.meth_2(myl::wsxcde);
		
//		스태틱 메소드 참조
		la.meth_2(MyLamb::mm_s);
		
		
//		생성참조
		la.meth_mem1(LamMem::new);
		la.meth_mem2(LamMem::new);
	}
}
