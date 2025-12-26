package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		Object [] data = {33,11,'a',55,97,33,55,11,33,"11","onop","onop"};
		
		ArrayList arr1 = new ArrayList();//ArrayList 중복을 허용하고 , 순서가 존재한다
		HashSet ss1 = new HashSet();	// HashSet중복이 되지 않고 , 순서가 없다.
		
		for (Object dd : data) {
			arr1.add(dd);
			ss1.add(dd);
		}
		System.out.println(Arrays.toString(data));//[33, 11, a, 55, 97, 33, 55, 11, 33, 11, onop, onop]
		System.out.println(arr1);//[33, 11, a, 55, 97, 33, 55, 11, 33, 11, onop, onop]
		System.out.println(ss1);//[11, 33, a, 97, onop, 55, 11] 문자와 숫자는 구분이 된다.
//		System.out.println(ss1.get(0)); // get를 사용 할 수 없다
//		ss1.newHashSet(5,10);
		
		System.out.println("ss1--------------------------------------------------------");
		for (Object oo : ss1) {
			System.out.println(oo);
		}
		System.out.println("ss1--------------------------------------------------------");
		
		
		Iterator it = ss1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("HashSet1--------------------------------------------------------");
//		HashSet ss2 = new HashSet(data);
		HashSet ss3 = new HashSet(arr1);
		HashSet ss4 = new HashSet(ss1);
		HashSet ss5 = ss1;
		HashSet ss6 = (HashSet)ss1.clone();
		HashSet ss7 = new HashSet();
		HashSet ss8 = new HashSet();
		ss7.addAll(arr1);
		ss8.addAll(ss1);
		
		System.out.println("ss3 : "+ss3);
		System.out.println("ss4 : "+ss4);
		System.out.println("ss5 : "+ss5);
		System.out.println("ss6 : "+ss6);
		System.out.println("ss7 : "+ss7);
		System.out.println("ss8 : "+ss8);
		
		System.out.println("ss1==ss3 : "+(ss1 ==ss3));
		System.out.println("ss1==ss4 : "+(ss1 ==ss4));
		System.out.println("ss1==ss5 : "+(ss1 ==ss5));
		System.out.println("ss1==ss6 : "+(ss1 ==ss6));
		System.out.println("ss1==ss7 : "+(ss1 ==ss7));
		System.out.println("ss1==ss8 : "+(ss1 ==ss8));
		
		System.out.println("HashSet2--------------------------------------------------------");
//		equals : 안에 있는 원소를 비교
		System.out.println("ss1.equals(ss3) : "+(ss1.equals(ss3)));
		System.out.println("ss1.equals(ss4) : "+(ss1.equals(ss4)));
		System.out.println("ss1.equals(ss5) : "+(ss1.equals(ss5)));
		System.out.println("ss1.equals(ss6) : "+(ss1.equals(ss6)));
		System.out.println("ss1.equals(ss7) : "+(ss1.equals(ss7)));
		System.out.println("ss1.equals(ss8) : "+(ss1.equals(ss8)));
		
		System.out.println("ArrayList로 뽑아내기--------------------------------------------------------");
		ArrayList arr2 = new ArrayList(ss1);
		ArrayList arr3 = new ArrayList();
		arr3.addAll(ss1);
		
		System.out.println(arr2);
		System.out.println(arr3);
		
		
		System.out.println("삭제하기 remove--------------------------------------------------------");
//		11삭제한다
		ss1.remove(11);
		System.out.println(ss1);
		ss1.remove("ONOP");
		System.out.println(ss1);
		
		Object [] data2 = {33,44,55,66,33,44,55,6,66,"아기문어"};
		ArrayList arr4 = new ArrayList();
		for (Object object : data2) {
			arr4.add(object);
		}
		System.out.println(arr4);
		ss1.remove(arr4);
		System.out.println(ss1);
		
//		교집합만 남기기
		System.out.println(ss3);
		ss3.retainAll(arr4);
		System.out.println(ss3);
		System.out.println(ss3.isEmpty());
		
		System.out.println(ss3);
		ss3.clear();
		System.out.println(ss3);
		System.out.println(ss3.isEmpty());
		
		
		
		ArrayList lotto1 = new ArrayList();
		HashSet lotto2 = new HashSet();
		
		while(true) {
			int no = (int)(Math.random()*45+1);
			
			lotto1.add(no);
			lotto2.add(no);
			
			if(lotto2.size()==7) {
				break;
			}
		}
		
		System.out.println("lottl1 : "+lotto1); // 중복된다
		System.out.println("lottl2 : "+lotto2); // 중복이 안된다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
