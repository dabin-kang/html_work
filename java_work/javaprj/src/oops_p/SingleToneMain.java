package oops_p;

class SingTTT{
	
	String a = "장동건";
	int b = 10;
	
	private static SingTTT me = null;
	
	private SingTTT() {
		System.out.println("기본생성자 실행");
	}
	public static  SingTTT getInstance() {
		if(me == null) {
			me = new SingTTT ();
		}
		return me;
	}
	@Override
	public String toString() {
		return "SingTTT [a=" + a + ", b=" + b + "]";
	}
	
}

public class SingleToneMain {

	public static void main(String[] args) {
//		SingTTT  st = new SingTTT();
//		System.out.println(SingTTT.me);
		
		SingTTT st1 = SingTTT.getInstance();
		System.out.println("------------------------------------");
		SingTTT st2 = SingTTT.getInstance();
		System.out.println("------------------------------------");
		st1.a = "원빈";
		st2.b = 20;
		System.out.println(st1 == st2);
		System.out.println(st1);
		System.out.println(st2);
	}

}
