<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력폼</title>
</head>
<body>
	<h1>학생입력폼</h1>
	<form action="resexam" method="post">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname"/></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age"/></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><input type="text" name="kor"/></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><input type="text" name="eng"/></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><input type="text" name="mat"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록" /></td>
			</tr>
		</table>
	</form>
</body>
</html>