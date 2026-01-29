package aaa.di;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import aaa.mmm.Person;

public class PersoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	
	//Object target 이 실제 가져오는 값
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		System.out.println("Validate 진입 : "+target);
		
		//빈칸 상태로 null로 추가하기
		Person per = (Person)target;
		if(per.getPid()==null || per.getPid().equals("")) {
			
			//에러필드를 지정한다
			// 에러상태추가
			errors.rejectValue("pid", "invalid.pid","id가null입니다");
			// 에러필드, 에러코드 , 에러메세지
			// 3개가 전부 있어야 에러가 나지않는다
		}
		
		//여러개가 가능하다
		if(per.getPid()==null || per.getPid().equals("")) {
			
			//에러필드를 지정한다
			// 에러상태추가
			errors.rejectValue("pw", "qwera","pw가null입니다");
							// 에러필드, 에러코드 , 에러메세지
			// 3개가 전부 있어야 에러가 나지않는다
		}
		
		

	}

}
