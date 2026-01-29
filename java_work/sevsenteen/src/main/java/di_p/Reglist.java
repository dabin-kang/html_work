package di_p;

import java.net.http.HttpResponse;
import java.util.ArrayList;

import db_p.RegDAO;
import db_p.RegDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sevsenteen.Action;

public class Reglist implements Action{

	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Object dtolist = new RegDAO().list();
		
		request.setAttribute("mainData", dtolist);
	}
	
	
}
