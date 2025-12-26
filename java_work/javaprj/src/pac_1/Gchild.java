package pac_1;

import pac_2.GGG;

public class Gchild extends GGG {
	
	void meth(){
		System.out.println("Ghcild.meth 시작-----------------");
		
//		System.out.println(".a:"+a); // publc만 가능
		System.out.println(".b:"+b);
		System.out.println(".c:"+c);
//		System.out.println(".c:"+d);
//		mm1();
		mm2();
		mm3();//protected 가능 
//		mm4();
		System.out.println("Ghcild.meth 끝-----------------");
	}

}
