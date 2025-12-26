package basic_p;

enum ECM{
	
	ZAZANG("짜장면",7000),ZZAMBBONG("짬뽕",8000),TANGSOOG("탕수육",15000);
	
	final String name;
	final int price; 
	private int cnt;
	private ECM(String name, int price) {
		this. name = name;
		this. price = price;
		cnt = 0;
	}
	
//	갯수를 함부로 증가하지 못하게 막기
	public void addCnt() {
		cnt++;
		System.out.println(name+"("+price +"원"+") "+"주문이요");
	}
	
	public String addCnt2() {
		cnt++;
		return name+"("+price +"원"+") ";
	}
	
	public int getToT() {
		return price*cnt;
	}
	public int getcnt(){
		return cnt;
	}
	
	
	@Override
	public String toString() {
		return name+"\t"+price+"\t"+cnt+"\t"+price*cnt;
	}
}

public class EnumChinaMain {
	String name;
	EnumChinaMain(String name) {
		this.name = name;

//		주문을 한다
		order("ZAZANG");
		order("ZAZANG");
		order("ZZAMBBONG,ZZAMBBONG,ZAZANG");
		order("TANGSOOG,ZAZANG");
		
		
//		가게에서 총 얼마나 판매했는지 알고 싶을때
		System.out.println("-----------------");
		int tot = 0;
		int cnt= 0;
		for(ECM ecm : ECM.values()) {
			System.out.println(ecm);
			
//			최종 합산 결과 만들기
			tot += ecm.getToT();
			cnt += ecm.getcnt();
		}
		System.out.println("--------------------");
		System.out.println("결과"+"\t"+"\t"+cnt +"\t"+ tot);
	}
	
//	void order(String menu) {
//		ECM.valueOf(menu).addCnt();
//	}
	
	
	void order(String menus) {
		String ttt = "";
		int tot = 0;
		for(String menu : menus.split(",")) {
			ttt += ECM.valueOf(menu).addCnt2();
			tot += ECM.valueOf(menu).price;
		}
		ttt += ":"+tot;
		System.out.println(ttt);
	}


	public static void main(String[] args) {
		new EnumChinaMain("보신각");

	}
}


/*
 * 
 * 
 * 
 * */
