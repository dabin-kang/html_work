package aaa.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;


@RestController
@RequestMapping
public class ExamController {
	
	
	@Resource
	ExamMapper mapper;
	
	
	@RequestMapping("/examDetail/{id}")
	public ExamDTO exam(ExamDTO dto) {
		ExamDTO res = mapper.detail(dto);
		System.out.println("exam"+res);
		return res;
	}
	

	
	
}
