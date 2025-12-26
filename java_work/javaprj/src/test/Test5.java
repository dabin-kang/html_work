package test;

public class Test5 {

	public static void main(String[] args) {
		int aa;
		int[] aaa;

		aaa = new int[4];
		//aaa = [0],[11],[22],[0]
//		System.out.println("aa : "+aa);
		System.out.println("aaa[0] : "+aaa[0]);
		System.out.println("--------------------");
		aaa[1] = 11;
		System.out.println("aaa[1] : "+aaa[1]);
		aaa[2] = 22;
		System.out.println("aaa[2] : "+aaa[2]);
	
		////////////////////////////////////////
		
		int a = aaa[1];
		aaa[1] = aaa[2];
		aaa[2] = a;
		
		System.out.println("결과--------------------");
		
		System.out.println("aaa[1] : "+aaa[1]);
		System.out.println("aaa[2] : "+aaa[2]);
		
		System.out.println("--------------------");
		
		//반복문을 사용해서
		//[11][22][33][44]
//		aaa[0] = 11; i=0
//		aaa[1] = 22; i=1
//		aaa[2] = 33; i=2
//		aaa[3] = 44; i=3
		
		
		for(int i = 0;i <=3;i++) {
			//i=0 aaa[0]=11
			//i=1 aaa[1]=22
			aaa[i] = 11*(i+1);
			System.out.println("aaa["+i+"] : "+aaa[i]);
		}
		
		
		// aaa[0] = 11;
		// aaa[1] = 22;
		
		System.out.println("결과--------------------");
		
		System.out.println("aaa[0] : "+aaa[0]);
		System.out.println("aaa[1] : "+aaa[1]);
		System.out.println("aaa[2] : "+aaa[2]);
		System.out.println("aaa[3] : "+aaa[3]);
		
	}
	

}
