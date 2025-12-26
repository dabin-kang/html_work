package basic_p;

public class ExamMain {

	public static void main(String[] args) {
		short no = 1;
		String name = "홍길동";
		int eng = 89;
		int mat = 78;
		int kor = 30;
		int sum = eng + mat + kor;
		double tot = (eng + mat + kor)/3.0;
		
		System.out.println(no);
		System.out.println(name);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(kor);
		System.out.println(sum);
		System.out.println(tot);
		
		char su = tot >= 90 ? '수' : tot > 80?'우': tot>70?'미': tot>60?'양' :'가' ;
		System.out.println(su);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
