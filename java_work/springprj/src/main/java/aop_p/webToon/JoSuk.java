package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class JoSuk {
	public String dog1(int aa, String bb) {
		
		System.out.println("dog1 실행 : "+aa+","+bb);
		return "센세이션";
	}



public int dog2(int aa, String bb) {
	System.out.println("dog2 실행 : "+aa+","+bb);
	return 1234;
}
}