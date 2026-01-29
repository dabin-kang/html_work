package di_p;

import java.util.ArrayList;

import db_p.RegDAO;
import db_p.RegDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import reg_p.Action;

public class Reglist implements Action {
	
	public void execute (HttpServletRequest request , HttpServletResponse response) {
		ArrayList<RegDTO> RRR = new RegDAO().list();
		request.setAttribute("mainData", RRR);
	}
	
}
