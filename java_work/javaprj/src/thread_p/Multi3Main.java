package thread_p;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class ExamKo extends Thread{
	
	LinkedHashMap ko;
	
	ExamKo(){
		ko = new LinkedHashMap();
		ko.put("오늘은", "크리스마스");
		ko.put("일", "이");
		ko.put("동해물", "백두산");
	}
	
	public void run() {
		for(Object obj : ko.entrySet()) {
			Map.Entry anko = (Map.Entry)obj;
			String kk = JOptionPane.showInputDialog(anko .getKey());
			System.out.println("국어문제 : "+kk );
		}
	}
}

class ExamEn extends Thread{
	
	LinkedHashMap en;
	
	ExamEn(){
		en = new LinkedHashMap();
		en.put("a", "에이");
		en.put("b", "비");
		en.put("c", "씨");
	}
	
	public void run() {
		for(Object obj : en.entrySet()) {
			Map.Entry anen = (Map.Entry)obj;
			String ee = JOptionPane.showInputDialog(anen .getKey());
			System.out.println("국어문제 : "+ee );
		}
	}
}


class ExamTimer extends Thread{
	public void run() {
		for(int i = 10; i>0;i--) {
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





public class Multi3Main {

	public static void main(String[] args) {
		ExamKo ko = new ExamKo();
		ExamEn en = new ExamEn();
		ExamTimer ti = new ExamTimer();
		
		ko.start();
		en.start();
		ti.start();

	}

}
