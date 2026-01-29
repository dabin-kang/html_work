package aaa.control;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class InterceptorController {
	
	@RequestMapping("envent/abc")
	String envent1() {
		return"abc이벤트 중";
	}
	
	@RequestMapping("envent/dfg")
	String envent2() {
		return"dfg이벤트 중";
	}
	
	@RequestMapping("envent/hij")
	String envent3() {
		return"hij이벤트 중";
	}
	
	@RequestMapping("expire")
	String expire() {
		return"이벤트 종료";
	}
	

	
}




/*
 * 
 * /path 이후의 경로는 로그인 : aaa만 접근가능
 * /path/info/ddd/insert 제외
 * 
 */









