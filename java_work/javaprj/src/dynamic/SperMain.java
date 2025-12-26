package dynamic;

// 부모
class Dia{
	String pname;
	double are , sir;
	
	//ppp를 선언만 한 것
	void ppp() {
		System.out.println(pname +" , "+"넓이 : " +are +" , "+"둘레 : " +sir);
	}
}

//자식
class Sc extends Dia{
	Sc(String pname, int RR , double pai){
		this.pname = "원";
		are = (RR*RR)*pai;
		sir = RR*pai;
	}
}


//자식
class Sq extends Dia{
	Sq(String pname, int wi , double hi){
		this.pname = "직사각형";
		are = (wi*hi);
		sir = (wi*hi)*2;
	}
}


public class SperMain {

	public static void main(String[] args) {
		new Sc("원" , 15 ,3.14).ppp();
		new Sq("직사각형" , 15 ,30).ppp();

	}

}











/*도형 클래스를 구현하세요
 *  부모: 도형 -- 이름 , 넓이 둘레
 * 
 * 
 * 자식   넓이  둘레
 * 직사각형
 * 원
 * 직각삼각형
 * */
