package thread_p;

import java.util.LinkedHashMap;

class ExamTiOv {
	public static boolean chk = false;
}




class ExamTimer extends Thread{
	public void run() {
		for (int i = 10; i < 0; i--) {
			System.out.println(i);
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}



public class Multi3Main2 {

	public static void main(String[] args) {
		
		LinkedHashMap ko = new LinkedHashMap();
		ko.put("오늘은", "크리스마스");
		ko.put("일", "이");
		ko.put("동해물", "백두산");
		
		LinkedHashMap en = new LinkedHashMap();
		en.put("인사", "hello");
		en.put("일", "one");
		en.put("잘가", "bye");
		
		LinkedHashMap ma = new LinkedHashMap();
		ma.put("1+1", "2");
		ma.put("2+2", "4");
		ma.put("3+3", "6");
	}
}
	


