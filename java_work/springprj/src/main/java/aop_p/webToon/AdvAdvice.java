package aop_p.webToon;

import java.util.Arrays;

import anno_p.comp.pac1.ComWatch;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdvAdvice {


//	void beforeee(ProceedingJoinPoint joinPoint) {
	void beforeee(JoinPoint joinPoint) {
		System.out.println("before:"+joinPoint.toShortString());
//		System.out.println(joinPoint);
//		System.out.println(joinPoint.toShortString());
//		System.out.println(joinPoint.getSignature());
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println(joinPoint.getSignature().toShortString());
//		System.out.println(joinPoint.getTarget());
//		System.out.println(Arrays.toString(joinPoint.getArgs()) ); //배열형태
//		System.out.println(joinPoint.getThis());
		try {
			
		}catch(Exception e){
			
		}
		
	}
	
	void returning(JoinPoint joinPoint ,Object ret) {
		System.out.println("returning :" +ret);
	}
	
	
	void execpp(JoinPoint joinPoint,Throwable ee) {
		System.out.println("execpp:"+ee.getMessage());
	}
	
	void finallyyy(JoinPoint joinPoint) {
		System.out.println("finallyyy:");
	}
}
