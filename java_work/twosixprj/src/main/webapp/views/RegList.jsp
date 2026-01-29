<%@page import="aaa.model.RegDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
ArrayList<RegDTO> AAA = (ArrayList<RegDTO>)request.getAttribute("mainData"); 
%>


<html>
<head>
<meta charset="UTF-8">
<title>시험목록</title>
</head>
<body>
	<h1>시험목록</h1>
	<%for(RegDTO dto : AAA)  {%><br/>
	<%= dto.getHakgi() %>
	<%= dto.getName() %>
	<%= dto.getPid() %>
	<%}%>
	

</body>
</html>