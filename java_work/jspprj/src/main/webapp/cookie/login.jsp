<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    	Cookie [] cookies = request.getCookies();
    	String  savepid = "";
    	
    	if(cookies != null){
    		
    		// cookies에서 모든 쿠키 값을 가져와서 Cookie c에 담은 뒤 "pid" 문자와 같은 것을 찾는다
    		for(Cookie c : cookies){
    			if(c.getName().equals("pid")){
    				
    				//찾은 쿠키 값을 저장
    				savepid = c.getName();
    			}
    		}
    	}
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form  action="logincheck.jsp" method="post">
	<table>
		<tr>
			<th>아이디</th>
			<th><input type="text" name="pid"></th>
		</tr>
		<tr>
			<th>비밀번호</th>
			<th><input type="password" name="pw"></th>
		</tr>
			
		<tr>	
		<td colspan="2">
			<input type="checkbox" name="savepid" value="yes" <%= !savepid.equals("") ? "checked" : "" %>> 아이디 저장
			<input type ="submit" value="로그인" name="login">
		</td>
		</tr>
	</table>
</form>
</body>
</html>