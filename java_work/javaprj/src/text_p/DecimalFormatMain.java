package text_p;

import java.text.DecimalFormat;

public class DecimalFormatMain {

	public static void main(String[] args) {
		double [] ddArr = {
			123456 , -123456,
			123.456789,-123.456789,
			.9876,-.9876,
			.4321,-.4321,0
		};
		
		String [] ppArr = {
				"0","#","00000","#####",
				"####0000",
				//"#0#0#0","0000####"
				".00",".##","00000","#####",
				"0,00","#,##","0,000",
				"#,##0.00",
				"#@##","#?##","0@00",
				"#,##0원",
				"#,##0$",
				"$#,##0",
				"원#,##0$",
				"-#,##0","#,##0-",// 음수표시가 아니다 그냥 문자로 인식
				"0%","0.00%","#,##0.00%",
				"양수.00;음수00000000",
				"양수.00;음수",
//				"양수;음수"    에러
				
		};
		for (String pp : ppArr) {
			System.out.println(pp+">>>>>>>>>>>");
			
			DecimalFormat df = new DecimalFormat(pp); 
			
			for(double dd : ddArr) {
				System.out.println("\t"+dd+":"+df.format(dd));
			}
		}
		
		
		int [] AAArr = {
			67,78,89,98,76,54,78,77,90,56
		};
		for (int i : AAArr) {
			System.out.println(i);
		}
		if(AAArr[1] > 70) {
			System.out.println("78점 : ▲ ");
		}
		
		
		int [] BBBrr = {
				67,78,89,98,76,54,78,77,90,56
			};
		String [] mark = {"▼","▲"};
		
		for (int i = 0; i < BBBrr.length; i++) {
			System.out.println(BBBrr[i]+"점" +" : " +mark[BBBrr[i]/70]);
			System.out.println(BBBrr[i]/70);
		}

	}

}



/*67,78,89,98,76,54,78,77,90,56
 *점수가 70점 이상이면 ▲ , 미만이면 ▼ 로 표시해주세요
 * ifswitch, 3항 연산자등 조건문 사용하지 말건
 * 
 * 
 * 
 * */


