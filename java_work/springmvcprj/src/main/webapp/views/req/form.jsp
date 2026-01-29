<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req/form</title>
</head>
<body>
	<h1>req/form입니다</h1>
	<!-- get 방식으로 form으로 값 주기 -->
	<form action="mem" method="get">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td>
				<input type="radio" name="marriage" value="true" />기혼
				<input type="radio" name="marriage" value="true" />미혼
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="get작성"/></td>
			</tr>
		</table>
	</form>
	
	<!--post방식으로 주기 -->
	<h2>mem2 post</h2>
	<form action="mem" method="post">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td>
				<input type="radio" name="marriage" value="true" />기혼
				<input type="radio" name="marriage" value="true" />미혼
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="post작성"/></td>
			</tr>
		</table>
	</form>
	
	
	
	
	<h2>mem3 get</h2>
	<form action="mem3" method="get">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td>
				<input type="radio" name="marriage" value="true" />기혼
				<input type="radio" name="marriage" value="true" />미혼
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="get작성"/></td>
			</tr>
		</table>
	</form>
	
	<h2>mem3 post</h2>
	<form action="mem3" method="post">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td>
				<input type="radio" name="marriage" value="true" />기혼
				<input type="radio" name="marriage" value="true" />미혼
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="post작성"/></td>
			</tr>
		</table>
	</form>


	<h2>mem4 post</h2>
	<form action="mem4" method="post">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td>
				<input type="radio" name="marriage" value="true" />기혼
				<input type="radio" name="marriage" value="true" />미혼
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="post작성"/></td>
			</tr>
		</table>
	</form>



</body>
</html>