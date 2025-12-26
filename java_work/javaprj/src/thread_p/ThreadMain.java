package thread_p;

class FirstTh extends Thread{
	
	
	FirstTh(String nn) {
		super(nn); // super.name = nn;
		System.out.println("생성자 실행"+nn);
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 500; i++) {
			System.out.print(getName());
			
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		System.out.println("run 입니다"+getName());//부모가 가지고 있는 name;
	}
	
	/*
	@Override
	public void start() {
		System.out.println("start입니다");
	}
	*/
}


public class ThreadMain {

	public static void main(String[] args) {
		FirstTh th1 = new FirstTh("&");
		FirstTh th2 = new FirstTh("#");
		
//		th1.run(); // 싱글스레드 - 사용안함
//		th2.run(); // 싱글스레드
		th1.start(); // 멀티 스레드 - run() 호출   
		th2.start();   
		
		System.out.println("\n activeCount() : "+Thread.activeCount());//현재 실행하고 있는 쓰레드가 몇개 인지
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n activeCount() : "+Thread.activeCount());
	}

}
