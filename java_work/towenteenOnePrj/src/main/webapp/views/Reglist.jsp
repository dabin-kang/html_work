<%@page import="db_p.RegDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>목록리스트</h1>

<% ArrayList<RegDTO> mainData =(ArrayList<RegDTO>)request.getAttribute("mainData");  %>


<%for (RegDTO dto : mainData) {%>
	<%=dto  %><<br/>
<%}%>

</body>
</html>