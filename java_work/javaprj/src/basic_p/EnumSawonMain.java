package basic_p;

//변수를 선언한다

 enum ESM{
	 PRESIDENT("사장",300),
	 MANAGER("부장",170),
	 EXAGGERATION("과장",150),
	 DEPUTY("대리",200),
	 Employee("사원",120);
	 
	 String rank;
	 String name;
	 int salary;
	 int basy;
	 ESM(String rank, int basy){
		 this.rank = rank;
		 this.basy = basy;
	 }
 }

 class EnumSawon{
	String name;
	ESM esm;
	int basy;
	int salary;
	
	public EnumSawon(String name, ESM esm, int basy) {
		this.name = name;
		this.esm = esm;
		this.basy = basy;
		this.salary = basy+ esm.basy;
	}
	

	@Override
	public String toString() {
		return "EnumSawon [name=" + name + ", esm=" + esm + ", basy=" + basy + ", salary=" + salary + "]";
	}
	
 }
 
 
public class EnumSawonMain {
	void addrank(String rank) {
	 }
	
		
	public static void main(String[] args) {
		System.out.println(ESM.PRESIDENT.rank);
		EnumSawon ss = new EnumSawon("장동건",ESM.Employee,300) ;
		
		System.out.println(ss);
		System.out.println(EnumSawon.class);
	}
}


/*
 * 
 *
 *월급 계산 
 *	기본급 * 상여율(/100)
 *
 * 직원들 데이터
 * 
 * 출력
 * 	직급순서대로(사장,부장,과장,대리,사원)
 * 	직급 , 이름 , 기본급 , 월급
 * 
 */