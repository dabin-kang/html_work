<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	
	String dbId = "admin";
	String dbPw = "123456";
	
	if(userId != null && userPw != null && userId.equals(dbId)&& userPw.equals(dbPw)){
		
		session.setAttribute("loginId", userId);
		
		response.sendRedirect("main.jsp");
	}else{
		alert("로그인 실패");
		
		
	}
	
	
	%>
	
	
	
</body>
</html>