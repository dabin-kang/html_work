package oops_p;


class ConstSh{
	String pname;
	
	int aer , sir;
	
	ConstSh( int RR){
		System.out.println("원" +RR);
		this.pname = "원";
		aer = RR*RR;
		sir = RR* (int)3.14;
	}
	ConstSh(int wi,int hi){
		this.pname = "사각형";
		System.out.println("사각형" +wi +"," +hi);
		aer = wi*hi;
		sir = (wi+hi)*2;
		
	}
	
	void ppp(){
		System.out.println( pname+"의 넓이 : " +aer +"," +"둘레 : "+sir);
	}
	
	
}


public class ConstShapenMain {

	public static void main(String[] args) {
		ConstSh [] AA = {
				new ConstSh(10,20),
				new ConstSh(10)
		};
		AA[0].ppp();
		AA[1].ppp();

	}

}
