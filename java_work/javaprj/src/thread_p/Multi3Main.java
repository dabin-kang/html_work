package thread_p;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

class ExamTiOv {
	public static boolean chk = false;
}


class ExamKo extends Thread{
	
	LinkedHashMap ko;

	ExamKo(){
		ko = new LinkedHashMap();
		ko.put("오늘은", "크리스마스");
		ko.put("일", "이");
		ko.put("동해물", "백두산");
	}
	
	public void run() {
		int cnt = 0;
		for(Object obj : ko.entrySet()) {
			
			
			Map.Entry anko = (Map.Entry)obj;
			String kk = JOptionPane.showInputDialog(anko .getKey());
			if(ExamTiOv.chk) {
				break;
			}
			System.out.println("국어문제 : "+anko.getKey());
			System.out.println("답안지 : "+kk);
			if(kk.equals(anko.getValue())) {
				cnt++;
			}
			if(kk.equals("p")){
				break;
			}
			
		}
		System.out.println("국어시험 종료");
		System.out.println("국어시험 결과"+cnt+"개");
		
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
		int cnt = 0;
		for(Object obj : en.entrySet()) {
			
			Map.Entry anen = (Map.Entry)obj;
			String ee = JOptionPane.showInputDialog(anen .getKey());
			if(ExamTiOv.chk) {
				break;
			}
			System.out.println("영어문제 : "+anen.getKey());
			System.out.println("영어답안지 : "+ee );
			if(ee.equals(anen.getValue())) {
				cnt++;
			}
			if(ee.equals("p")){
				break;
			}
			
		}
		System.out.println("영어시험 종료");
		System.out.println("영어 정답 개수 : "+cnt);
	}
}	
class ExamMa extends Thread{
	
	LinkedHashMap ma;
	
	ExamMa(){
		ma = new LinkedHashMap();
		ma .put("1+1", "2");
		ma .put("2*2", "4");
		ma .put("3/3", "1");
	}
	
	public void run() {
		int cnt = 0;
		for(Object obj : ma .entrySet()) {
			
		Map.Entry anma = (Map.Entry)obj;
		String mm = JOptionPane.showInputDialog(anma.getKey());
		if(ExamTiOv.chk) {
			break;
		}
		System.out.println("수학문제 : "+anma.getKey());
		System.out.println("수학답안지 : "+mm );
		if(mm.equals(anma.getValue())) {
			System.out.println("수학시험 정답 : " +cnt);
		}
		if(mm.equals("p")){
			break;
		}
		}
		System.out.println("수학시험 종료");
	
	}
}


class ExamTimer extends Thread{
	public void run() {
		for(int i = 10; i>0;i--) {
			System.out.println(i);
			try {
				sleep(1000);//1000/1 초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		시간이 끝 나면 공유변수를 true로 변경 시켜 시험들을 끝낸다
		ExamTiOv.chk = true;
		System.out.println("시간 종료");
	}
}

public class Multi3Main {

	public static void main(String[] args) {
		ExamKo ko = new ExamKo();
		ExamEn en = new ExamEn();
		ExamMa ma = new ExamMa();
		ExamTimer ti = new ExamTimer();
		
		ko.start();
		en.start();
		ma.start();
		ti.start();
	}
}
	


