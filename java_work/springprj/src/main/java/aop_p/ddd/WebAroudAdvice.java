package aop_p.ddd;

import org.aspectj.lang.ProceedingJoinPoint;

public class WebAroudAdvice {
	
	Object aroundTest(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println(" >>> aroundTest 시작 : ");
		
		
		System.out.println(" >>> aroundTest 끝 : ");
		return res;
	}
}
