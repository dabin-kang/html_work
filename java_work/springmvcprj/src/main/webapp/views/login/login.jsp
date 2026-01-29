<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>로그인 화면</h1>
	
	<form action="login"  method="post" >
		<table border="">
			<tr>
				<td>아이디</td>
				<td><input type="text"  name="pname"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"/></td>
			</tr>
			<td colspan="2" align="center">
			<input type="submit" value="로그인"  name="login"/>
			<input type="submit" value="로그아웃" name="logout" />
			<input type="checkbox" name="savepid"  value="아이디저장" />
			</td>
		</table>
	</form>
	
	
</body>
</html>