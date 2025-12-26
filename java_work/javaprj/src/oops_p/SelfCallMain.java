package oops_p;
class SelfCall{
	
	String pre = "";
	//no = 3 , int meth(매개변수)
	// int meth() 의 초기 함수의 형태 인데 
	//() 안에 어떤 값을 받을 것인지 선택하기위해 (int no):(자료형 매개변수명)
	//을 새롭게 만들어 주는 것이다.
	int meth(int no) {// 초기값
		
		String myPre = pre;
		pre+= "\t";
		
		int res = no;

		System.out.println(myPre+"시작"+no +"," +res);
		
		//재귀조건
//		if(3>0)
//		if(2>0)
//		if(1>0)
//		if(0>0) <-- 여기 까지 if문을 재귀한다.	
//		
		if(no>0) {
		 res = res + meth(no-1); // 조건
//		 meth()가 계속해서 새롭게 함수를 만들어 낸다
//		 meth(3-1) = 2, no =2
//		 meth(2-1) = 1, no =1
//		 meth(1-1) = 0, no =1
//		 res = 0 , no = 0 이 되어서 no >0 의 조건을 만족하지 못하고
//		 올라간다.res+ meth()
//		 res = 0 , no = 0
//		 res = 1 + 0, no = 1 : res 1 no 1
//		 res = 2 + 1, no = 2 : res 3,no 2
//		 res = 3 + 3, no = 3 : res 6,no 3
		}
		
//		meth(no - 1); // 재귀 호출 // 증감
		System.out.println(myPre+"끝"+no+"," +res);
		return res;
	}
	
	String pre3 = "";
	int meth3(int no) {   //초기값
		
		String myPre = pre3;
		pre3+="\t";
		
		
		//3의 배수를 누적하는 연산
		int res = 0;
		if(no%3==0) {
			res = no;
		}
		
		System.out.println(myPre+"시작 "+no+" , "+res);
		
		if(no>0) {		// 조건
			res += meth3(no-1);	// 증감 //재귀호출
		}
		
		System.out.println(myPre+"끝 "+no+" , "+res);
		return res;
	}
}


public class SelfCallMain {

	//메인에서 시작
	public static void main(String[] args) {
		// meth = 3
		int rr = new SelfCall().meth(3);
		System.out.println("rr :" + rr);
		
		rr = new SelfCall().meth3(16);
		System.out.println("rr :" +rr);
		
	}

}
