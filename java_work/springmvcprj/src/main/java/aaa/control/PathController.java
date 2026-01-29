package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.PathData;

@Controller
@RequestMapping("/path/{cate}")
public class PathController {
	
	@ModelAttribute("mmm")
	Object mmm(@PathVariable("cate")String cate) {
		return cate+">>>>";
	}
	

	//@PathVariable request. Attribute로 사용 됨
	 // /path/*/aaa/*
	// /path/{cate}/aaa/{service}
	@RequestMapping("aaa/{service}")
	String aaa(@PathVariable ("cate") String cate,
			@PathVariable ("service") String service
			) {
		System.out.println("aaa : "+cate+","+service);
		return"path";
	}
	
	// /path/*/bbb
	// /path/{cath}/bbb
	// depth 가 같을 경우 정적으로 고정된 mapping이 우선 적용
	@RequestMapping("bbb")
	String bbb(@PathVariable ("cate") String cate) {
		System.out.println("bbb : "+cate);
		return"path";
	}
	
	
	// /path/*/*
	// /path/{cate}/{pid}
	@RequestMapping("{pid}")
	String ccc(@PathVariable ("cate") String cate,
			@PathVariable ("pid") int pid) {
		System.out.println("ccc: "+cate+","+pid);
		return"path";
	}
	
	
	// 혼용해서 사용하기
	@RequestMapping("ddd/{service}")
	String ddd(PathData pd) {
		System.out.println("ccc: "+pd);
		return"path";
	}
	
	
	/*
	 * /path/info/eee/detail/20?pNo=30
	 * @PathVariable , parameter 이 서로 중첩되는 경우
	 * (가능한 중첩되지 않게 만든다)
	 * pNO :  30 으로 설정 :: @PathVariable < parameter이 우선순위로
	 * 화면에 보여지게 된다
	 * */
	@RequestMapping("eee/{service}/{pNo}")
	String eee(PathData pd) {
		System.out.println("eee: "+pd);
		return"path";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
