package coll_p;

import java.util.TreeMap;

public class WordCntMain {

	public static void main(String[] args) {
		String [] news = {
			"이준석 개혁신당 대표가 \"민주당은 뭉개기와 침대 축구의 정당\"이라고 직격했습니다.\r\n"
			+ "\r\n"
			+ "이 대표는 오늘(24일) 국회에서 열린 최고위원회의에서 통일교 특검과 관련해 \"김병기 더불어민주당 원내대표는 23일만 해도 '속도가 곧 정의다. 시간을 끌면 진실이 흐려지고 증거는 사라진다'고 했다\"며 \"그런데 백승아 대변인은 연내 신속 처리는 물리적으로 어렵다\"고 말했습니다.\r\n"
			+ "\r\n"
			+ "그러면서 \"속도가 정의인데 왜 민주당만 느리냐\"고 비판했습니다.\r\n"
			+ "\r\n"
			+ "이 모습 현장영상으로 확인해 보시죠."	
		};
		System.out.println(news);//[Ljava.lang.String;@28a418fc
		
		
		TreeMap res = new TreeMap();
		System.out.println(res);//{}
		
		for(String vv : news) {
			System.out.println(vv);// 텍스트
			
			TreeMap konews = new TreeMap();
			for (String string : news) {
				konews.put(vv,konews.getOrDefault(vv, 0)+1 );
			}
		}
		
		

	}

}
