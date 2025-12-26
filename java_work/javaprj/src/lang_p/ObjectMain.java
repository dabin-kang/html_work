package lang_p;

import java.util.Objects;

class OOAAA{
	public static final String hashCode = null;
	int a,b;

	public OOAAA(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/*@Override
	public String toString() {
//		return "와 리턴이야";
		return "[" +getClass().getName() +":" +a +"," +b  +"]";
		
	@Override
//	                     객체면 모든 끝에는 obj가 있어서 매개변수로 받는다.
	public boolean equals(Object obj) {
		OOAAA you = (OOAAA)obj;
		return a == you.a;
	}}*/

	@Override
	public String toString() {
		return "OOAAA [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OOAAA other = (OOAAA) obj;
		return a == other.a;
	}
}
class OOBBB {
	
}

public class ObjectMain {

	private static String bb;
	private static String aa;

	public static void main(String[] args) {
		OOAAA a1 = new OOAAA(10,20);
		OOAAA a2 = new OOAAA(10,20);
		OOAAA a3 = a1;
		OOAAA a4 = new OOAAA(10,40);
		OOAAA a5 = new OOAAA(30,20);
		OOBBB b1 = new OOBBB();
		OOBBB b2 = new OOBBB();
		
		
		System.out.println("a1:" +a1);
		System.out.println("a2:" +a2);
		System.out.println("a3:" +a3);
		System.out.println("a4:" +a4);
		System.out.println("a5:" +a5);
		
		//.toString() 문자형태로 호출시 실행
		System.out.println("tostring()>>>>>>>>>");
		
		System.out.println("a1:" +a1.toString());
		System.out.println("a2:" +a2.toString());
		System.out.println("a3:" +a3.toString());
		System.out.println("a4:" +a4.toString());
		System.out.println("a5:" +a5.toString());
		
		System.out.println("tostring()>>>>>>>>>");

		
		System.out.println(" ==" );
		System.out.println("a1 == a2 " +(a1 == a2));
		System.out.println("a1 == a3 " +(a1 == a3));
		System.out.println("a1 == a4 " +(a1 == a4));
		
		System.out.println(" equals() " );
		System.out.println("a1 == a2 " +a1.equals(a2));
		System.out.println("a1 == a3 " +a1.equals(a3));
		System.out.println("a1 == a4 " +a1.equals(a4));
		System.out.println("a1 == a5 " +a1.equals(a5));
		
		
		System.out.println(" getClass() " );
		System.out.println("a1 . getClass() " +a1.getClass());
		System.out.println("a2 . getClass() " +a1.getClass());
		System.out.println("a3 . getClass() " +a1.getClass());
		System.out.println("a4 . getClass() " +a1.getClass());
		System.out.println("a5 . getClass() " +a1.getClass());
		
		
		System.out.println("aa:" +aa);
		System.out.println("bb:" +bb);
		System.out.println("aa.getName()" +aa.getName());
		System.out.println("bb.getName()" +bb.getName());
		System.out.println("a1.getClass().getName()" +a1.getClass().getName());
		
		
		System.out.println(" hashCode()" );
		System.out.println("a1.hashCode() " +a1.hashCode);
		System.out.println("a2.hashCode() " +a2.hashCode);
		System.out.println("a3.hashCode() " +a3.hashCode);
		System.out.println("a4.hashCode() " +a4.hashCode);
		System.out.println("a5.hashCode() " +a5.hashCode);
		
		
	}

}
