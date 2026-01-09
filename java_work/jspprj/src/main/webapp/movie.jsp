<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화예매사이트</title>
</head>
<body>
	<h1>영화예매사이트</h1>
	
	<table border="1">
		<tr>
			<th>영화목록<th>
			<th>인원수<th>
			
		</tr>
			<td>
				 <form action="moviemo.jsp">
				 	<input type="hidden" name="movieTitle" value="아이언 맨">
				 	<input type="hidden" name="count" value="인원수">
				  	<input type="submit" value="예매하기" >아이언 맨 
				  </form>
				  
				  
				<div><input type="button" value="예매하기">	슈퍼 맨</div>
				<div><input type="button" value="예매하기">	마트 맨</div>
			<td>
		
	</table>
	
	
	
	
</body>
</html>