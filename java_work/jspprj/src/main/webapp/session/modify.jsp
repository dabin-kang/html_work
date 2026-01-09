<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>modify 세션 수정</h1>
	<%
	session.setAttribute("ss_id","asdf");
	session.setAttribute("ss_age",true);
	session.setAttribute("ss_arr",List.of(44,55,66));
	%>
</body>
</html>