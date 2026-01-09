<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charget=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make</title>
</head>
<body>
	<h1>view</h1>
	
	
session 과 application정보만 확인 가능
ss_id:	<%=session.getAttribute("ss_id")%><br/>
ss_age:	<%=session.getAttribute("ss_age")%><br/>
ss_arr:	<%=session.getAttribute("ss_arr")%><br/>
	
rr_id :	<%=request.getAttribute("rr_id")%><br/>
rr_age:	<%=request.getAttribute("rr_age")%><br/>
	
aa_id:	<%=application.getAttribute("aa_id")%><br/>
aa_age:	<%=application.getAttribute("aa_age")%><br/>
	
pa_id:	<%=pageContext.getAttribute("pa_id")%><br/>
pa_age:	<%=pageContext.getAttribute("pa_age")%><br/>

<hr/>
getId : <%=session.getId() %><br/>

<%
	Enumeration<String> attrNames = session.getAttributeNames();
	
	while(attrNames.hasMoreElements()){
		String an = attrNames.nextElement();
%>		
	<%=an %> :<%=session.getAttribute(an) %><br/>
	<% }%>

	
</body>
</html>