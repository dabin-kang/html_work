package inter_p;

//scv가 하는 일을 interface로 나눈다
//미네랄 채취 , 건물짓기 , 수리하기 , 탱크타기 , 공격하기  총 5개
	interface Gether{
		void MineralGether();
		void GasGether();
	}	
	interface Bild{
		void Bilder();
	}
	interface Fix{
		void Fixed();
	}
	interface Ride{
		void Rided();
	}
	interface Attact{
		void Attactd();
	}
	
	
	// 테란에서 scv가 하는 것들
	interface Teran extends Gether,Bild,Fix,Ride,Attact{ }
	
	class TeranImpl implements Teran{
		String name;
		
		public TeranImpl(String name) {
			this.name = name;
		}

		@Override
		public void MineralGether() {
			System.out.println("미네랄 채취");
			
		}

		@Override
		public void GasGether() {
			System.out.println("가스 채취");
			
		}

		@Override
		public void Rided() {
			System.out.println("탱크 타기");
			
		}

		@Override
		public void Fixed() {
			System.out.println("수리하기");
			
		}

		@Override
		public void Bilder() {
			System.out.println("건설하기");
			
		}

		@Override
		public void Attactd() {
			System.out.println("공격하기");
			
		}
	}
	
	

public class StarMain {
	public static void main(String[] args) {
		TeranImpl AA = new TeranImpl("Scv");
		Gether mi;
		
		// scv 만들기 
		
		
		
		mi = AA;
		mi.MineralGether();
		mi.GasGether();
		System.out.println();
		
	}

}


//인터페이스 부터 몇개가  필요한지 구분하기
//메소드 
// 구현체 구현하기

// 1> 미네랄 채취하기 & 가스 채취하기
// 커맨드센터 , 미네랄 , 가스 가 존재해야 한다.
// scv가 미네랄 값을 들고 커맨드센터에 가서 내려놓는다
// 커맨드 센터에 총 자원량이 올라간다

// 2> 건물짓기
// 총 미네랄 , 가스의 총 자원량 을 알아야 한다 
// ( 총 자원량 - 건물을 짓는 비용)
// 건물을 짓는다 = 미네랄과 가스를 소모한다


/*
스타크래프트를 구현하세요

scv -4기를 이용하여 작업
커맨드센터 : 미네랄 400
팩토리 : 미네랄 200, 가스 100
스타포트 : 미네랄 150, 가스 100

scv 1회 획득량  미네랄 : 8, 가스 : 8


커맨드 센터 --2 짓기
스타포트-1 짓기 1  수리
팩토리-2 짓기
미네랄-500
탱크-2대 수리
탱크 타기 -3
저그 공격 : 5마리


각 작업간 log 기록을 남기고
각 scv 의 작업결과와
전체 상황 log를 기록하세요
*/