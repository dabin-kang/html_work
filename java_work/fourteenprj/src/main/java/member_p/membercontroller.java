package member_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/member/*")
public class membercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public membercontroller() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		///   http://localhost:8080/fourteenprj/member/list
		
		System.out.println(request.getRequestURI());// /fourteenprj/member/list
		System.out.println(request.getContextPath()+"/member/"); // /fourteenprj/member/
		String service = request.getRequestURI().substring(
				(request.getContextPath()+"/member/").length());
		System.out.println("service : "+service);
		
		String mainUrl = "/views/"+service+".jsp";
		
		Action action;
			try {
				action = (Action)Class.forName("di_p."+service).newInstance();
				action.execute(request,response);
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
		
		
		RequestDispatcher AAA = request.getRequestDispatcher(mainUrl);
		AAA.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
