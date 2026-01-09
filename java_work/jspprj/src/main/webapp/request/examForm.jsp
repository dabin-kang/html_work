<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 입력</title>
</head>
<body>
	<h1>학생 정보 입력</h1>
	<form action="">
		<table>	
			<tr>
				<td>이름	: <input type="text" /></td>
			</tr>
			<tr>
				<td>국어	: <input type="number" /></td>
			</tr>
			<tr>
				<td>영어	: <input type="number" /></td>
			</tr>
			<tr>
				<td>수학	: <input type="number" /></td>
			</tr>
			
			<tr><input type="button" value="점수계산" /><tr>	
		</table>
	</form>
	
</body>
</html>

<!--
examForm.jsp -> examReg.jsp
학생 1명의
이름, 국어,영어,수학 점수를 입력받아
이름, 국어,영어,수학 , 총점, 평균을 출력하세요
  -->