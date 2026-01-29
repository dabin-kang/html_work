package di_p;

import java.util.ArrayList;

import db_p.regDAO;
import db_p.regDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResDetail implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//?? bbb = new regDAO().detail();
		System.out.println("db에서 디테일 가져오는중");
		//request.setAttribute("mainData",bbb);
		
	}
}
