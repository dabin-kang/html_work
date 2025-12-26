package inter_p;

//인터페이스 정의
interface InA{
	//멤버상수 : static, final이 기본
	int a = 10 , b = 20;
	
	void meth_2();	 //일반메소드 정의 불가
	void meth_3();  //public, abtract 가 기본
}


interface InB{
	//멤버상수 : static, final이 기본
	int a = 1234 , c = 5678;
	
	void meth_2(); 
	void meth_4();  
}

//인터페이스 다중 상속 가능
interface InToT extends InA, InB{
	
}


//class InASDF implements InA, InB{
class InASDF implements InToT{
	
	String a = "InASDF.a이지롱";
	public void meth_2() {
		System.out.println("InASDF 재정의 meth_2():" +a+","  +b +"," +c);
	}
	public void meth_3() {
		System.out.println("InASDF 재정의 meth_3()");
	}
	public void meth_4() {
		System.out.println("InASDF 재정의 meth_4()");
	}
}



public class InterfacerMain {

	public static void main(String[] args) {
		InA ia = new InA() {
		public	void meth_2() {
			System.out.println("ia 생성시 재정의 meth_2()");
		}
		public	void meth_3() {
			System.out.println("ia 생성시 재정의 meth_3()");
		}
		};
		System.out.println("ia:" +ia);
		System.out.println("ia:" +ia.a +"," +ia.b);
		// ia.a = 1000;
		System.out.println("InA :"+InA.a +"," +InA.b);
		ia.meth_2();
		ia.meth_3();
		
		InASDF asdf = new InASDF(); 
		System.out.println("asdf :" +asdf );
//		System.out.println("asdf :" +asdf.a +"," +asdf.b);
		System.out.println("asdf :"+asdf.a +"," +asdf.b +"," +asdf.c);
		asdf.meth_2();
		asdf.meth_3();
//		asdf.meth_4();
		
		System.out.println("iia-------------------------");
		
		InA iia = asdf;
		System.out.println("iia:"+iia);
		System.out.println("iia:"+iia.a+","+iia.b);
		iia.meth_2();
		iia.meth_3();
//		iia.meth_4();
		
		System.out.println("iib-------------------------");
		
		InB iib = asdf;
		System.out.println("iib:"+iib);
		System.out.println("iib:"+iib.a+","+iib.c);
		iib.meth_2();
//		iib.meth_3();
		iib.meth_4();
	}

}
