class Car{
    String color;
    int speed;

    void drive(){// return 값이 없는 메서드
        System.out.println(color+"색 자동차가"+speed+"km로 달립니다");
    }
}

public class Main{
    public static void main(String[] args) {
        Car myCar = new Car(); // 클래스타입  참조변수  = 객체생성연산자   생성자();

        //객체상태 설정
        myCar.color = "빨간";
        myCar.speed = 80;
        
        //객체행동 실행
        myCar.drive();
    }
}
