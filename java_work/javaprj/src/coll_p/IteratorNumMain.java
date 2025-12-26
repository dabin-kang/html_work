package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorNumMain {

	public static void main(String[] args) {
		int [] arr = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29};
		List sumList = Arrays.asList(arr);
		
//		각 배수를 저장할 ArrayList를 생성한다.
		ArrayList sum2 = new ArrayList();
		
//		2배수 찾기
		Iterator it2 = sumList.iterator();
	}
}
