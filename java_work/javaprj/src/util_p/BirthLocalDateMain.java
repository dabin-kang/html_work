package util_p;

public class BirthLocalDateMain {
	//주민번호,생일,나이,올해생일 인스턴스 변수를 선언
	// 주민번호가 길어서 int 대신에 문자String 로 선언하고 받는다
	String jumin ;
	int birth;
	int age;
	int nybirth;
	
	
	//inner class Birjm , 이너클래스라서 static을 붙인다.
	static class Birjm{
		String jumin ;
		int birth;
		int age;
		int nybirth;
		
//		생성자 : 주민번호를 받는다
		Birjm(String jumin){
			this.jumin = jumin;
		}
	}	

	public static void main(String[] args) {
		//주민번호를 만든다
		Birjm jj = new Birjm ("9401241866375");
		
//		util_p.BirthLocalDateMain$Birjm@5305068a
		System.out.println(jj);
		
		
		//주민번호에서 생일을 가져오기
		Birjm birthDate(String jumin) {
			
		}
	}

}

/*
 * 주민번호 를 이용한다
 * 생년월일
 * 나이
 * 올해 생일
 * 
 */