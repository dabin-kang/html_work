package aaa.di;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{
	
	
	
	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("로그인 진입"+target);
		
		
		LoginData ld = (LoginData)target;
		String korP = "^[가-힣]{1,5}$";
		
		if(ld.getPid()==null || ld.getPid().equals("")) {
			errors.rejectValue("pid","jklh","id가 에러입니다");
		}
		
		if(ld.getName()==null ||  ld.getName(!= korP) ) {
			errors.rejectValue("pid","jklh","name가 에러입니다");
		}
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
