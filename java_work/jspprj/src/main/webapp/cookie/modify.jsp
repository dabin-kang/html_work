<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키 수정</h1>
	<%
		Cookie coo1 = new Cookie("pid","bbb");
		Cookie coo2 = new Cookie("age","32");
		
		response.addCookie(coo3);
		response.addCookie(coo4);
	%>
</body>
</html>