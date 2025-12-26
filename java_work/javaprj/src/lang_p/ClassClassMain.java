package lang_p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;

class ClAAA{
	int a= 10;
	String b = "ClAAA_b";
	private int c = 30, d = 40;
	
	public ClAAA() {
		System.out.println("기본생성자");
	}
	
	ClAAA(int a) {
		this.a = a;
		System.out.println("사용자정의생성자1");
	}

	public ClAAA(int a, String b) {
		this.a = a;
		this.b = b;
		System.out.println("사용자정의생성자2");
	}

	
	void meth_1() {
		System.out.println("meth_1 실행 : " +a +"," +b+","+c+","+d);
	}
	void meth_2(int aa, boolean bb) {
		System.out.println("meth_1 실행"+aa+","+bb);
	}
	String meth_3() {
		System.out.println("meth_3 실행");
		return"나는 문어";
	}
}


public class ClassClassMain {

	public static void main(String[] args) {
		ClAAA a1 =  new ClAAA();
		
		
		System.out.println("[[[정보가져오기]]]");
		Class clzz = a1.getClass();
		System.out.println(clzz);
		System.out.println("getName: "+clzz.getName());
		System.out.println("getSimpleName: "+clzz.getSimpleName());
		Package clpp = clzz.getPackage();
		System.out.println("getPackage: "+clpp);
		System.out.println("getName: "+clpp.getName());
		System.out.println("getPackage: "+clzz.getPackage());
		
//		멤버변수
		System.out.println("getDeclaredFields: "+
		Arrays.toString(clzz.getDeclaredFields()));

//		메소드
		System.out.println("getDeclaredMethods: "+
		Arrays.toString(clzz.getDeclaredMethods()));
		
//		생성자
		System.out.println("getDeclaredConstructors: "+
		Arrays.toString(clzz.getDeclaredConstructors()));
		
//		에러사항
//		Class aa =  null;
//		aa.getResource("fff/다운로드.png");
		
//		Class.getResource("fff/다운로드.png");
		
//		getResource = 파일 url 리턴, ClAAA 와 
//		파일이 관련 없어도 class객체를 생성하여 메소드 사용
		URL uu = clzz.getResource("../fff/다운로드.png");
		System.out.println(uu.getPath());
		
		
		
//		객체생성
		try {
//			Class nn = Class.forName("lang_p.ClA"); 존재하지 않는 클래스명 기재시 에러발생
			Class nn = Class.forName("lang_p.ClAAA");
			
			Object oo1 = nn.newInstance();
			Object oo2 = nn.newInstance();
			
			System.out.println("oo1 : " +oo1);
			System.out.println("oo2 : " +oo2);
			
			ClAAA a2 = (ClAAA)oo2;
			System.out.println("a2 :" +a2);
			System.out.println("a2.a :" +a2.b);
			a2.meth_1();
			a2.meth_2(100, true);
			String rr = a2.meth_3();
			System.out.println(rr);
			
//			newInstance는 매개변수를 직접넣어 처리 불가
//			Object oo3 = nn.newInstance(300, "나는 상어");
			
//			생성자 가져오기
			Constructor con  = nn.getConstructor(int.class,String.class);
		
			ClAAA a4 = (ClAAA)con.newInstance(400,"나는 고래");
			System.out.println("a4 :" +a4);
			System.out.println("a4.a :" +a4.b);
			a4.meth_1();
			a4.meth_2(100, true);
			
		
			
			
			System.out.println("[[[메소드 실행]]]");
			ClAAA a5 = new ClAAA();
			Class n5 = a5.getClass();
			
			
//			메소드 이름을 문자열로 로드
			Method mm = n5.getDeclaredMethod("meth_1");
			mm.invoke(a5);
			mm = n5.getDeclaredMethod("meth_2",int.class,boolean.class);
			mm.invoke(a5,679,false);
			mm = n5.getDeclaredMethod("meth_3");
			String rr5 = (String) mm.invoke(a5);
			System.out.println("rr5 : "  +rr5);
			
			
//			멤버변수를 문자열로 불러올 수 있다
			System.out.println("[[[멤버변수 실행]]]");
			System.out.println("[[[멤버변수 호출]]]");
			a5.a = 1234;
			a5.b = "캐롤인가";
			Field fa =  n5.getDeclaredField("a");
			Field fb =  n5.getDeclaredField("b");
			Field fc =  n5.getDeclaredField("c");
			Field fd =  n5.getDeclaredField("d");
			System.out.println("fa : "+fa);
			System.out.println("fa.get(a5) : "+fa.get(a5));
			System.out.println("fb : "+fb);
			System.out.println("fb.get(a5) : "+fb.get(a5));
			System.out.println("fc : "+fc);
//			System.out.println("fc.get(a5) : "+fc.get(a5));
			System.out.println("fd : "+fd);
			fd.setAccessible(true);//private 을 접근가능토록 변경
			System.out.println("fd.get(a5) : "+fd.get(a5));
//			System.out.println("a5.d : "+a5.d);   직접접근 불가
			a5.meth_1();
			System.out.println("[[[멤버변수 대입]]]");
			fa.set(a5, 5678);
			fb.set(a5, "흰눈사이로");
//			fc.set(a5, 369);  private 에러
			fd.set(a5, 480);//fd.setAccessible(true); private 을 접근가능토록 한다
			
			//대입 된 것을 확인
			a5.meth_1();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
