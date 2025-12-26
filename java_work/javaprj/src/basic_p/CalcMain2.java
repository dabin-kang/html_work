package basic_p;

class CalcAA {
	String aa = "장동건";
	int i = 10;
	boolean bo = true;
	char ch = 'h';
	
			void meth_0() {
				//System.out.println(aa-i);
				//System.out.println(i- bo);
				System.out.println("meth_0 : " +(i- ch));
				System.out.println("meth_0 : " +(i*2));
				//System.out.println(i**2);
			}
			
			
			void meth_1() {
				aa = "차은우";
				String bb = "차금우";
				//같은지 아닌지 는 알수 있어도 크기비교는 할 수 없다.
				System.out.println("meth_1 : " +(aa==bb));
				System.out.println("meth_1 : " +(aa!=bb));
				//System.out.println(aa===bb);
				//System.out.println(aa>=bb);
				//System.out.println(aa<=bb);
			};
			
			
			void meth_2() {
				boolean bo1 = true, bo2 = false;
				System.out.println("meth_2 : " +(bo1==bo2));
				System.out.println("meth_2 : " +(bo1!=bo2));
				//System.out.println(bo1>=bo2);
				//System.out.println(aa==bo2);
				//System.out.println(aa==i);
				//2개가 달라야 true
				System.out.println(bo1^bo2);
			}
}

public class CalcMain2 {
	public static void main(String[] args) {
		CalcAA ca =	new CalcAA();
	  	
		// 호출하기
		System.out.println("편의성제공-------0");
		ca.meth_0();
		System.out.println("편의성제공-------1");
		ca.meth_1();
		System.out.println("편의성제공-------2");
		ca.meth_2();
	}
}
