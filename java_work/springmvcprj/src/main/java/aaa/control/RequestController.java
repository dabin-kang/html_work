package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import aaa.SpringmvcprjApplication;
import aaa.mmm.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/req")
public class RequestController {

    private final SpringmvcprjApplication springmvcprjApplication;

    private final HomeController homeController;


    RequestController(HomeController homeController, SpringmvcprjApplication springmvcprjApplication) {
        this.homeController = homeController;
        this.springmvcprjApplication = springmvcprjApplication;
    }
	
	
	// /req/getGo
	//get방식으로 진입
	//getGo로 들어오면 실행된다
	@GetMapping("getGo")
	String form() {
		return"req/form"; // forwoding 과 같다
	}
	
	@GetMapping("mem")
	String form(HttpServletRequest request,
			@RequestParam("pname")String pn,
			@RequestParam(name="age",defaultValue="20")int aaa,//값이 없으면 defaultValue="20" 기본값을 준다
			@RequestParam("marriage")boolean mem
			) {
		System.out.println("mem1 : " 
				+ request.getParameter("pname")+","
				+ request.getParameter("age")+","
				+ request.getParameter("marriage")+","				
		);
		System.out.println("mem @RequestParam : "+pn+aaa+mem);
		return"req/mem1"; 
	}
	
	
	@PostMapping("mem")
	String form2(HttpServletRequest request,
			@RequestParam("pname")String pn,
			@RequestParam(name="age",defaultValue="27")int aaa,
			@RequestParam("marriage")boolean mmm,
			Model md //requestAttribute 설정
			) {
		System.out.println("mem2 : " 
				+ request.getParameter("pname")+","
				+ request.getParameter("age")+","
				+ request.getParameter("marriage")+","				
		);
		System.out.println("mem2 @RequestParam : "+pn+aaa+mmm);
		md.addAttribute("pn",pn);
		return"req/mem1"; 
	}
	
	
	
	@RequestMapping(value="mem3", method = RequestMethod.GET)
	String mem31(
			@ModelAttribute("pname")String pn,//parameter:pname ==> attribute로 인지하고 있다
			@ModelAttribute("age")int aaa  // 초기값을 줄수 없다
			//@ModelAttribute("mmm")boolean mmm  //parameter 이름을 맟춰서 줄수가 없다
			) { 
		System.out.println("mem31 : "+pn+aaa);
		return "req/mem3";
	}
	

	
	@RequestMapping(value="mem3", method = RequestMethod.POST)
	String mem32(
			//String pname// 에러발생, 어노테이션 없이 기본 자료형태는 대입불가능
			Person pr  //멤버 setter 에 맞게 parm대입 ,  다른 패키지에서 들고와서 대입사용가능
			) {
		System.out.println("mem32 : "+pr);
		return "req/mem32";
	}
	
	@RequestMapping("mem4")
	String mem4(@ModelAttribute Person pr) { //멤버 setter 에 맞게 parm대입 Attribute값을 설정한다 
												//Attribute 
		System.out.println("mem4 : "+pr);
		return "req/mem4";
	}
}


/*
 * RequestExamController
 * 
 * 폼 입력 : 이름, 국어 ,영어, 수학
 * 
 * 출력 : 이름 , 국어 ,영어 ,수학 , 총점 , 평균 , 등급
 * 
 */















