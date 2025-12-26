package basic_p;

public class CastingMain {

	public static void main(String[] args) {
		byte bb = 123;
		int a = bb; // 자동형변환(upcasting,묵시적형변환)
		long lo = a;
		
		System.out.println(bb);
		System.out.println(a);
		System.out.println(lo);
		lo = 9223372036854775807L;
		System.out.println(lo);
		

		float ff = bb;
		System.out.println(ff);
		ff = a;
		System.out.println(ff);
		ff = lo;
		System.out.println(ff);
		
		char ch = 'c';
		System.out.println(ch);
		a = ch;
		System.out.println(a);
		
		
		System.out.println("강제형변환(downcasting, 명시적 형변환)");
		a = 100;
		//bb = a;
		bb = (byte)a;
		System.out.println(bb);
		a = 130;
		//bb = a;
		bb = (byte)a;
		System.out.println(a);
		System.out.println(bb);
		
		
		double dd = 123.456;
		a = (int)dd;
		System.out.println(dd);
		System.out.println(a);
		a = 100;
		ch = (char)a;
		System.out.println(a);
		System.out.println(ch);
		
		boolean bo = true;
		//a = (int)bo;  형변환 불가
		a = 1;
		//bo = (bolean)a;
		
		
	}

}
