package exam_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import db_p.ExamDAO;
import di_p.ExamList;

@MultipartConfig(maxFileSize = 1024*1024*20)// 파일 업로드 기능을 지원하기위한 설정
@WebServlet("/exam/*")// exam으로 시작하는 모든 요청을 이 서블릿이 처리함
public class ExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExamController() {
        super();
    }

    
    //doget 방식의 요청이 들어올 때 실행되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getRequestURI());//   jspprj/exam/list  전체주소를 보여준다
		System.out.println(request.getContextPath()+"/exam/");//jspprj/exam/ 프로젝트 루트 경로
		String service = request.getRequestURI().substring( // 서비스 이름 추출
				(request.getContextPath()+"/exam/").length());
		
		System.out.println(service);
		
		String mainUrl = "/views/"+service+".jsp"; // 이동할 JSP경로 설정
		
		Action action;
		try {
			action = (Action)Class.forName("di_p."+service).newInstance();
			action.execute(request, response);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Forward로 페이지 이동을 설정
		RequestDispatcher dispatcher = request.getRequestDispatcher(mainUrl);
		dispatcher.forward(request,response);
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
