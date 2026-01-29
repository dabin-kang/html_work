package reg_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import di_p.Action;


@WebServlet("/member/*")
public class Regcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Regcontroller() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String con = request.getContextPath();//fifteenprj
		System.out.println(con);
		String rs = request.getRequestURI();//fifteenprj/member/*
		System.out.println(rs);
		String  service = rs.split("/fifteenprj/member/")[1]  ;
		System.out.println("/member/* *값 : "+service);
		
		try {
			System.out.println("/views/"+ service +".jsp 에 보여줄 데이터 DB에가져오기");
			Action CCC = (Action)Class.forName("di_p."+service).newInstance();
			CCC.execute(request, response);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("/views/"+ service +".jsp 파일 보여주기");
		RequestDispatcher AAA = request.getRequestDispatcher("/views/"+ service +".jsp") ;
		AAA.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
