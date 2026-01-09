package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/FileDown")
public class FileDown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDown() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fName ="home1.png";
		String en = URLEncoder.encode(fName,"UTF-8");
		
		//1.다운로드 창 열기
		response.setHeader("Content-Disposition","attachment;filename="+en);
		
		//읽어 들일 파일 경로
		String dir = request.getServletContext().getRealPath("fff/"+fName);
		
		//2. 파일 stream 열기
		FileInputStream fis = new FileInputStream(dir);
		
		//3. 클라이언트 stream열기
		ServletOutputStream sos = response.getOutputStream();
		
		//4. 버퍼 전송
		byte [] buf = new byte[1024];
		while(fis.available()>0) {
			int len = fis.read(buf);
			sos.write(buf,0,len);
		}
		
		//5. 닫기
		sos.close();
		fis.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
//           fileDir.jsp  -->  FFFDown
//fff 의 파일들을 나열하고 클릭하면 다운로드 하도록 하기




