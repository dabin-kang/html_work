package coll_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		int [] ori = {33,66,77,11,33,44,66,77,22,11,44};
		ArrayList arr = new ArrayList();
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();
		
		for( int i : ori) {
			arr.add(i);
			hs.add(i);
			lhs.add(i);
			ts.add(i);
		}
		
		arr.add("아기상어");
		hs.add("아기상어");
		lhs.add("아기상어");
//		ts.add("아기상어");  모든원소가 비교가능해야 한다
		
		
		
		System.out.println("arr:"+arr);	//arr	:[33, 66, 77, 11, 33, 44, 66, 77, 22, 11, 44] 중복허용 , 입력순서대로
		System.out.println("hs:"+hs);	//hs	:[33, 66, 22, 11, 44, 77] 중복미허용 , 순서상관없음
		System.out.println("lhs:"+lhs); //lhs	:[33, 66, 77, 11, 44, 22] 중복미허용 , 입력순서대로
		System.out.println("ts:"+ts);	//ts	:[11, 22, 33, 44, 66, 77] 중복미허용 , 오름차순정렬
		
//		lhs.get(0);
		System.out.println("[LinkedHashSet]");
		System.out.println("getFirst():	"+lhs.getFirst()); // jdk21 이상 버전에서만 가능하다
		System.out.println("getLast():	"+lhs.getLast());
		
		System.out.println("[TreeSet]");
		System.out.println("ts.first():	"+ts.first());
		System.out.println("ts.last():	"+ts.last());
		
		System.out.println("ts.lower():	"+ts.lower(35));//ts.lower():33 , 35보다 앞으 객체
		System.out.println("ts.lower():	"+ts.lower(33));//ts.lower():22 , 같은 값ㅇ르 포함하지 않음
		System.out.println("ts.higher():	"+ts.higher(35));//ts.higher():	44 , 35보다 뒤의 객체
		System.out.println("ts.higher():	"+ts.higher(33));//ts.higher():	44 , 같은 값은 포함하지 않음
		
		System.out.println("ts.floor():	"+ts.floor(33));//ts.floor():	33 ,  같은 값 포함
		System.out.println("ts.floor():	"+ts.floor(35));//ts.floor():	33 , 35보다 앞의 객체
		System.out.println("ceiling():	"+ts.ceiling(33));//ceiling():	33 ,  같은 값 포함
		System.out.println("ceiling():	"+ts.ceiling(35));//ceiling():	44 , 35보다 뒤의 객체
		
		Object rr = ts.pollFirst(); // 맨앞의 객체를 리턴 ; TreeSet에서 삭제
		System.out.println("pollFirst : "+rr);
		System.out.println("ts : "+ts);
		
		rr = ts.pollLast(); // 맨뒤의 객체를 리턴 ; TreeSet에서 삭제
		System.out.println("pollFirst : "+rr);
		System.out.println("ts : "+ts);
		
		System.out.println("headSet----------------------------------------------------------");
		TreeSet tsH1 = (TreeSet)ts.headSet(44);
		System.out.println("headSet"+tsH1); // 검색객체 앞 요소 , 자신 포함 하지 않음
		
		TreeSet tsH2 = (TreeSet)ts.headSet(44,true); // 자신을 포함
		System.out.println("headSet(44,true)"+tsH2); 
		
		System.out.println("tail----------------------------------------------------------");
		TreeSet tsT1 = (TreeSet)ts.tailSet(33);
		System.out.println("tailSet"+tsT1); // 검색객체 앞 요소 , 자신 포함
		
		TreeSet tsT2 = (TreeSet)ts.tailSet(33,true); // 자신을 포함
		System.out.println("tailSet(33,true)"+tsT2); 
		
		
		TreeSet tsDESC = (TreeSet)ts.descendingSet(); // 역정렬 NavigableSet 리턴
		System.out.println("descendingSet() : "+tsDESC);
		
		
		System.out.println("Iterator-------------------------------------------------------");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("descendingIterator()-------------------------------------------------------");
		Iterator itDESC = ts.descendingIterator();
		while(itDESC.hasNext()) {
			System.out.println(itDESC.next());
	
		
	}
  }
}
