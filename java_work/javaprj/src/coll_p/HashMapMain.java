package coll_p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
//		map1.add(100); Map에서는 add를 사용 할 수 없다, key가 인덱스 처럼사용한다
		map1.put("고래고래","포유류");
		map1.put("상어","어류"); //추가 
		map1.put("오타니","이도류");
		map1.put("상어","뚜루루");// 대입- 같은 키가존재할 경우 대입
		map1.put("사자","포유류");
		map1.put(100,123.456);
		
		System.out.println(map1);
		
//		get으로 가져오기 
//		출력 : 뚜루루
		System.out.println(map1.get("상어"));
		
//		삭제하기 , 삭제한 값(v)가져오기
		Object oo = map1.remove("오타니");
		System.out.println(oo);
		
		System.out.println(map1);
		System.out.println(map1.size());
		
//		개별적으로 찾기(숫자)
		System.out.println(map1.containsKey(100));//true
		System.out.println(map1.containsKey(200));//false
		System.out.println(map1.containsKey(123));//false
		
//		문자열 찾기
		System.out.println(map1.containsValue("포유류"));//true
		
		
		HashMap map2 = new HashMap();
		map2.put("라면","분식");
		map2.put("자잠면","중식");
		map2.put("냉면","한식");
		map2.put("개기","일식");
		
		map1.putAll(map2);
		System.out.println(map1);//{개기=일식, 자잠면=중식, 100=123.456, 상어=뚜루루, 고래고래=포유류, 사자=포유류, 냉면=한식, 라면=분식}, 순서상관 없이 추가한다
		
		HashMap map3 = map1;
		HashMap map4 = new HashMap(map1);
		HashMap map5 = (HashMap)map1.clone();
		
		map1.put("아메리카노", 2800);
		System.out.println("----------------------------");
		System.out.println(map1);
		System.out.println(map3);
		System.out.println(map4);
		System.out.println(map5);
		
//		for문을 할 수  없다
//		for(Object obj : map1) {
//			
//		}
		System.out.println("----------------------------");
		Set ss = map1.entrySet();
//		ss = [Map.Entry,Map.Entry,Map.Entry, ...] 이렇게 구성이 되어있다
		/*
		 * 개기=일식
		 * 자잠면=중식
		 *100=123.456
		 *.....
		*/
		System.out.println(ss);
		System.out.println("------------------------------------------------------");
		for (Object obj : ss) {
//			System.out.println(obj);
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey() +":"+me.getValue());
		}
		System.out.println("------------------------------------------------------");
		ss = map1.keySet();
		for (Object obj : ss) {
			System.out.println(obj+":"+map1.get(obj));
		}
		System.out.println("------------------------------------------------------");
//		vlaue들만 묶여 있어서 key를 찾을수 없다
		Collection vv = map1.values();
		for (Object obj : ss) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------------------------");
//		key를 지운다 , Value를 지울 때는 value를 쓴다
		Iterator it= map1.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry me = (Map.Entry)it.next();
				System.out.println(me.getKey()+":"+me.getValue());
				if(me.getKey().equals("자잠면")) {
					it.remove();
				}
				if(me.getValue().equals("포유류")) {
					it.remove();
				}
			}
		System.out.println(map1);
		System.out.println(map1.isEmpty());
		map1.clear();
		System.out.println("------------------------------------------------------");
		System.out.println(map1);
		System.out.println(map1.isEmpty());
	}

}
