package excep_p;

import java.util.Scanner;

//2차원 배열로 사용자 아이디, 비밀번호,이름 만들기
//클래스 , 클래스명
//String[][]이 원소 값을 지정한다0
class LoginData{
	//static  모든 인스턴스에서 공유할 수 있는 선언자
	static String[][] data = {
		{"aa","111","짱구"},
		{"bb","222","철구"},
		{"cc","333","맹구"},
		{"dd","444","훈이"},
		{"ee","555","유리"}
	};
}
 

public class LoginMain3 {
	public static void main(String[] args) {
	//Scanner는 클래스
	// sc변수에 인스턴스가 담긴다.
	// new Scanner 새로운 인스턴스를 생성하는 생성자
	// System.in = 멤버변수 , 자재
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("id출력 :");
	String id = sc.nextLine(); 
	
	//sc.nextLine()가 String를 반환해서 String로 받는다
	System.out.print("pw출력 :");
	String pw = sc.nextLine(); 
	
	// 로그인 성공 여부를 묻는다.
	boolean Succ = false;

//	for문안에서 선언하게 되면 for문 밖에서 사용할 수가 없다
//	그래서 전역으로 사용 할 수 있게 하기 위해서 밖에서 선언한다.
	String userName = "";
	
//	try catch에서 if문을 사용해서 사용자를 걸러낸다.
	try {
		//LoginData.length를 반복하여 값을 확인
		//ID와 pw가 일치하면 로그인 성공, 아니면 catch 출력
		//LoginData class안에 있는 data 배열 
		for(int i = 0 ; i <LoginData.data.length; i++ ) {
			String storeID = LoginData.data[i][0];
			String storePW = LoginData.data[i][1];
			/*static String[][] data = {
					[i] id[0] pw[1] 이름[2]
					[0]{"aa","111","짱구"},
					[1]{"bb","222","철구"},
					[2]{"cc","333","맹구"},
					[3]{"dd","444","훈이"},
					[4]{"ee","555","유리"}
				};*/
			
//		사용자가 입력한 id 값 && pw값 이 일치 하면 로그인 성공(true);
			if(id.equals(storeID)&&pw.equals(storePW)) {
				Succ = true;
				userName = LoginData.data[i][2];
//				Succ = true; 가 되면 break; 
				break;
			}
		}
		
		
//		로그인 성공이면 로그인환영합니다 표시 , 이외의 상황이면 로그인실패 출력
		if(Succ) {
			System.out.println(userName +"님" +"로그인환영합니다");
		} else {
			System.out.println("로그인 실패");
		}
		
	}catch(Exception e) {
		System.out.println("로그인 오류 "+e.getMessage());
	}
	
	
	//sc. 에서 호출한 close;
	sc.close();
	
	}
}

	




/*
 * 5명이 로그인시 로그인 축하합니다 
 * 메시지 띄우기
 * 
 * 로그인 성공시 이름으로 출력하세요
 * aa111짱구
 * bb222철구
 * cc333맹구
 * dd444훈이
 * ee555유리
 */
