package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		int [] arr = {11,22,33,44};
		List arr1 = new ArrayList();
//		List arr2 = new ArrayList(arr);
		System.out.println("CRUD=---------------------------");
//		arr1 : []
		System.out.println("arr1 : "+arr1);

		
		arr1.add(10);
		arr1.add(5);
		arr1.add(30);
		arr1.add(10);
		arr1.add(40);
		arr1.add(10);
		arr1.add(5);
//		arr1 : [10, 5, 30, 10, 40, 10, 5]
		System.out.println("arr1 : "+arr1);
		
//		add : 다른 자료형을 넣을 수 있다
//		arr : [10, 5, 30, 10, 40, 10, 5, 나는 수달, 123.456, true, [I@5674cd4d, Mon Dec 22 09:50:49 KST 2025, []]
		arr1.add("나는 수달");
		arr1.add("123.456");
		arr1.add("true");
		arr1.add(new int [] {987,654,123});
		arr1.add(new Date());
		arr1.add(new ArrayList());
		arr1.add("맹구");
		System.out.println("arr : "+arr1);
		
//		원하는 번호에 원소를 넣을 수 있다
//		중간추가 : [10, 5, 아기상어, 30, 10, 40, 10, 5, 나는 수달, 123.456, true, [I@5674cd4d, Mon Dec 22 09:52:07 KST 2025, []]
		arr1.add(2,"아기상어");
		System.out.println("중간추가 : "+arr1);
		
		
//		인덱스 번호로 가져오기
//		get : 5
		Object oo = arr1.get(1);
		System.out.println("get : "+oo);
		
		
//		없는 인덱스 요청에 따라 에러
//		at coll_p.ArrayListMain.main(ArrayListMain.java:49)
//		Object oo = arr1.get(13);
//		System.out.println("get : "+oo);
		
		
		oo = arr1.getFirst();
		System.out.println("getFirst : "+oo);
		oo = arr1.getLast();
		System.out.println("getLast : "+oo);
		
//		length가 아니라 size로 원소 길이를 본다
//		getsize : 14
		System.out.println("getsize : "+arr1.size());
		
		
//		set : [10, 5, 아기상어, 30, 10, 40, 10, 짱구는 말려, 나는 수달, 123.456, true, [I@5674cd4d, Mon Dec 22 10:12:50 KST 2025, []]
//		존재하지 않는 인덱스 번호에 넣을 수는 없다
		arr1.set(7, "짱구는 말려");
		System.out.println("set : "+arr1);
		
		
//		5번째 인덱스 번호를 삭제한다
		oo = arr1.remove(5);
		System.out.println("remove : "+arr1);
		System.out.println("삭제한 요소 : "+oo);
		
//		문자는 인덱스 번호가 아니라 해당 문자를 찾아서 삭제한다
//		객체가 삭제를 성공 했다 실패했다는 유무를 출력
		boolean bo = arr1.remove("나는 수달");
		System.out.println("remove : "+arr1+",");
		
//		true
		System.out.println(bo);
		bo = arr1.remove("엄마수달");
		System.out.println("remove : "+arr1+",");
		
//		false
		System.out.println(bo);
		
//		5를 선택해서 삭제 하기
//		삭제하려는 원소가 중복되는 경우에는 맨 앞에서 부터 삭제
//		int는 (Object)로 형변환을 해서 선택 삭제를 할 수 있다
//		remove : [10, 아기상어, 30, 10, 10, 짱구는 말려, 123.456, true, [I@5674cd4d, Mon Dec 22 10:26:19 KST 2025, [], 맹구],
		bo = arr1.remove((Object)5);
		System.out.println("remove : "+arr1+",");
		System.out.println(bo);
		
		oo = arr1.removeFirst();
		System.out.println("removeFirst : "+arr1+",");
		System.out.println("삭제한 요소 : "+oo);
		oo = arr1.removeLast();
		System.out.println("removeLast: "+arr1+",");
		System.out.println("삭제한 요소 : "+oo);
		
		
		System.out.println("contains=---------------------------");
		
//		contains : 검색 하기 존재하면 ture , 없으면 false
		System.out.println("contains : " +arr1.contains(123));
		System.out.println("contains : " +arr1.contains(9999));
		System.out.println("indexOf : " +arr1.indexOf(123.456));
		System.out.println("indexOf : " +arr1.indexOf(987.654));
		
		arr1.add(5,10);
		System.out.println("arr1 : "+arr1);
		System.out.println("indexOf : "+arr1.indexOf(10));
		
//		몇 번 째 부터 찾을거야 라는 개념은 없음
//		System.out.println("indexOf : "+arr1.indexOf(10,2));
		
//		마지막에서 부터 찾는 lastIndexOf는 사용 가능
		System.out.println("lastIndexOf : "+arr1.lastIndexOf(10));
		
		
		System.out.println("Object 추출=---------------------------");
//		[Ljava.lang.Object;@17a7cec2
//		[아기상어, 30, 10, 10, 짱구는 말려, 10, 123.456, true, [I@5674cd4d, Mon Dec 22 10:39:54 KST 2025, []]
		Object [] arr2 = arr1.toArray();
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
//		arr3 : [10, 10, 짱구는 말려, 10]
//		2,3,4,5 까지 출력
		List arr3 = arr1.subList(2, 6); // shallow copy
		List arr4 = new ArrayList(arr3);// deep copy
		System.out.println("arr3 : "+arr3);
		System.out.println("arr4 : "+arr4);
		
