package aaa.control;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.mmm.Person;

@RestController
@RequestMapping("/initGo")
public class InitController {
	
	@RequestMapping
	void gogogo(Person per) {
		System.out.println("gogogo실행 : "+per);
	}
	
	 
	// gogogo실행은 하지 않아도 실행한다
//	binder로 묶어준다
	@InitBinder
	void rtyu(WebDataBinder binder) {
		System.out.println("rtyu실행 : ");
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(sdf, true);
		
		binder.registerCustomEditor(Date.class, "birth",editor);
	}
	
}






