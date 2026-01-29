<%@page import="aaa.mmm.StudExam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보출력 페이지</title>
</head>
<body>
	<h1>정보출력 페이지</h1>
	<%= request.getParameter("pname") %>
	<%StudExam st = (StudExam)request.getAttribute("prexam"); %>
	<%=st %>
	<%= request.getParameter("kor") %>
	<%= request.getParameter("eng") %>
	<%= request.getParameter("mat") %>
</body>
</html>