// 생성시의 재정의 하기
package dynamic;


//추상메소드가 정의된 경우 클래스도 추상화 해야 한다
abstract class AbsPar{
	String a = "부모a";
//	abstract String b;  추상화는 메소드에만 적용 가능
	
	void meth_1() {
		System.out.println("부모 meth_1 실행");
	}
	
	//추상화 : 메소드의 정의가 없음
	abstract void meth_2();
}

//추상클래스를 상속받는 경우 추상메소드를 반드시 재정의 해야한다.
class AbsChild extends AbsPar{
	void meth_2() {
		System.out.println("부모 meth_2 실행");
	}
	
}

public class AbstractMain {
	
	

	public static void main(String[] args) {
		
//		AbsPar pp= new AbsPar();
		AbsPar pp1 = new AbsPar() {
			void meth_2() {
				System.out.println("부모생성시 재정의 meth_2 실행");
			}	
		};
		
		pp1.meth_1();
		pp1.meth_2();
		AbsChild cc1 = new AbsChild ();
		cc1.meth_1();
		cc1.meth_2();
		
		
		AbsChild cc2 = new AbsChild () {
			int cnt =0 ;
			void meth_1() {
				System.out.println("자식 생성시 재정의 meth_1 시작------"+a+"," +cnt);
				meth_3();
				System.out.println("자식 생성시 재정의 meth_1 끝------");
			}
			void meth_2() {
				System.out.println("자식 생성시 재정의meth_2 실행");
			}
			void meth_3() {
				cnt++;
				System.out.println("자식 생성시 재정의meth_3 실행");
			}
		};
		cc2.meth_1();
		cc2.meth_2();
//		cc2.meth_3();
		System.out.println("cc2.a:" +cc2.a);
//		System.out.println("cc2.cnt:" +cc2.cnt);
		cc2.meth_1();
		cc2.meth_2();
		cc2.meth_1();
		cc2.meth_2();
		cc2.meth_1();
	}

}
