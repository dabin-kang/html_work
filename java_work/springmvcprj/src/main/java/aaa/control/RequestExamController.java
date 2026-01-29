package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.mmm.StudExam;


@Controller
@RequestMapping("/req")
public class RequestExamController {
	
	@GetMapping("getExam")
	String reqexam() {
		return "req/reqexam";
	}
	
	
	@PostMapping("resexam")
	String resexam(
			
			@ModelAttribute("prexam") StudExam pr
			) {
		System.out.println(pr);
		return "req/resexam";
	}
	
	
}
