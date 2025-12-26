package coll_p;

import java.util.TreeMap;



class TreeShape {
	int rr,wi,hi,ss;
	int ar,si;
	String[] pname = {"원","직사각형","직각삼각형"};
	
	TreeMap tm = new TreeMap();
	
	for(String i: tm) {
		((Object) tm).add(pname);
	}
	
	TreeShape(int wi, int hi, int ss) {
		ar = wi*hi/2;
		si = (wi+hi)*2;
		
		System.out.println("직사각형"+ar);		
		System.out.print("직사각형"+si);		
	}

	TreeShape(int wi, int hi) {
		this.wi = wi;
		this.hi= hi;
		System.out.println(wi+hi);		
	}
	TreeShape(int rr ) {
		this.rr = rr;
		ar = (int)(rr*2*Math.PI);
		System.out.println(rr);
		System.out.println("원 넓이 : "+ar);
	}
}	

public class TreeMapShapeMain {

	public static void main(String[] args) {
		TreeShape [] sh = {
			new TreeShape(10), 	
			new TreeShape(15,10), 	
			new TreeShape(25,25), 	
			new TreeShape(25,25,5), 	
		};
	}
}


/*
 * 도형이름별로 카테고리화 하고 정렬하여 출력하세요
 * 도형 정보 : 이름 ,넓이,둘레
 * 
 * 정렬순서: 이름 - 직각삼각형 >원> 직사각형
 * 넓이(오름차순)
 * 둘레(내림차순)
 * 
 * 이름,넓이.둘레, 모두 같을 경우 생략
 * 
 * 
 */