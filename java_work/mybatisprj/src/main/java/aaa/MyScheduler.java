package aaa;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyScheduler {
	
	//동기방식으로 처리하기
//	@Scheduled(fixedRate = 5000)
	public void gogogo1() {
		System.out.println("5초 마다 실행");
	}
	
	//	* 		   *		*		  *		  *		    *
	//초(0-59)	분(0-59)  시간(0-23) 	일(1-31) 월(1-12)  요일(0-7)
//	@Async //비동기로 처리 --- 사용하려면 AsyncConfig 사용설정이 필요하다
//	@Scheduled(cron= "0 * * * * *")
	public void gogogo2() {
		System.out.println("0초 정각 마다 실행");
	}
}
