<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${mmm} 학생 목록</h2>
    <table border="1">
        <tr>
            <th>번호</th><th>이름</th><th>총점</th><th>상세보기</th>
        </tr>
            <tr>
                <td>${cate}</td>
                <td>${}</td>
                <td>${}</td>
                <td><a href="/student/${cate}/detail/${}">조회</a></td>
            </tr>
    </table>
    <br>
    <a href="/student/${cate}/add">학생 정보 추가</a>
</body>
</html>