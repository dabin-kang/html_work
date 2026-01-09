<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이력서 작성</title>
</head>
<body>
	<h1>이력서 작성하기</h1>
<form action="JoinReg" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" required/></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="date" name="age" required/></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="address" required/></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="file1" 
			accept=".gif,.png,.jpeg,.jpg,.bmp"
			required/></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="이력서 등록" />
			</td>
		</tr>
	
	
	</table>
</form>
					

	
	
	

			
	
	
</body>
</html>