package aaa;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import aaa.di.EventINterCepror;
import jakarta.annotation.Resource;

// 리액트와 연결 통신하는 부분
//외부연결 허용 (CorsRegistry registry)
@Configuration
public class CorsConfig implements WebMvcConfigurer{

		@Resource
		EventINterCepror eventIc;
	
	
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			
			registry.addMapping("/rest/**") // 엔드 포인트
			.allowedOrigins("http://192.168.0.36:8888")// 허용 origin
			.allowedMethods("GET","POST","PUT","DELETE")
			.allowCredentials(true)//인증 정보 전송 허용
			;
		}
		
		//EventINterCepror 진입시점 만들기
		//Interceptor 허용부분(InterceptorRegistry registry)
		//addInterceptors실행 ,  서버가 실행할 때 시작된다
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			System.out.println("addInterceptors실행");
			
			registry.addInterceptor(eventIc)
			.addPathPatterns("/inter/envent/**")// 예외허용처리를 해주는 부분, 묶어서 이벤트 걸기
			.addPathPatterns("/path/**")
			.excludePathPatterns("/inter/envent/dfg") // 하나만 예외처리를 한다 , 병진이형
			.excludePathPatterns("/path/info/ddd/insert"); // 하나만 예외처리를 한다
		}
		
		
		
		
		
		
}
