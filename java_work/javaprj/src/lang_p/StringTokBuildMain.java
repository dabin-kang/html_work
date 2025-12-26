package lang_p;

import java.util.StringTokenizer;

public class StringTokBuildMain {

	public static void main(String[] args) {
		String a= "농구-축구,배구.탁구,,야구,족구";
		System.out.println("StringTokenizer------------------------");
//		원소를 하나씩 가져오기
//		java.util
		StringTokenizer stk = new StringTokenizer(a,",.-");
		
		System.out.println(stk);
		
		while(stk.hasMoreElements()) {
			String bb = stk.nextToken();
			System.out.println(bb);
		}
		System.out.println("stk 종료------------------------");
		
		
//		String = 변할수 없는 문자열 클래스
		a = "아기상어";
		String b = a+"	엄마상어";
		System.out.println(b);
		
		
		System.out.println("StringBuilder------------------------");
//		java.lang
//		StringBuilder 변수의 값을 변할 수 있게 만들어주는 문자열 클래스
//		단일쓰레드 환경에서 우수
		StringBuilder sbr = new StringBuilder("아기상어");
		sbr.append(" 엄마상어").append(" 할빠상어");
		System.out.println(sbr);
		sbr.append(" 엄마상어").append(" 할빠상어");
		sbr.insert(6,"1234");
		System.out.println(sbr);
		sbr.replace(7, 11, "두둥두둥");
		System.out.println(sbr);
		
//		뭉탱이로 지우기
		sbr.delete(10, 13);
		System.out.println("삭제하기 "+sbr);
		
//		하나씩 삭제하기
		sbr.deleteCharAt(3);
		System.out.println("deleteCharAt삭제하기 "+sbr);
		sbr.reverse();
		System.out.println("reverse"+sbr);
		
		
		System.out.println("StringBuffer------------------------");
//		StringBuffer = 가변 문자열 클래스 -- 멀티쓰래드 환경에서 우수
//		java.lang
		StringBuffer sbuf = new StringBuffer("아기상어");
			sbuf.append("엄마상어").append(" 할빠상어");
			sbuf.insert(6,"15634");
		System.out.println(sbuf);
		sbuf.replace(7, 11, "가로세로주");
		System.out.println(sbuf);
		sbuf.delete(10, 13);
		System.out.println("삭제하기 "+sbuf);
		
		
		
		
		
	}

}
