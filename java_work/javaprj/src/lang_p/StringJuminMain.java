package lang_p;

import java.util.Scanner;

public class StringJuminMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");
		
		String str = sc.nextLine();
		System.out.println(str);
		
		
		String yy = str.substring(0,2);
		String mm = str.substring(2,4);
		String dd = str.substring(4,6);
		
		System.out.print(yy +"년생");
		System.out.print(mm +"월");
		System.out.print(dd +"일");
		
		char ss = str.charAt(6);
		if(ss == '1') {
			System.out.print("	남자 ");
		}else {
			System.out.print(" 여자 ");
		}
		
		char ko = str.charAt(7);
		if(ko == '1') {
			System.out.print("	외국인 ");
		}else {
			System.out.print(" 내국인 ");
		}
		
	}
}


//000000 - 0000000
/*주민번호를 이용하여
 * 성별,국적,생년월일,한국나이, 만나이를
 * 출력하세요
 * 
 * 1900년대 내국인 남성,여성
 * 2000년대 내국인 남성,여성
 * 1900년대 외국인 남성,여성
 * 2000년대 외국인 남성,여성
 * 
 * 
 * -------------------------------
 * 
 * 주민번호를 입력한다
 * 주민번호 length()를 출력한다
 * 맨 앞의 6자리는 태어난 생년 YY, 생월 mm , 생일 , dd
 * 
 * 뒷자리 7 자리 중 첫번째 숫자는 남,여를 구분한다 
 * 1 = 남 , 2 = 여
 * 
 * 뒷자리 두번째는 내,외국인을 구분 한다
 * 1 = 내국인 , 2 = 외국인
 * 
 */
