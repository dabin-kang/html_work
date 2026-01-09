<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>처리결재창</title>
</head>
<body>
	<h1>결재처리</h1>
	<% String movieTitle  = request.getParameter("movieTitle "); %>
	<% String count= request.getParameter("count"); %>
	<%= movieTitle %>
	<%= count%>
</body>
</html>