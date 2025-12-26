package lang_p;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperMemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("확장자 입력 : ");
		System.out.println("부서명 입력 : ");
		String str = sc.nextLine();
//		
//		System.out.println("이름 입력 : ");
//		System.out.println("입사일 입력 : ");
		
		
		
		int hh = str.indexOf(".");
		String jj = str.substring(0,3);
		String i1 = str.substring(0,2);
//		String i2 = str.substring(3,6);
			
		if(jj.equals("jpg") ||jj.equals("png")) {
			System.out.println("입력가능");
		}else {
			System.out.println(jj +"등록불가능");
		}

	}

}


/*
 * 사진파일을 확인
 * ex> 영업_홍길동_20110823.jpg
 * 이미지파일만 가능
 * 파일명이 부서명,회원이름,입사일이 될것
 * 입사년도는 숫자만 입력토록 함(8자리만 가능)
 * 호봉수를 계산(년 단위에서 절삭)
 * 성명은 2~4자만 기록가능
 * 
 */ 
