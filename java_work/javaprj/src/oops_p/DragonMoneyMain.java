package oops_p;

class DragonMoney{
	String pname;		//아들,딸 이름
	int myMoney = 0;   // 내가가진 돈의 양
	static int mom = 100;     // 잔액
	int dad = 100;		// 아빠가 가진 돈의 양
	
	DragonMoney(String pname) {
		this.pname = pname;
	}
	
	//용돈을 받는 매서드
	void showMeTheMoney(int money) { //money = 15
		myMoney += money; //myMoney = 0 money = 15
		mom -= money; //mom = 100 money =15
		//엄마 잔액에서 빠지는 것을 확인하고 아빠가 뺄 때 실행불가능 기능을 만든다.
		System.out.println(pname+"," +money+"("+myMoney+")");
		System.out.println("\t 잔액:" +mom);
		//아빠가는 실행 불가 출력
		System.out.println("\t 잔액:" +dad +"실행불가");
		
	}
	
	//돈을 벌어오는 새로운 메서드
	void showMeTheMoney2(int money) { //money = 15
		myMoney += money; //myMoney = 0 money = 15
		mom -= money; //mom = 100 money =15
		System.out.println(pname+"," +money+"("+myMoney+")");
		System.out.println("\t 잔액:" +mom);	
	}
}


public class DragonMoneyMain {

	public static void main(String[] args) {
		// 새로운 공간을 만든다
		DragonMoney son = new DragonMoney("아들");
		DragonMoney daughter = new DragonMoney("딸");
		DragonMoney	dad = new DragonMoney("아빠");
		
		son.showMeTheMoney(15);
		daughter.showMeTheMoney(7);
		daughter.showMeTheMoney(20);
		son.showMeTheMoney(9);
		dad.showMeTheMoney2(2);
	}

}


/*
 * 아빠가 돈을 벌어오게 해주세요
 * 아빠가 용돈을 받으려고 할때 --> 실행불가
 * 자식이 돈을 벌어오려고 할때 --> 실행불가
 */