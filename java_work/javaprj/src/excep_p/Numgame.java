package excep_p;

public class Numgame {

	public static void main(String[] args) {
		int tot = 0;
		for (int i = 1; i < 88; i++) {
			int one = i %10; // 일의 자리
			int ten = i/10; //  십의 자리
	
			
			if(one == 3 || one ==6 || one ==9) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}		
	}
}

//1의 자리가 3,6,9이면 짝 을 출력