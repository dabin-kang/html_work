<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b</title>
</head>
<body>
	<h1>b</h1>
	<script type="text/javascript">
		alert("왔어1>?")
		location.href="e.jsp"//response.sendRedirect 가 가장 먼저 우선 실행한다, 그래서 실행하지 않음
	</script>
	
	<%
		System.out.print("b진입 1");
		response.sendRedirect("c.jsp");
	
		//response.sendRedirect("d.jsp"); 에러발생
		
		System.out.print("b진입 2");
	%>
	
	<script type="text/javascript">
		alert("왔어2>?")
		location.href="e.jsp"
	</script>
</body>
</html>

<!--
영화예매 사이트를 제작하세요
----------------------------
예매창
영화종류 : 아이언맨, 슈퍼맨, 마트맨
인원수
---------------------------

처리창
영화종류의 결과창으로 이동
아이언맨 : 인원수 그대로
슈퍼맨 : 인원수
마트맨 : 인원수 * 2

  -->
