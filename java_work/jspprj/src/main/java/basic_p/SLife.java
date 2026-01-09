package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SLife
 */
@WebServlet("/SLife") //url 패턴 맵핑 :: /SLife 라우팅
public class SLife extends HttpServlet {//상속을 받아야 서블릿클래스로 작동
	
	//io 외  network 사용시 클래스의 구분을 하기 위한 UID
	// 1L = 1Long
	private static final long serialVersionUID = 1L;
	
	
	public SLife() {
		System.out.println("생성자 실행");
	}
	@Override
		public void init() throws ServletException {
			System.out.println("init()실행");// 최초 로드시 실행
		}
	@Override
	public void destroy() {
		System.out.println("destroy()실행");// 소멸시 실행 - 서블릿 수정시 소멸됨
	}
	@Override
		protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 시작");
			super.service(arg0, arg1); // doget, dopost를 호출하는 역할
			System.out.println("service() 끝");
		}
       
  
	//get요청시 실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget 실행");
		response.getWriter().append("Served at: ").append(request.getContextPath());//요청시 실행
	}
	//post요청시 실행
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
