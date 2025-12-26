package dynamic;


class CarPar{
	String pname;
	int sp;// 속도
	int yb;// 연비
	int di;//디자인
		   //전재종류
	 	   //탑승인원
	
	void ppp() {
		System.out.println(pname +":"+sp +yb +di);
	}
}

class CarChilds extends CarPar{
	CarChilds(String pname, int sp, int yb , int di){
		this.pname = pname;
		this.sp = sp;
	};
}

public class CarMain {
	public static void main(String[] args) {
		  new CarChilds ("트럭",50,20,30).ppp();
	}
}


/*
 * 자동차 성능 테스트
 * 
 * 부모 : 자동차
 * 
 * 자식
 * 스포츠카 ; 속도 50 연비 20 디자인 30
 * 트럭 연비 60 적재종류 : 개당 10점
 * 승합차 속도 15 연비 35 탑승인원 50
 * 
 * 으로 성능점수를 계산하기
 */