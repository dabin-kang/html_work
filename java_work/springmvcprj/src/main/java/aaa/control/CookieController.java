package aaa.control;

import java.util.Map;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/coo")
public class CookieController {
	
	@RequestMapping("make")
	String make1(HttpServletResponse response) {
		response.addCookie(new Cookie("pid","aaa"));
		response.addCookie(new Cookie("pname","말랑말랑"));
		return "쿠키생성";
	}
	
	
	@RequestMapping("view")
	Object make1(
			@CookieValue(value = "pid")String pid,
			@CookieValue(value = "pname")String pname,
			@CookieValue(value = "nick", defaultValue = "아기상어")String nick, //nick 객체를 생성하지 않아도 defaultValue로 만들수 있다 
			@CookieValue(value = "age", defaultValue = "43")int age
			) {
		return Map.of(
				"pid",pid,
				"pname",pname,
				"nick",nick,
				"age",age
				);
	}
	
	
	@RequestMapping("modify")
	String modify(HttpServletResponse response) {
		response.addCookie(new Cookie("pid","bbb")); // 쿠키보기를 bbb로 수정 한다
		response.addCookie(new Cookie("age","29")); 
		return "쿠키수정";
	}
	
	
	
	  @RequestMapping("delete") 
	  String delete(HttpServletResponse response) {
		  Cookie coo = new Cookie("pid","");
		  coo.setMaxAge(0);
		  response.addCookie(coo);
		  coo = new Cookie("pname","");
		  coo.setMaxAge(0);
		  response.addCookie(coo);
		  coo = new Cookie("nick","");
		  coo.setMaxAge(0);
		  response.addCookie(coo);
		  coo = new Cookie("age","");
		  coo.setMaxAge(0);
		  response.addCookie(coo);
	   return "쿠키삭제"; }
}


/*
 *쿠키를 이용하여 로그인 만들기 
 *로그인시 확인 정보 : 아이디 , 암호 
 *로그인후 노출 정보 : 아이디 , 이름
 *로그아웃 노출 정보 : 이
 */








