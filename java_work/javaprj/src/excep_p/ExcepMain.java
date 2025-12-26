package excep_p;
// 기본 패키지 묶음 .
import  java.lang.ArithmeticException;

public class ExcepMain {

	public static void main(String[] args) {
		
		try {
			System.out.println("실행 1");
			int a = 10/2;//Arithmetic 에러 발생 --> 예외처리 구간 있는지 확인  
						 //->catch 구간으로 던지기
						 // 값이 바르게 실행되지 않으면 "실행 2"를 건너뛰고 "수학적 예외처리 발생"으로 이동->메인종료
						 //값이 바르게 실행되면 "실행 2"가 출력되고 --> 메인종료로 이동한다
			
			System.out.println("실행 2:" +a);
			
			int [] arr = {11,22,33};
			System.out.println("실행 3:" +arr[2]);
			
			String ttt = "onop";
			ttt = null;
			System.out.println("실행 4:" +ttt +"," +ttt.toLowerCase());
			
		
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 예외처리 발생:"+e.getMessage()+a); 구간이 다르면 변수를 인식 할 수 없다
			System.out.println("배열 예외처리 발생:"+e.getMessage());
			return;
			//매서드 탈출 할때 사용 return , 반환 값을  가지고 갈수 있다 없다
			
			
			// 상위 클래스가 하위 클래스 보다 밑에 존재해야 한다.
		}catch(Exception e) {
			System.out.println("수학적 예외처리 발생:"+e.getMessage());
//			e.printStackTrace();
			
			try {//catch ~try 안에 catch ~try가 중첩이 가능하다
				System.out.println("catch ~try 시작");
				int bb = 1234/0;
				System.out.println("catch ~try 끝");
			}catch(Exception e2) {
				System.out.println("catch ~ catch 실행" +e2.getMessage());
			}
			
			
			
			// try ~ catch 구간 실행 후 마지막 구문 실행시, 
		} finally {
			System.out.println("메인종료:");
		}
	}
}
