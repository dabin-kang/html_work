package lamda_p;


//매개변수로 받는 인터페이스
interface Sum1{
	int aaa1(int a, int b,int c);	
}


//멤버변수를 만드는 메서드
class LamAAA{
	void meth_1(Sum1 bb) {
		bb.aaa1(10,20,30);
		
	}
}

public class Lambda3Main {

	
	

	
	
	
	
	public static void main(String[] args) {
//		람다식으로 구현

	}
}


/*
 * 정수 3개를 매개변수로 받고 정수 1개를 리턴하는 람다식 가능한 인터페이스를 구현하라
 * 계산식은 3개를 구현
 * 3개의 합 리턴
 * 3개중 가장 큰 수를 리턴
 * 첫번째 두번째 매개변수를 곱하고 3번째 매개변수로 뺀 수 리턴
 * 
 * 
 */