package test;


class TestRect {
	int wi;
	int hi;
	
	void AAA() {
		int sir = wi*hi;
		int are = (wi+hi)*2;
		System.out.println("사각형의 넓이 : " +sir);
		System.out.println("사각형의 둘레 : " +are);
	}
	
	TestRect(int wi,int hi) {
		this.wi = wi;
		this.hi = hi;
		String pname = "사각형";
		//AAA();
	}
	
	
}

public class Test7 {

	public static void main(String[] args) {
		TestRect tr= new TestRect(15, 20); 
		tr.AAA();
		
		TestRect tr1= new TestRect(45,46);
		tr1.AAA();
	}

}
