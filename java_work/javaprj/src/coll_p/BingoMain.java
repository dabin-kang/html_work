package coll_p;

import java.util.HashSet;

//외부 클래스
public class BingoMain {
	public static void main(String[] args) {
		//자료형  변수     생성자
		HashSet bingo = new HashSet();
		
	
		//매서드
		//랜덤 1~ 100까지 숫자범위
//		int st = (int)Math.random(); 랜덤의 기본 형태
		double st = Math.random();
		
		for (int i = 0; i < 25; i++) {
			if(i==5) {
				\n
			}
			int st1 = (int) (Math.random() *100);
			System.out.print(st1+",");
			
		
//			int st2 = (int) (Math.random() *100);
//			int st3 = (int) (Math.random() *100);
//			int st4 = (int) (Math.random() *100);
//			int st5 = (int) (Math.random() *100);
			
//			System.out.print(st2+",");
//			System.out.print(st3+",");
//			System.out.print(st4+",");
//			System.out.print(st5+","+"\n");
			
		}
		
		//출력 모양5*5
//		System.out.println(bingo);
	}
}
