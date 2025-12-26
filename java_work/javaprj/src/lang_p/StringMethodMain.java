package lang_p;

import java.util.Arrays;

public class StringMethodMain {

	public static void main(String[] args) {
		String a = "아기상어 뚜루루뚜루 aBCd EfG JavA 만세 ja 12a2a4b";
		
		System.out.println(a);
		System.out.println(a.length());
		
		char ch = a.charAt(2);
		System.out.println(ch);
		
//		"문자를 실제숫자로 출력하는 법, char배열을 활용"
		String b = "a2023LSH";
		int yy = 0;
		for (int i = 1; i < 5; i++) {
			
			yy*=10;
			int c =  b.charAt(i) -'0';
			yy += c;
			System.out.println(c+"," +b.charAt(i)+","+yy);
		}
		
//		7이후 부터 전부 출력
//		루뚜루 aBCd EfG JavA 만세 ja 12a2a4b
		String d = a.substring(7);
		System.out.println(d);
		
//		7부터 12까지 출력된다
//		루뚜루 aB
		d = a.substring(7,13);
		System.out.println(d);
		
//		인덱스의 위치를 알려준다
		int pos = a.indexOf("a");
		System.out.println(pos);
		
		pos = a.indexOf("a",11);
		System.out.println(pos);
		
//		11번째 이후의 a의 위치를 찾는다
		pos = a.indexOf("a",12);
		System.out.println(pos);
		
		pos = a.indexOf("a",12,22);
		System.out.println(pos);
		
//		찾는게 없으면 -1로 출력한다
		pos = a.indexOf("a",12,21);
		System.out.println(pos);
		pos = a.indexOf("k");
		System.out.println(pos);
		
//		여러글자를 찾기 가능
		pos = a.indexOf("av");
		System.out.println(pos);
		
//		대소문자 구분
		pos = a.indexOf("A");
		System.out.println(pos);
		
//		뒤에서 부터 찾기
		pos = a.lastIndexOf("a");
		System.out.println(pos);
		
		
		
		
		String fff = "aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt";
		int BBB = fff.lastIndexOf(".");
		System.out.println("확장자출력" +fff.substring(BBB+1));
		System.out.println("확장자출력" +BBB);
		
//		있는지 없는지 존재여부를 묻는다
		System.out.println(a.contains("fG"));
		System.out.println(a.contains("나는 문어"));
		System.out.println(a.contains("아기"));
		System.out.println(a.contains("상어"));
		System.out.println(a.contains("3a4"));
		System.out.println(a.contains("aBCd"));
		
		a= "농구-축구,배구.탁구,,야구,족구";
		String[] arr = a.split(",");
		for (String tt : arr) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split(",-")) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split(".")) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split("[.]")) {
			System.out.println(tt);
		}
		
		System.out.println("--------------------");
		for (String tt : a.split( "[.,-]")) {
			System.out.println("따로따로 가져오기 : " +tt);
		}
		System.out.println("--------------------");
//		중간중간에 집어넣기
//		달리기연결줄달리기연결줄넘기연결기러기
		String [] arr2 = {"달리기","줄달리기","줄넘기","기러기"};
		d = String.join("연결", arr2);
		System.out.println(d);
		
		System.out.println("--------------------");
//		a를 "에이"로 바꾸기
		a = "아기상어 뚜루루뚜루 aBCd EfG JavA 만세 ja 12a2a4b";
		d = a.replace("a", "에이");
		System.out.println(d);
		d = a.replaceAll("a", "에이");
		System.out.println(d);
		
		char [] arr5 = a.toCharArray();
		System.out.println("문자배열을 빼기 :" +Arrays.toString(arr5));
		
//		대문자, 소문자 나오기
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println("--------------------");
		
		
		
		
		System.out.println("--------------------");
//		반복해서 출력하기
//		레고레고레고레고레고
		a= "레고";
		System.out.println(a.repeat(5));
		
		System.out.println("--------------------");
		d = a.concat("놀이");
		System.out.println(d);
		a= "onop 12기";
		System.out.println(a+"," +a.length());
		
		System.out.println("--------------------");
//		띄워쓰기 자르기
		d= a.trim();
		System.out.println(d+"," +d.length());
	}
}
