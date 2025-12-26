package basic_p;

public class CalcMain {
	public static void main(String[] args) {
		String aa = "장동건";
		int i = 10;
		boolean bo = true;
		char ch = 'h';
		
		//System.out.println(aa-i);
		//System.out.println(i- bo);
		System.out.println(i- ch);
		System.out.println(i*2);
		//System.out.println(i**2);
		
		aa = "차은우";
		String bb = "차금우";
		//같은지 아닌지 는 알수 있어도 크기비교는 할 수 없다.
		System.out.println(aa==bb);
		System.out.println(aa!=bb);
		//System.out.println(aa===bb);
		//System.out.println(aa>=bb);
		//System.out.println(aa<=bb);
		
		
		boolean bo1 = true, bo2 = false;
		System.out.println(bo1==bo2);
		System.out.println(bo1!=bo2);
		//System.out.println(bo1>=bo2);
		//System.out.println(aa==bo2);
		//System.out.println(aa==i);
		
		//2개가 달라야 true
		System.out.println(bo1^bo2);
	}

}
