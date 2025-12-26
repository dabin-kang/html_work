package coll_p;

import java.util.Stack;

public class StackMp3Main {
	Object TrcakNum = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void goPlay(String play) {
		if(TrcakNum!= null) {
			back.push(TrcakNum);
		}
		ppp();
		System.out.println("현재음악"+TrcakNum);
		
	}
	
	public static void main(String[] args) {
		StackMp3Main mp = new StackMp3Main();
		mp.goPlay("음악1");
	}

}


/*
 * 노래듣기를 구현
 * 
 * 1. 노래정보 : 트랙번호, 노래제목, 가수
 * 2.노래리스트 --> next 에 넣기
 * 3.구현내용 다음곡,이전곡,트랙번호
 * 
 * */
