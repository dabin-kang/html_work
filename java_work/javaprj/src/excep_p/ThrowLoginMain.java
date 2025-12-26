package excep_p;

import java.util.Scanner;

class ThrowLO extends Exception{
	String [] arr =  {
			"사용자예외처리",
			"빈칸에러",
			"특수기호유효성에러",
			"숫자만 가능",
			"pw 에러"
			};
	
	ThrowLO(String GG) {
		System.out.println("gg : "+GG);
		System.out.println(arr[1]);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return arr[0];
	};
	
	
}


public class ThrowLoginMain {
	
	static void LoginM(String pid) throws Exception {
		if(!pid.equals("AAA") && !pid.equals("BBB")) {
			throw new Exception("id 에러");
		}
	}
	static void Pw(String pw) throws Exception {
		if(!pw.equals("1234") && !pw.equals("1235")) {
			throw new ThrowLO("pw 에러");
		}
	}
	
	
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		//AAA, 1234
		//BBB, 5678
		while(true) {
			try {
				System.out.print("ID:");
				String pid = sc.nextLine();
				
				
				LoginM(pid);	//아이디비교
				
	
				System.out.print("PW:");
				String pw = sc.nextLine();
				
				Pw(pw);
				
				if(pid.equals("AAA")&&pw.equals("1234")){
					System.out.println(pid+"+로그인 성공");
				}
				
				break;
				
			}catch(Exception e) {
				System.out.println("main > "+e.getMessage());
			}
		}
		System.out.println("종료-------------------");

	}

}
