package lang_p;

public class MethMain {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		//지수
		System.out.println(Math.E);
		
		System.out.println("ceil--------------");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(987.456));
		System.out.println(Math.ceil(-987.456));
		
		//반올림
		System.out.println("floor--------------");
		System.out.println(Math.floor(123.456));
		System.out.println(Math.floor(-123.456));
		System.out.println(Math.floor(987.456));
		System.out.println(Math.floor(-987.456));
		
		//정수
		System.out.println("round--------------");
		System.out.println(Math.round(123.456));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.round(987.456));
		System.out.println(Math.round(-987.456));
		
		//절대값
		System.out.println("abs--------------");
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(-123.456));
		
		System.out.println("min_max--------------");
//		System.out.println(Math.min(10,20,5,8));
		System.out.println(Math.max(10,20));
		
		
		System.out.println("삼각함수--------------");
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(30*Math.PI/180));
		System.out.println(Math.cos(30*Math.PI/180));
		System.out.println(Math.tan(30*Math.PI/180));
		
		//각도
		System.out.println("각도--------------");
		System.out.println(Math.atan2(1,1));
		System.out.println(180*Math.atan2(1,1)/Math.PI);
		
		
		System.out.println(Math.pow(2,4));
		System.out.println(Math.sqrt(2));
		
		
		System.out.println(Math.random());
	
		
		

	}

}
