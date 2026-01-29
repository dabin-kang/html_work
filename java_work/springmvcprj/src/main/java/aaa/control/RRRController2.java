package aaa.control;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;

import aaa.mmm.Address;
import aaa.mmm.BuyOrder;
import aaa.mmm.Person;
import aaa.mmm.Product;
import aaa.mmm.Stud;
//restcontroller

@RestController // @Controller + @ResponseBody : 리턴값으로 화면출력
@RequestMapping("/rest")
public class RRRController2 {
	
	@RequestMapping("vv") // 제일 자주 쓴다
	String vv(Model mm) {
		mm.addAttribute("pname","장동건");
		return"/ret/vv";
	}
	
	@RequestMapping("moAndvv")
	ModelAndView moAndvv() { // @@RestController 이어도 view페이지  forwarding
		ModelAndView  mav = new ModelAndView ("/ret/vv");// view page
		mav.addObject("pname","장서건"); // request.attribute
		return mav;
	}
	
	@RequestMapping(path = {"pp1","pp2"})
	String even(Model mm) {
		mm.addAttribute("pname","장동건");
		return"/ret/vv";
	}
	
	@RequestMapping("vv2")
	String vv2() {
		return"아기상어"; // view 페이지로 이동하여 에러발생
		/*설정이 /WEB-INF/views/와 .jsp라면: 최종 경로: /WEB-INF/views/아기상어.jsp*/
	}
	
	
	@RequestMapping("vv3")
	String vv3() {
		return"엄마상어"; // 화면에 출력
	}
	
	
	//json 형태로 빼기
	@RequestMapping("per")
	Object per() {
		Person res = new Person();
		res.setPname("한가인");
		res.setAge(41);
		res.setMarriage(true);
		return res; // 화면에 출력
	}
	
	
	
	@RequestMapping("arr")
	Object arr() {
		return new int[]{11,22,33,44}; // [11,22,33,44]  배열로 json출력
	}
	
	// getter를 보기 좋게 빼주기 , 다양한 형태로 받을 수 있다
	
	@RequestMapping("map")
	Object mapp() {
		LinkedHashMap res = new LinkedHashMap();
		res.put("사자", "포유류");
		res.put("100", new String[] {"문어","고래","거북이"});
		
		Stud st = new Stud();
		st.setPname("이관재");
		st.setKor(92);
		st.setEng(91);
		st.setMat(82);
		
		res.put("mapp", st);
		
		return res;
	}
	
	@RequestMapping("obj1")
	Object obj1() {
		BuyOrder res = new BuyOrder();
		
		res.setAd(new Address("123456","경남창원시국구구동옹","테크노파크707"));
		
		List<Product>list = new ArrayList<>();
		list.add(new Product("텀블러",2000,5));
		list.add(new Product("마우스",12000,3));
		list.add(new Product("키보드",50000,2));
		list.add(new Product("모니터",30000,1));
		
		res.setProds(list);
		return res;
	}
	
	@RequestMapping("obj2")
	Object obj2() {
		
		JsonObject res = new JsonObject();//Json으로 만들어서 객체생성 후 String으로 리턴을 하겠다
		res.addProperty("title", "제목이야");
		res.addProperty("cnt", 123);
		res.addProperty("vv", true);
		res.addProperty("content", "내용이지");
		
		return res.toString();
		// 문자열로 치환해서 리턴 내보낸다는 내용
		//{"title":"제목이야","cnt":123,"vv":true,"content":"내용이지"}
	}
}


/*
 spring
 exammvcprj ==> 학생 5명의 정보를 json 형태로 출력
 
 react 
 examprj => 5명의 정보 list 형태로 출력
  
 */






