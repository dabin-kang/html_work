package pac_1;

import tiw.Tiwpon;
import kor.Korpon;

class CapAAA{
	int abc;
	private int dfg;
	private boolean gji;
	public int getDfg() {
		return dfg;
	}
	public void setDfg(int dfg) {
		this.dfg = dfg;
	}
	public boolean isGji() {
		return gji;
	}
	public void setGji(boolean gji) {
		this.gji = gji;
	}
	
//	public int getDfg() {
//		return dfg;
//	}
//	
//	public int getGji() {
//		this.gji = gji;
//	}
	
	
}

public class CapsuleMain {

	public static void main(String[] args) {
		CapAAA ca = new CapAAA();
		System.out.println(ca.abc);
//		System.out.println(ca.dfg);
//		System.out.println(ca.gji);
		ca.setDfg(123);
		System.out.println(ca.getDfg());
		ca.setGji(true);
		System.out.println(ca.isGji());

	// class단위에서 접근 할 수 있다
		Tiwpon t1 = new Tiwpon();
		System.out.println(t1.cm);
		System.out.println(t1.mi);
		System.out.println(t1.bet);
		
		Korpon t2 = new Korpon();
		System.out.println(t2.ab[1]);
		System.out.println(t2.ab[2]);
		
		System.out.println(t2.co +" " +t2.pon+" " +t2.ab[1] +"부품 : " +t1.cm);
		
		
		
	}

}
