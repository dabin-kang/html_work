package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.di.LoginData;
import aaa.di.LoginValidator;

@Controller
@RequestMapping("vallogin")
public class LoginValidatorController {
	
	@GetMapping
	String form() {
		return"vallogin/form";
	}
	
	
	@PostMapping
		String comp(LoginData lod ,BindingResult res) {
		new LoginValidator().validate(lod, res);
		if(res.hasErrors()) {
			
			return "vallogin/form";
		}
		return"vallogin/compp";
	}
}
