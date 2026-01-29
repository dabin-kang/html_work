package aaa.di;

import java.net.http.HttpResponse;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import aaa.control.CompanyController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 진입시점을 걸어줘야 정상적으로 작동된다
@Service
public class EventINterCepror implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
		System.out.println("EventINterCeptor 진입");
		
		Date endDate = new Date(2026-1900,1-1,21);
		
		if(new Date().after(endDate)) {
			response.sendRedirect("/inter/expire"); 
			return false;
		}
		return true;
	}	
//		response.sendRedirect("/inter/expire");  주석처리하고  	 true하면 다시 페이지가 보여진다
//			return true
}