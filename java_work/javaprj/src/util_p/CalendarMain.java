package util_p;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
//		추상화 가 되어서 되도록 사용하지 않는다.
//		Calendar qwer = new  Calendar();
		Calendar today = Calendar.getInstance();
		
//		java.util.GregorianCalendar[time=1766024865292,areFieldsSet=true,.....]
		System.out.println(today);
		
//		1
		System.out.println(today.get(0));
		
//		2025
		System.out.println(today.get(1));
		System.out.println(today.get(Calendar.YEAR));
		
//		월은 0월 부터 시작해서 1을 더해준다
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		
//		요일 , 1부터 시작
//		일 월 화 수 목 금 토
//		1  2 3  4 5  6 7
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		
		
		
//		시간
//		오전:0 , 오후:1
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		
		
		System.out.println(today.getTimeInMillis());
		System.out.println(today.getTimeInMillis()/1000/60/60/24/365+1970);
		System.out.println(today.getActualMaximum(Calendar.YEAR));
		System.out.println(today.getActualMaximum(Calendar.MONTH));
		System.out.println(today.getActualMaximum(Calendar.DATE));
		System.out.println(today.getActualMaximum(Calendar.HOUR));
		System.out.println(today.getActualMaximum(Calendar.HOUR_OF_DAY));
		
//		원하는 일자 만들기
		today.set(1997, 3-1, 20);
		today.set(1997, 3-1, 20,16,23);
		today.set(1997, 3-1, 20,16,23,45);
		today.set(Calendar.YEAR,2002);
		today.set(1997,68-1,-200,1234,-8765,11224455);
		today.setTimeInMillis(0);
		AAA (today);
		
		
		
		today  = Calendar.getInstance();
		AAA (today);
		today.add(Calendar.MONTH, 5);
		AAA (today);
		today.add(Calendar.MONTH, -8);
		AAA (today);
		
		
		Calendar now = Calendar.getInstance();
		AAA (today);
		System.out.println(now.after(today));
		System.out.println(now.before(today));
		
		
		Date dd;
		
		dd = today.getTime();
		System.out.println(dd);
		
		dd= new Date();
		System.out.println(dd);
		today.setTime(dd);
		AAA(today);

	}
	static void AAA(Calendar today) {
		String ttt = 
		today.get(Calendar.YEAR) +" 년 " 
		+(today.get(Calendar.MONTH)+1) +" 월 " 
		+today.get(Calendar.DATE) +" 일 " 
		+today.get(Calendar.DAY_OF_WEEK) + "요일 " 
		+today.get(Calendar.HOUR) +" : " 
		+today.get(Calendar.MINUTE) +" : " 	;
		System.out.println(ttt);
	};
}
