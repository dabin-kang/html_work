package exam_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class NewExamController
 */
@WebServlet("/newexam/*")
@MultipartConfig(maxFileSize = 1024*1024*20)
public class NewExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewExamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String service = request.getRequestURI().substring((request.getContextPath()+"/newexam/").length());
		// getRequestURI는 프로젝트명/newexam/* 되어 있고
		
		// getContextPath는 프로젝트명만 출력하기 때문에 "/newexam/"을 추가해야 한다.
		
		// substring() 괄호 안에는 숫자가 들어가야 하며, getContextPath+"/newexam/"의 길이만큼 빼서 "*"만 나오게 하겠다는 의미
		
		
		System.out.println(service);
		
		// controller에서 이동할 jsp 경로 설정
		String mainUrl = "/views/"+service+".jsp";
		
		Action action;
		// 메서드 호출
		try {
			action =  (Action)Class.forName("di_p."+service).newInstance();
			
			action.AAA(request, response);
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
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(mainUrl);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
