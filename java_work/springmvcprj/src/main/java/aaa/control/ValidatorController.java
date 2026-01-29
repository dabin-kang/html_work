package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.di.PersoValidator;
import aaa.mmm.Person;

@Controller
@RequestMapping("val")
public class ValidatorController {
	
	@GetMapping
	String form() {
		return"val/form";
	}
	
	
	@PostMapping
	String complete(Person pp,BindingResult res) {
		
		new PersoValidator().validate(pp, res);
		
		if(res.hasErrors()) {//에러가 존재하면
							//validate(pp, res);에서jerrors.rejectValue 가 실행되면
							// form으로 view 페이지 변경
			return"val/form";
		}
		
		return"val/complete";
	}
}
