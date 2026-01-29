package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.MyProvider;
import aaa.di.MyAction;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/pc/{service}")
public class PathContextController {
	
	@Resource
	MyProvider provider;
	
	
	@ModelAttribute("mainData")
	Object mainData(@PathVariable("service")String service) {
		MyAction action = provider.getContext().getBean(service,MyAction.class);
		return action.execute();
	}
	

	@RequestMapping
	String view() {
		return"pc";
	}
}

/*
 * 학생목록 학생상세 학생추가 를 구현하기
 * 
 * 학생정보 : id,국어,영어,수학. 총점. 평균
 */


