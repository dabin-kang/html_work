package coll_p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MapNumMain {

	public static void main(String[] args) {
		int [] arr = {
			22,4,56,90,12,3,45,6,22,31,45,63,86,57	
		};
		ArrayList arr1 = new ArrayList();
		for(int aa : arr) {
			arr1.add(aa);
		}
		System.out.println(arr1);
		ArrayList arr2 = new ArrayList();
		ArrayList arr3 = new ArrayList();
		ArrayList arr5 = new ArrayList();
		ArrayList arr6 = new ArrayList();
		ArrayList arr7 = new ArrayList();
		ArrayList arr8 = new ArrayList();
		
		Iterator AA =arr1.iterator();
		while(AA.hasNext()) {
			int i = (int)AA.next();
			System.out.println(i);
			if(i%2==0) {
				arr2.add(i);
			}
			if(i%3==0) {
				arr3.add(i);
			}
			if(i%5==0) {
				arr5.add(i);
			}
		}
		System.out.println("2"+arr2);
		System.out.println("3"+arr3);
		System.out.println("5"+arr5);
		
		
		System.out.println("약수 개수 구하기-------------------------------------------");
		Iterator BB =arr1.iterator();
	
	}

}
