package lang_p;

import java.util.Scanner;

public class RspMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] title = "가위,바위,보".split(",");
		
			System.out.println("0.가위,1.바위,2.보 :");
			int no = sc.nextInt();
			
			int com = (int)(Math.random());
			
			System.out.println("com : " +com);
		
	}
	
}


/*
 * 가위 바위 보 만들기
 * rock , scissor, page
 * 0.1.2
 * 
 * 가위 : 패 < 바위 : 승
 * 바위 : 패 < 보  : 승
 * 보  : 패 < 가위 : 승
 * 가위 = 가위 : 무승부
 * 바위 = 바위 : 무승부
 * 보 = 보 	: 무승부 
 * 게임종료 ; 
 */
