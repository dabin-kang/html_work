<%@page import="db_p.MvcDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험목록</title>
</head>
<body>
	<h1>시험목록</h1>
	<%
	ArrayList<MvcDTO> mainDataC = (ArrayList<MvcDTO>)request.getAttribute("mainData");
	%>
	
	<table border="">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>나이</td>
		</tr>
		
		<% for(MvcDTO ggg : mainDataC) {%>
		<tr>
			<td><%= ggg.getId() %></td>
			<td><a href="NewExamDetail?id=<%= ggg.getId() %>" ><%= ggg.getName() %></a></td>
			<td><%= ggg.getAge() %></td>
		</tr>
		<%}%>
	
	</table>
</body> 
</html>