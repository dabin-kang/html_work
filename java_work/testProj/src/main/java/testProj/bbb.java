package testProj;

import java.util.Arrays;

class AAA {
	int a,b;
	
	AAA(int a , int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + "]";
	}
	
	
}


 	public class bbb { // 클래스 이름은 대문자로 시작하는 것이 관례입니다.
	    public static void main(String[] args) {
	    	AAA bb1 = new AAA(1,2);
	    	System.out.println(bb1);
}
 }