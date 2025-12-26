package excep_p;

import java.util.Scanner;


public class ThrowLoginMain2 {
	static Scanner sc = new Scanner(System.in);
	static void CCC () throws Exception{
		
			System.out.print("ID:");
			String pid = sc.nextLine();
			
			if(!pid.equals("AAA")) {
				throw new Exception("id 에러");
			}
			
			System.out.print("PW:");
			String pw = sc.nextLine();
			
			
			if(!pw.equals("1234")) {
				throw new Exception("pw 에러");
			}
			
			System.out.println(pid+"+로그인 성공");
			
			//break;
	}
	
	
	public static void main(String[] args) {
		
		
		while(true) {
			try {
				CCC() ;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		//System.out.println("종료-------------------");
	}

}
