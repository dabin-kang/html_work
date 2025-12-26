package control_p;

import java.util.Scanner;

public class WhileCoffeeMain {

	public static void main(String[] args) {
		
		String am = "아메리카노";
		String af = "아프리카노";
		String sa = "남아메리카노";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴:");
		int me = sc.nextInt();
		System.out.println("수량:");
		int pri = sc.nextInt();
		
		if(me == 1) {
			System.out.println("아메리카노" );
		}else if(me == 2) {
			System.out.println("아프리카노");
		}else if(me==3) {
			System.out.println("남아프리카노");
		}
		
		System.out.println( me  +":" +pri);
		
		
		
		
	}

}
