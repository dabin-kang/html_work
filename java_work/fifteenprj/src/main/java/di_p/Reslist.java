package di_p;

import java.util.ArrayList;

import db_p.regDAO;
import db_p.regDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Reslist implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<regDTO> bbb = new regDAO().list();
		System.out.println("리스트");
		request.setAttribute("mainData",bbb);
		
	}
}
