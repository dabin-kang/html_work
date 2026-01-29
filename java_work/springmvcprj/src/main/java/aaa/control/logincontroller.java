package aaa.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/login")
public class logincontroller {
	
	@GetMapping
	String form() {
		return"login/login";
	}

	
	
	@RequestMapping("view")
	Object make() {
		loginData lod = new loginData();
		
		
		return "아이디 생성";
	}
	
}
