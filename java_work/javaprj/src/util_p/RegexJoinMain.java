package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexJoinMain {
	//데이터 입력받기
	class User{
		String pid ;
		int pw ;
		String pemail;
		String pname;
		String jumin ;
		String pic;
		
	}
	
	//매서드로 받기	
	void setPid(String pid) {
		this.pid =pid;
		System.out.println(pid);
	}
	
	
	//찍어내기
	
	
	public static void main(String[] args) {
		
		//클래스로 받기
		User user = new User();
		 user.setPid ("honggildong");
//		 user.pw = (123456);
//		 user.pemail ("zozo@naver.com");
//		 user.pname ("조로길동");
//		 user.jumin ("9101241954683");
//		 user.pic ();
		};
	
	// 출력하기


}

/*
 * 회원가입 유효성 검사
 * 아이디 : 영문 숫자 조합(4자이상)
 * 비번 , 비번확인(5자이상,대소문자.특수문자조합)
 * 이메일 - 아이디:영문,숫자(3글자이상)@ 도메인: 영문 .
 * 이름 (한글만 가능) 2~5자
 * 주민번호
 * 사진 첨부 - 영문,숫자(3글자 이상). 이미지 확장자
 * 
 * 우편번호 검색(구단위) - 초성검색
 * 예외처리로 할 것
 * 
 * ------------------------------------------
 * 정보 입력
 * 유효성 검사
 * 정상이면 출력하기
 */
