package aaa.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.mmm.Person;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class SessionLoginController {
	
	List<Person> pers;

	public SessionLoginController() {
		pers = new ArrayList<>();
		pers.add(new Person("aaa","장동건","1111"));
		pers.add(new Person("bbb","장서건","2222"));
		pers.add(new Person("ccc","장남건","3333"));
		pers.add(new Person("ddd","장동전","4444"));
		pers.add(new Person("eee","숏동건","5555"));
	}

	@GetMapping("/login")
	public String loginForm() {
		return"login/login";
	}
	
	
	@RequestMapping("/login")
	public String loginReg(
			@RequestParam("pid") String pid,
			@RequestParam("pw") String pw,
			HttpSession session) {
		
		for(Person p : pers) {
			if(p.getPid().equals(pid)&&p.getPw().equals(pw)) {
				session.setAttribute("user", p);
				return"redirect:/login/main";
			}
		}
		return "redirect:/login/login";
	}
	
	@GetMapping("/main")
	public void loginMainPage(HttpSession session) {
		
	}
	
	
	
	
}