//		false
		System.out.println(arr1.subList(2,6) == arr3);
		
//		false
		System.out.println(arr1.subList(2,6) == arr4);
		
		arr1.set(4, 2468); // 원본에서 변경 --> sublist 변경
		arr1.add(3,5566);  // 원본에서 추가 --> sublist  에러발생(연결끊김)
		System.out.println("arr1 : "+arr1);//arr1 : [아기상어, 30, 10, 10, 2468, 10, 123.456, true, [I@5674cd4d, Mon Dec 22 10:46:55 KST 2025, []]
		//System.out.println("arr3 : "+arr3);//arr3 : [10, 10, 2468, 10] , 에러가 생긴다
		System.out.println("arr4 : "+arr4);//arr4 : [10, 10, 짱구는 말려, 10]
		
		
		
		System.out.println("all=---------------------------");
		List arr5 = new ArrayList();
		arr5 .add(100);
		arr5 .add(300);
		arr5 .add(100);
		arr5 .add(400);
		
		arr1.addAll(arr5);
		System.out.println("addAll : "+arr1);
//		[아기상어, 30, 10, 5566, 10, 2468, 10, 123.456, true, [I@5674cd4d, Mon Dec 22 11:15:39 KST 2025, [], 100, 300, 100, 400]
		
		List arr6 = new ArrayList();
		arr6 .add(100);
		arr6 .add(600);
		arr6 .add(400);
		
		System.out.println(arr1.containsAll(arr5));//true
		
//		arr6의 요소가 다 존재하는지
		System.out.println(arr1.containsAll(arr6));//false
		
		List arr7 = new ArrayList();
		arr7 .add(5566);
		arr7 .add(300);
		arr7 .add(998877);
		
//		교집합을 지우기
		arr1.removeAll(arr7);
		System.out.println("removeAll : "+arr1);
		
//		arr6에 있는 것만 남기기, 교집합을 남긴다
//		retainAll : [100, 100, 400]
		arr1.retainAll(arr6);
		System.out.println("retainAll : "+arr1);
		
//		비어있는지 아닌지 확인, ture , flase
//		false
		System.out.println(arr1.isEmpty());
		
		
		arr1.clear();
//		arr1 을 비운다[]
		System.out.println(arr1);
		System.out.println(arr1.isEmpty());
//		true
		
		
		System.out.println("[[Collections]]");
		System.out.println("arr5 : "+arr5); //arr5 : [100, 300, 100, 400]
		Collections.replaceAll(arr5, 100, "백");
		System.out.println("arr5 : "+arr5);//arr5 : [백, 300, 백, 400]
		
		Collections.reverse(arr5);
		System.out.println("reverse: "+arr5);
		
		Collections.swap(arr5,0,2);
		System.out.println("swap: "+arr5);
		
		Collections.shuffle(arr5);
		System.out.println("shuffle: "+arr5);
		arr6.add(500);
		arr6.add(100);
		arr6.add(300);
		arr6.add(400);
		arr6.add(800);
		arr6.add(200);
		System.out.println("arr6 : "+arr6);
		

//		Collections.sort(arr5);//요소가 모두가 비교가능해야 함, 자료형이 같아야 한다
		Collections.sort(arr6);//arr6 : [100, 600, 400, 500, 100, 300, 400, 800, 200]
		System.out.println("Sort : "+arr6);//Sort : [100, 100, 200, 300, 400, 400, 500, 600, 800], 순서대로 정렬되어서 나온다
		
		
		System.out.println("[[copy]]");
		List arr8 = arr6;	//shallow copy
		List arr9 = (List)((ArrayList)arr6).clone();//deep copy
		List arr10 = new ArrayList(arr6);			//deep copy
		
		System.out.println(arr6 == arr8);
		System.out.println(arr6 == arr9);
		System.out.println(arr6 == arr10);
		
		System.out.println("arr6 : " + arr6);//arr6 : [100, 100, 200, 300, 400, 400, 500, 600, 800]
		System.out.println("arr8 : " + arr8);//arr8 : [100, 100, 200, 300, 400, 400, 500, 600, 800]
		System.out.println("arr9 : " + arr9);//arr9 : [100, 100, 200, 300, 400, 400, 500, 600, 800]
		System.out.println("arr10 : " + arr10);//arr10 : [100, 100, 200, 300, 400, 400, 500, 600, 800]
		
		arr6.set(3,3456);
		System.out.println("arr6 : " + arr6);//arr6 : [100, 100, 200, 3456, 400, 400, 500, 600, 800]
		System.out.println("arr8 : " + arr8);//arr8 : [100, 100, 200, 3456, 400, 400, 500, 600, 800]
		System.out.println("arr9 : " + arr9);//arr9 : [100, 100, 200, 300, 400, 400, 500, 600, 800]
		System.out.println("arr10 : " + arr10);//arr10 : [100, 100, 200, 300, 400, 400, 500, 600, 800]
		
		
	}

}
