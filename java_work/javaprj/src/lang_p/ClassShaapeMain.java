package lang_p;

import java.util.Scanner;

//1. 인터페이스를 이용한 다형성 형태로 만들 것
//인터페이스 정의
interface Shape{
//	실행 메소드
	void execute();
}

// 클래스 사각형 인스턴스변수 선언
class Rectangle implements Shape{
	int wi = 10, hi = 20;
	@Override
 public	void execute() {
		System.out.println("사각형의 넓이 : " +(wi*hi));
	}
}

class Circle implements Shape{
	int r = 15 ;
	@Override
 public	void execute() {
		System.out.println("원의 넓이 : " +(r*r)*3.14);
	}
	
}

class Triangle implements Shape{
	int bs = 10, hig = 20;
	@Override
 public	void execute() {
		System.out.println("사각형의 넓이 : " +(bs*hi));
	}
	
}



public class ClassShaapeMain {

	public static void main(String[] args) {
		//사용자가 도형명 입력
		Scanner sc =  new Scanner(System.in);
		System.out.println("도형을 선택하세요 : ");
		
		try {
			
		}catch{
			
		}
	}

}


/*
 * 입력값에 따라 도형클래스를 생성하여 도형의 넓이를 계산하세요
 * 1. 인터페이스를 이용한 다형성 형태로 만들 것
 * 2. 입력형태 사각형 원 삼각형
 * 3. 실행메소드 void excute()
 * 4. 동적 바인딩 사용 할 것
 */
