package aaa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;

@Controller
public class HomeController {
	
	@Resource
	ExamMapper mapper;
	
	@RequestMapping("/")
	String home(Model mm) {
		List<ExamDTO> res = mapper.list();
		mm.addAttribute("mainData", res);
		return"examList";
	}
}
