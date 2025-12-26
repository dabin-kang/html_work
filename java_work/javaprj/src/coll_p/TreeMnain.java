package coll_p;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMnain {

	public static void main(String[] args) {
		HashMap mm1 = new HashMap(); // 순서 상관없음
		LinkedHashMap mm2 = new LinkedHashMap();// 입력한 순서대로 정렬
		TreeMap mm3 = new TreeMap(); // key순서 대로 정렬 , map의 key가 set이다
		
	
		mm1.put(11,700);
		mm1.put(55,800);
		mm1.put(33,400);
		mm1.put(33,400);
		mm1.put(22,400);
		mm1.put(66,200);
		mm1.put(44,200);
		mm1.put(22,600);
		
		mm2.put(11,700);
		mm2.put(55,800);
		mm2.put(33,400);
		mm2.put(66,900);
		mm2.put(44,200);
		mm2.put(44,200);
		mm2.put(44,200);
		mm2.put(22,600);
		
		mm3.put(11,700);
		mm3.put(55,800);
		mm3.put(33,800);
		mm3.put(66,800);
		mm3.put(88,400);
		mm3.put(77,900);
		mm3.put(44,200);
		mm3.put(22,600);
		
		System.out.println("mm1"+mm1);//mm1{33=400, 66=900, 22=600, 55=800, 11=700, 44=200}
		System.out.println("mm2"+mm2);//mm2{11=700, 55=800, 33=400, 66=900, 44=200, 22=600}
		System.out.println("mm3"+mm3);//mm3{11=700, 22=600, 33=400, 44=200, 55=800, 66=900}
		
//		mm2.getFirst(); LinkedHashSet 처럼 getfirst가 없음
		Entry et = mm3.firstEntry();//key,value
		System.out.println("firstEntry() : "+et);
		Object oo =mm3.firstKey(); // key
		System.out.println("firstKey() : "+oo);
		
		et = mm3.lastEntry();
		System.out.println("lastEntry() : "+et);
		oo =mm3.lastKey(); 
		System.out.println("lastKey() : "+oo);
		
		et = mm3.lowerEntry(35);//key 35바로 아래
		System.out.println("lowerEntry() : "+et);
		oo =mm3.lowerKey(35); // key
		System.out.println("lowerKeyKey() : "+oo);
		
		System.out.println("[[lowerEntry]]");
		et = mm3.lowerEntry(33);
		System.out.println("lowerEntry() : "+et);
		oo =mm3.lowerKey(33); // key
		System.out.println("lowerKeyKey() : "+oo);
		
		System.out.println("[[higherEntry]]");
		et = mm3.higherEntry(35);
		System.out.println("higherEntry() : "+et);
		oo =mm3.higherKey(35); // key
		System.out.println("higherKey() : "+oo);
		et = mm3.higherEntry(33);
		System.out.println("higherEntry() : "+et);
		oo =mm3.higherKey(33); // key
		System.out.println("higherKey() : "+oo);
		
		
		System.out.println("[[floorEntry]]");
		et = mm3.floorEntry(35);
		System.out.println("floorEntry() : "+et);
		oo =mm3.floorKey(35); // key
		System.out.println("floorKey() : "+oo);
		et = mm3.floorEntry(33);
		System.out.println("floorEntry() : "+et);
		oo =mm3.floorKey(33); // key
		System.out.println("floorKey() : "+oo);
		
		
		System.out.println("[[ceilingEntry]]");
		et = mm3.ceilingEntry(35);
		System.out.println("ceilingEntry() : "+et);
		oo =mm3.ceilingKey(35); // key
		System.out.println("ceilingKey() : "+oo);
		et = mm3.ceilingEntry(33);
		System.out.println("ceilingEntry() : "+et);
		oo =mm3.ceilingKey(33); // key
		System.out.println("ceilingKey() : "+oo);
		
		et = mm3.pollFirstEntry();
		System.out.println("pollFirstEntry()"+et);
		System.out.println("mm3"+mm3);
		
		et = mm3.pollLastEntry();
		System.out.println("pollLastEntry()"+et);
		System.out.println("mm3"+mm3);
		
		NavigableMap mm4 = mm3.descendingMap();
		System.out.println("descendingMap()"+mm4);
		NavigableSet ss = mm3.descendingKeySet();
		System.out.println("descendingKeySet()"+ss);
		
//		일부를 가지고 오기 33부터 66 사이를 가져오겠다
		SortedMap mm5 = mm3.headMap(55);
		System.out.println("headMap(55)"+mm5);
		mm5 = mm3.headMap(55,true);
		System.out.println("headMap(55)"+mm5);
		mm5 = mm3.headMap(55,false);
		System.out.println("headMap(55)"+mm5);
		
		
		mm5 = mm3.tailMap(55);
		System.out.println("tailMap(55)"+mm5);
		mm5 = mm3.tailMap(55,true);
		System.out.println("tailMap(55)"+mm5);
		mm5 = mm3.tailMap(55,false);
		System.out.println("tailMap(55)"+mm5);
		
		mm5 = mm3.subMap(33,66);
		System.out.println("subMap"+mm5);
		mm5 = mm3.subMap(33,false,66,false);
		System.out.println("subMap(33,false,66,false)"+mm5);
		mm5 = mm3.subMap(33,true,66,false);
		System.out.println("subMap(33,true,66,true)"+mm5);
		mm5 = mm3.subMap(33,true,66,true);
		System.out.println("subMap(33,true,66,true)"+mm5);
		mm5 = mm3.subMap(33,false,66,true);
		System.out.println("subMap(33,true,66,true)"+mm5);
	}

}
