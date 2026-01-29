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
@RequestMapping("/initGo2")
public class InitController2 {
	
	@RequestMapping
	void gogogo(Person per) {
		System.out.println("gogogo2실행 : "+per);
	}

}






