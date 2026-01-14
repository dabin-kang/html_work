package di_p;

import java.net.http.HttpResponse;

import db_p.SignDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member_p.Action;

public class SignDetail implements Action{
	
	public void execute(HttpServletRequest request,HttpServletResponse response) {
		Object res = new SignDAO().list();
		System.out.println(res);
		
		request.setAttribute("mainData", res);
	}
	
}
