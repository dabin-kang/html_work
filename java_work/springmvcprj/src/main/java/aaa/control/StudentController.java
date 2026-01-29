package aaa.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Student;

@Controller
@RequestMapping("/student/{cate}") // 맨처음 들어오는 경로설정
public class StudentController {
	
	@RequestMapping("sss/{service}")
	String sss(@PathVariable("cate")String cate) {
		return "student";
	}
	
	
//	
//		list.add(new Student("강백호",75,80,15));
//		list.add(new Student("서태웅",65,30,15));
//		list.add(new Student("채치수",95,20,95));
		
	

	
	
	
	
	
}
