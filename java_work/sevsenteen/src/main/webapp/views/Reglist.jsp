<%@page import="db_p.RegDTO"%>
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
	<h1>회원목록</h1>
	
	<% ArrayList<RegDTO> mainData =
		(ArrayList<RegDTO>)request.getAttribute("mainData");
	%>
	
	<table border="">
	
	<%for(RegDTO dto : mainData) { %>
	<tr>
		<td><%= dto.getName() %></td>
	
	</tr>
	
	<%}%>
	</table>
	
</body>
</html>