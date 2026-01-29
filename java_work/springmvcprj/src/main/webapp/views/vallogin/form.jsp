<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix ="spFrm" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>onop 회원가입 페이지</h1>
	<form method="post">
		<table border="">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="pid"/>
				<br />
				<spFrm:errors path="person.pid"/>
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age"/></td>
			</tr>
			<tr>
				<td>생일</td>
				<td><input type="date" /></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="number" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="가입"/></td>
			</tr>
		</table>
	</form>
</body>
</html>