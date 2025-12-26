package dynamic;

class ExLifePar{
	String a = setA();
	String cd;
	static String sa = setSA();
	
	ExLifePar(String b){
		this.b = b;
		System.out.println("부모생성자:" +b);
	}
}

	
class ExLifeChild extends ExLifePar{
		String ca = setCA();
		String cd;
		static String csa = setCSA();
		
	ExLifeChild (String cd){
		super("자식생성시 b");
		this.cd = cd;
		System.out.println("자식 사용자 정의 생성자");	
	}
	
	ExLifeChild(){
		this("기본cd");
		System.out.println("자식기본생성자");
	}
	
	String setCA() {
		System.out.println("자식인스턴스 setCA 실행");
		return "자식인스턴스CA";
	}
	
	static String setCSA() {
		System.out.println("자식 스태틱 setSA 실행");
		return "자식스태틱A";
	}
	
	
}

public class ExLifeCycleMain {

	public static void main(String[] args) {
		ExLigechild cc1 = new ExLifeChild("cc1_cd");
		

	}

}
