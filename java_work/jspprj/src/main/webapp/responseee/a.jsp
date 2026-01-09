<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a</title>
</head>
<body>
	<h1>a</h1>
	<%
	HttpServletResponse res1 = response;
	ServletResponse res2 = pageContext.getResponse();
	PrintWriter out1 = response.getWriter();//html에 작성
	//ServletOutputStream sos = response.getOutputStream();// 파일 다운로드 할 때 사용할 stream
	
	System.out.print(response);
	System.out.print(res1);
	System.out.print(res2);
	System.out.print(out);
	System.out.print(out1);
	out.print("아기상어");
	out1.print("엄마상어");
	
	response.setContentType("text/html; charset=UTF-8");
	System.out.print(response.getHeader("Content-Type"));
	
	//response.sendError(404);  강제로 에러전송을 시키는 명령어
	//response.sendError(500,"에러오류");
	//response.setStatus(200); 정상실행
	//response.setStatus(HttpServletResponse.SC_OK); // = 200
	//response.setStatus(404); // = 200, 실제에러는 아닌 status_code 만 404 로 전달한다
	//response.setStatus(HttpServletResponse.SC_NOT_FOUND); // 404			
			
	%>
	<%=response %>
</body>
</html>