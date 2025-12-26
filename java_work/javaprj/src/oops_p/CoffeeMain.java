package oops_p;

import java.util.Arrays;

public class CoffeeMain {

	static class CoffeeShop{
		String name;
		String []  title = "아메리카노,아시아라노,아프리카노".split(",");
		
		CoffeeShop(String name){
			this.name = name;
			
			System.out.println(name);
			System.out.println(Arrays.toString(title));
		}
		
		
		
		@Override
		public String toString() {
			return "CoffeeShop [" + name + "," + Arrays.toString(title) + "]";
		}



		class Area{
			String name;
			
			Area(String name){
				this.name = name;
				
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		CoffeeShop c1 = new CoffeeShop("하삼동");
		CoffeeShop c2 = new CoffeeShop("상남동");
		
		CoffeeShop.Area [] AAA = {
				c1.new Area("창원"),
				c1.new Area("진주"),
				c1.new Area("김해"),
				c2.new Area("부산"),
				c2.new Area("통영"),
				c2.new Area("창원")	
		};
		System.out.println(AAA);
		
		
		
	}

}

/*
 * 커피 전문점을 구현하세요
 * 
 * 하삼동 상남동
 * 지역별로 커피전문점이 존재
 * 
 * 하삼동 - 창원,진주,김해
 * 상남동 - 창원,부산,통영
 * 
 * 아메리카노 : 2000 , 2100
 * 아시아라노 : 2300 , 2500
 * 아프리카노 : 2700 , 2200
 * 
 * 각지점이 커피를 주문받으세요
 * (각지점에서만 주문가능)
 * 
 * 각 지점별 커피 판매내역과
 * 총판 커피 판매 내역을 출력하세요
*/