package dynamic;

import java.util.Arrays;

class OverStud{
	String kind,pname;
	int tot, avg;
	
	OverStud(String kind, String pname) {
		this.kind = kind;
		this.pname = pname;
	}
	
	void calc() {
	}
	
		void ppp() {
			calc();
			System.out.println(kind +"," +pname+","+tot+","+avg);
		}
}

class OverGen extends OverStud{
	int [] jum;
	
	OverGen (String pname, int kor, int eng, int mat){
		super ("일반", pname);
		this.jum = new int[] {kor,eng,mat};
	}
	void calc() {
		tot = 0;
		for(int i : jum) {
			tot +=i;
		}
		avg = tot/ jum.length;
	}
}

class OverArt extends OverStud{
	int [] jum;
	
	String [] spec;
	OverArt (String pname,String...spec){
		super ("예능", pname);
		this.spec = spec;
	}
	
	@Override
	void ppp() {
		System.out.println(kind +"\t" +pname+"\t" +Arrays.toString(spec));
	}
}

public class OverExamMain {

	public static void main(String[] args) {
		OverStud [] studs = {
				new OverGen("근육몬",81,32,87),
				new OverGen("꼬마돌",71,22,47),
				new OverArt("고라파덕","소묘","수채화","목채화","금채화"),
				new OverArt("야도란","베이스","드럼","기타","피아노")
		};
		
		for (OverStud st : studs) {
			st.ppp();
		}

	}

}
