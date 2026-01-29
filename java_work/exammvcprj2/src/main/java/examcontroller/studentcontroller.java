package examcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import examDTO.ExamDTO;

@Controller
@RequestMapping()
public class studentcontroller {
	
	@RequestMapping("/")
	Object ww () {
		ExamDTO stu = new ExamDTO ();
		stu.setName("장동건");
		stu.setKor(50);
		stu.setEng(70);
		stu.setMat(47);
		return stu;
	}
	
	
}
