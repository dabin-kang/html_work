package abracatabra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {
	
	@RequestMapping("/")
	String home() {
		System.out.println("home 진입");
		return "index";
	}
}
