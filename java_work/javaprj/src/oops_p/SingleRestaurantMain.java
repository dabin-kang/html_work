package oops_p;

class SingleRestauran{
	private static SingleRestauran sr = null; 
	String name = null;
	
	private SingleRestauran() {
		System.out.println("레스토랑 생성");
	}
	static SingleRestauran getInstance() {
		if(sr == null) {
			sr = new SingleRestauran();
		}
		return sr;
	}
}

class Customer{
	
}
void sit1() {
	System.out.println("2인석 1");
}



public class SingleRestaurantMain {

	public static void main(String[] args) {
		SingleRestauran sit = 
				SingleRestauran.getInstance();

		sit
	}

}




/*
 * 음식점 자리를 구현
 * 4인석 - 2개
 * 2인석 -3 개
 * 일행의 인원수 보다 작은 자리는 일행이 앉을 수 없다
 * 빈자리에만 앉을 수 있다
 * 
 * 손님이 들어오면 인원수 를 확인한다
 * 확인한 인원수와 빈 좌석을 비교 
 * 들어 갈 수 있으면 빈좌석으로 안내
 * 빈 좌석과 손님인원이 다르면 되돌려 보내기
 *
 * 레스토랑 생성 (싱글 톤)
 * 4인석 2개를 만든다
 * - 자리에 앉고 싶어요(자리가 비었을때)
 * - 밥 다먹고 나왔어요(자리에서 나갈때)
 * - 자리가 없어요	(자리에 누가 있을 때)
 * 
 * 2인석 3개를 만든다
 * - 자리에 앉았어요
 * - 밥 다먹고 나왔어요
 * - 자리가 없어요
 * 
 * 4인석에 2인은 앉을 수 없다
 * 2인석에도 4인은 앉을 수 없다
 * 좌석에 사람이 있으면 앉을 수 없다
 * 좌석에서 사람이 나와야 앉을 수 있다
 * 
 * 
 * 
 * 
 */