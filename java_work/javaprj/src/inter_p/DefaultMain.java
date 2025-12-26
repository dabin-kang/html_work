package inter_p;
	//implements  클래스가 인터페이스에 정의된 메서드들을 구현하겠다
	// 클래스가 :이 인터페이스의 기능을 갖춘다 " 라고 선언 하는 것
interface InDD2 {
	void meth_2();
	void meth_3();
	
	//InDD에도 같은 이름의 메소드가 정의되어 있음 -meth_6();
	default void meth_6() {
		System.out.println("InDD2 meth_6() 실행");
	}	
	default void meth_8() {
		System.out.println("InDD2 meth_8() 실행");		
	}
}
	
//메소드 재정의 를 하면 사용 할 수 있다.
//interface InDDToT extends InDD,InDD2{
//	@Override
//public void meth_6() {
//	System.out.println("InDDToT meth_6() 실행");
//	
//}
//}

	class ClaInDD implements InDD , InDD2 {

		@Override
		public void meth_1() {
			System.out.println("ClaInDD meth_1() 실행");
			
		}

		@Override
		public void meth_3() {
			System.out.println("ClaInDD meth_3() 실행");
			
		}

		@Override
		public void meth_4() {
			System.out.println("ClaInDD meth_4() 실행");
			
		}

		@Override
		public void meth_5() {
			System.out.println("ClaInDD meth_5() 실행");
		}
		
		//중첩 된 meth_6을 재정의
		@Override
		public void meth_6() {
			System.out.println("ClaInDD2 meth_6() 실행");
		}
		
		@Override
		public void meth_7() {
			System.out.println("ClaInDD meth_7() 실행");
					
		}
		
	}
	
public class DefaultMain {

	public static void main(String[] args) {
		ClaInDD cdd = new ClaInDD();
		cdd.meth_1();
		cdd.meth_3();
		cdd.meth_4();
		cdd.meth_5();
		
		// 중첩되어서 재정의 한 meth_6() 을 호출
		cdd.meth_6();
		cdd.meth_7();

	}

}
