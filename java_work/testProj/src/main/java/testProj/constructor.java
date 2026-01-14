package testProj;

class Car {
	String color;
	int speed;
	
	void drive() {
		System.out.println(color+"색 자동차가"+speed+"km로 달립니다");
	}
}


public class constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
	//클래스타입 참조변수 = new 생성자();	
		
	//객체의 상태를 설정(데이터 넣기)	
		myCar.color = "노란";
		myCar.speed = 80;
		
	//객체의 행동을 실행	
		myCar.drive();

	//노란색 자동차가80km로 달립니다
	//myCat : 객체 instent;	
	}

}
