package di_p;

import java.util.ArrayList;

import db_p.MvcDAO;
import db_p.MvcDTO;
import exam_p.Action;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewExamlist implements Action {

	//객체 생성
	@Override
	public void AAA(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<MvcDTO> BBB = new MvcDAO().list();
		
		//호출
		request.setAttribute("mainData", BBB);
	}

}
