package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		//생성자
		Date today = new Date();
		
		//출력 : Fri Dec 19 16:43:51 KST 2025
		System.out.println(today);
		
		
//		y : 2025,yy : 25,yyyy : 2025
		String [] ppArr = {
				"y","yy","yyyy",
				"M","MM","MMM",
				"d","dd","DD","DDD",
				"w","ww","W","WW",
				"E","EE","EEE","EEEE",
				"F",// 이번달의 몇 번 째 요일인지
				"z","Z",//time zone
				"a",//am,pm
				"H","HH","h","hh",
				"m","m",
				"s","ss",
				"S","SSS",
				
		};
		
		
//		M : 12 , MM : 12
		Locale loc = new Locale("en");
		
		for (String pp : ppArr) {
			
//			SimpleDateFormat sdf = new SimpleDateFormat(pp,loc); 
			SimpleDateFormat sdf = new SimpleDateFormat(pp,Locale.ENGLISH); 
			
			System.out.println(pp+" : " +sdf.format(today));
		}
		
		SimpleDateFormat mmm = new SimpleDateFormat("yyyy년 mm월 "); 
		NNN (today);
		System.out.println(today);
		System.out.println(mmm.format(today));
	}
	}

}
