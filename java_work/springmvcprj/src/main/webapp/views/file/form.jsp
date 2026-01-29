<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>file</h1>
	
	<h2>reg1</h2>
	<form action="file/reg1" method="post" enctype="multipart/form-data">
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
				<td>파일1</td>
				<td><input type="file" name="ff1" multiple/></td>
			</tr>
			<tr>
				<td>파일2</td>
				<td><input type="file" name="ff2" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="가입" />
				</td>
				
			</tr>
		</table>
	</form>
	
	<h2>reg2</h2>
	<form action="file/reg2" method="post" enctype="multipart/form-data">
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
				<td>파일1</td>
				<td><input type="file" name="ff1" multiple/></td>
			</tr>
			<tr>
				<td>파일2</td>
				<td><input type="file" name="ff2" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="가입" />
				</td>
				
			</tr>
		</table>
	</form>
	
	<h2>reg3</h2>
	<form action="file/reg3" method="post" enctype="multipart/form-data">
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
				<td>파일1</td>
				<td><input type="file" name="ff1" multiple/></td>
			</tr>
			<tr>
				<td>파일2</td>
				<td><input type="file" name="ff2" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="가입" />
				</td>
				
			</tr>
		</table>
	</form>
</body>
</html>