package aaa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;

@Controller
public class ExamController {
	
	@Resource
	ExamMapper mapper;
	
	
	@RequestMapping("/fvrgvrbh/{service}")
	String exam(Model mm, @PathVariable("service")String ii) {
		List<ExamDTO>res = mapper.list();
		mm.addAttribute("mainData",res);// jsp 파일에 데이터를 넘겨주기 위해서 Model mm 생성한다
		System.out.println(ii);
		return "examList";
	}
	
}
