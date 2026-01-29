package aop_p.ddd;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ExecutionAdvice {
	void total(JoinPoint joinPoint) {
		System.out.println("total:"+joinPoint.toShortString());
		
	}
	
	void dog(JoinPoint joinPoint) {
		System.out.println("메소드 dog로시작:"+joinPoint.toShortString());
		
	}
	
	void topMan(JoinPoint joinPoint) {
		System.out.println("클래스 topMan로 시작:"+joinPoint.toShortString());
		
	}
	
	void movie(JoinPoint joinPoint) {
		System.out.println("패키지 aop.movie:"+joinPoint.toShortString());
		
	}
	
	void movieSub(JoinPoint joinPoint) {
		System.out.println("패키지 aop.movieSub:"+joinPoint.toShortString());
		
	}
	
	void arg0(JoinPoint joinPoint) {
		System.out.println("arg 0개:"+joinPoint.toShortString());
		
	}
	void arg1(JoinPoint joinPoint) {
		System.out.println("arg 1개:"+joinPoint.toShortString());
		
	}
	void arg2(JoinPoint joinPoint) {
		System.out.println("arg 2개:"+joinPoint.toShortString());
		
	}
	void argInt(JoinPoint joinPoint) {
		System.out.println("arg int개:"+joinPoint.toShortString());
		
	}
	void argIntInt(JoinPoint joinPoint) {
		System.out.println("arg int,int개:"+joinPoint.toShortString());
		
	}
	
	
	
	void retStr(JoinPoint joinPoint) {
		System.out.println("리턴이 string:"+joinPoint.toShortString());
		
	}
	void retVoid(JoinPoint joinPoint) {
		System.out.println("리턴이 void:"+joinPoint.toShortString());
		
	}
	void retBool(JoinPoint joinPoint) {
		System.out.println("리턴이 boolean:"+joinPoint.toShortString());
		
	}
}
