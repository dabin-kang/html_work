package oops_p;

public class MainMain {

	// args 뒤에오는 값들을 문자열로 만든다
	public static void main(String[] args) {
		System.out.println("MainMain 시작----------");
		
		for (String ttt : args) {
			System.out.println(ttt);
		}
		System.out.println("MainMain 끝----------");

	}

}
