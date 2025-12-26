package inter_p;

public interface InDD {
	void meth_1();
//	void meth_2() {
//		
//	}
	
//	접근제한자 ,리턴값이 없는 함수선언 , 함수명
	public void meth_3();
	abstract void meth_4();
	public abstract void meth_5();
	
	//DefaultMain  에서 중첩이 된다
	default void meth_6() {
		System.out.println("InDD meth_6() 실행");
	}	
		default void meth_7() {
			System.out.println("InDD meth_7() 실행");		
	}
}
