package basic_p;

public class VarMain {

	public static void main(String[] args) {
		var a1 = 10; // 가변 자료형 - int
		// let a2 =20;   존재하지 않음
		// a3 =30;		 존재하지 않음
		//const a4 = 40; 존재하지 않음
		final int a5 =50; // 상수화
		
		System.out.println(a1);
		System.out.println(a5);
		//a1 =123.456;  최초 대입되는 변수 값으로 자료형 결정
		a1 =123;
		//a5 = 60 대입불가
		System.out.println(a1);
		
		
		
		byte bb = 123;
		//System.out.println(``); ``은 사용할 수 없다
		System.out.println("bb:" +bb);
		//bb =128; byte : -128 ~ 127
				
				
		short sh =128;
		System.out.println("sh:"+sh);
		sh = 32767;
		System.out.println("sh:"+sh);
		//sh = 32768;  short: -32768 ~ 32767까지 
		
		int ii = 32768;
		System.out.println("ii:"+ii);
		ii = 2147483647;
		System.out.println("ii:"+ii);
		//ii = 2147483648;
		//System.out.println(2147483648);
		//정수 기본 자료형 : int -> int의 볌주를 넘어갈 경우 long으로 처리
		System.out.println(2147483648L);
		//정수L = long 이라는 뜻, L을 붙여야 long으로 알수 있다.
		//ii = 2147483648L;
		
	
		long lo =  2147483648L;
		System.out.println(lo);
		lo = 9223372036854775807L;
		System.out.println(lo);
		//lo = 9223372036854775807L;
		
		
		//ii = 123.456; int는 실수 대입불가
		
		float ff = 123.456F;
		//실수의 기본 자료형 double로 고정 되어있어서 f,F를 붙여서 float로 만들어 준다
		System.out.println(ff);
		ff = 678;
		System.out.println(ff); // 678.0 으로 출력이 된다
		
		
		double dd = 123.456;
		System.out.println(dd);
		dd = 789;
		System.out.println(dd);
		
		
		
		//문자 char
		char ch = 'a'; // 한글자만 허용
		System.out.println(ch);
		//ch = "a";
		//ch = '';
		//ch = 'ab';
		ch = '가';
		System.out.println(ch);
		
		
		
		
		boolean bo = true;
		System.out.println(bo);
		bo = false;
		System.out.println(bo);
		
		
		
		
		String tt = "아기상어";
		System.out.println(tt);
		String tt2 = new String("아기상어");
		System.out.println(tt2);
		
		
		
		
		
	}

}
