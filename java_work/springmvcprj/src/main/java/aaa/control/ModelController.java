package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Address;
import aaa.mmm.Product;

@Controller
@RequestMapping("/mmm")
public class ModelController {
	
	
	
	@ModelAttribute // 메소드를 호출 할 수 있게 해준다, 현재 컨트롤러에 진입시 attribute 자동생성
					// ptoduct 리턴 자료형을 이름으로 사용
	Object asdf() {
		System.out.println("asdf() 실행");
		return new Product("두쫀쿠", 6000, 3);
	}
	
	
	@ModelAttribute("pp1") // name : pp1
	Object qweer() {
		return new Product("말랑뮤즈", 16000, 2);// 뭐든 다 뺄 수 있다
	}
	
	@ModelAttribute("ad1") // name : pp1
	Object yuio(Address ad) {
		return ad;
	}
	
	
	@ModelAttribute("ad2") // ad2,ad3,ad4
	Object yuior(Model mm, @ModelAttribute("ad3") Address ad) {
		mm.addAttribute("ad4",ad);
		
		ad.setZipcode("2468");
		ad.setAddr1("동대구");
		return ad;
	}
	

//	@RequestMapping("hello")
//	String hello6
}