package coll_p;


//generic : <QQ,EE>  => 타입의 추상화, 타입매개변수
class GenAAA<QQ,EE>{
	String a;
	QQ b;
	
	
	GenAAA(){
		System.out.println("GenAAA 기본 생성자 실행");
	}

	GenAAA(String a, QQ b) {
		this.a = a;
		this.b = b;
		System.out.println("GenAAA 사용자 정의 생성자 실행");
	}
	
	void meth_1(int c, EE e) {
		
		System.out.println("e출력하기 : "+e);
		System.out.println("meth_1:"+c+","+e);
	}

	@Override
	public String toString() {
		return "GenAAA [a=" + a + ", b=" + b + "]";
	}
}



public class GenericsMain {

	public static void main(String[] args) {
		GenAAA a1 = new GenAAA();
		a1.a = "아기상어"; 
		a1.b = "엄마상어";
		a1.b = new int[] {11,22,33};
		a1.b = true;
		System.out.println(a1);
		
		a1.meth_1(123, 123.456);
		a1.meth_1(456, "나는 무운어");
		
		System.out.println("-------------------------------------");
		GenAAA a2 = new GenAAA<String, String>();
		a2.a ="채치수";
		a2.b ="정대만";
		a2.b = 789;
		//a2.e = "야구공";
		//System.out.println("a2.e : " +a2.e);
		int c = (int)a2.b; //형변환해야 한다
		
		
		a2.b = false;
		System.out.println(a2);
		a2.meth_1(333, 444);
		a2.meth_1(555, "나는고래");
		
		System.out.println("-------------------------------------");
		GenAAA a3 = new GenAAA<Integer, Integer>("서태웅",666);
		System.out.println(a3);
//		GenAAA a4 = new GenAAA<integer, integer>("서태웅",강백호"); // 타입이 맞지 않아서 에러
//		System.out.println(a4);
		
		System.out.println("-------------------------------------");
		GenAAA<Integer,Boolean> a5 = new GenAAA();
		a5.a = "신준섭";
//		a5.b = "성현준";
		a5.b = 777;
		c = a5.b;
		
		System.out.println(a5);
//		a5.meth_1(888, 999);
		a5.meth_1(135, true);
		
		

	}

}
