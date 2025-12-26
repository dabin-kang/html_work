package oops_p;


class ClaShape{
	private String name;
	private int area, broder;
	
	
	public ClaShape(int w, int h) {
		neme = "직사각형";
		area = w*h;
		border = (w+h)*2;
	}
	
	pulic
	
	
	

public class ShapeMain {
		
	public static void main(String[] args) {
		ClaShape [] shape = {
				new CapShape(5),
				new CapShape(5,6),
				new CapShape(10),
				new CapShape(10,10)
		};
		
		for(ClaShape cs : shapes) {
			cs.ppp();
		}
	}
}
}





/*
{5},
{5,6},
{5,6,8},
{10,4},
{8},
{10,6,13}
}

도형의 넓이와 둘레를 출력하세요

도형명			선분 	 				넓이	 						둘레
원	 			반지름	 			반지름*반지름*pi 	 		반지름*2*pi
직사각형	 		가로, 세로 	 		가로*세로	 				(가로+세로)*2
직각삼각형	 	밑변, 높이, 빗변	 	밑변*높이/2	 			밑변+높이+빗변
* */