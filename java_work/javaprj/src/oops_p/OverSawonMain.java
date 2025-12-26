package oops_p;
	class OverSawonData{
		//부서명 변수 선언
		String title;
		
		//사원명 ,사원번호,연봉,특기, 실적건수 매개변수 선언
		String Sname,Snum,ymo,abl,sg;
		
	}
	
	
	
	class OverSawonCo {
		OverSawonData[] oversawondata = {
			
		};
	}



public class OverSawonMain {

	public static void main(String[] args) {
		
		System.out.println();
	}

}



/*
 * 사원 명단을 출력
 * 멤버는 클래스로 정의
 * 클래스 요소는 부서마다 다름
 * 총무부 - 사원명, 사원번호, 연봉
 * 웹부 - 사원명,사원번호,연봉, 특기
 * 영업부 - 사원명 , 사원번호 , 실적건수
 * 같은이름의 메소드로 출력하세요(오버로딩)
 * 
 */