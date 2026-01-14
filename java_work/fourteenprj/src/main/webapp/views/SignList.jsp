<%@page import="org.apache.tomcat.jakartaee.commons.compress.utils.ExactMath"%>
<%@page import="db_p.SignDTO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
	<h1>회원정보 목록</h1>
	<% 
	ArrayList<SignDTO> mainData =
	(ArrayList<SignDTO>)request.getAttribute("mainData");
	%>
	
	<table border="">
		
		<% for(SignDTO dto : mainData) {%>
		<tr>
			<td><%= dto.getName() %></td>
			<td><%= dto.getPid() %></td>
			<td><%= dto.getPhone() %></td>
			<td><%= dto.getAdress() %></td>
			<td><%= dto.getAt_day() %></td>
			<td><%= dto.getEmail() %></td>
		</tr>
		<%}%>
		
	</table>
</body>
</html>