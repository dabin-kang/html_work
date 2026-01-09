<%@ page import="java.io.File" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>파일 목록 및 다운로드</title>
</head>
<body>
    <h2>FFF 폴더 파일 목록</h2>
    <table border="1">
        <tr>
            <th>파일명</th>
            <th>다운로드</th>
        </tr>
        <%
            String savePath = request.getServletContext().getRealPath("/fff");
            File dir = new File(savePath);
            File[] files = dir.listFiles();

            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile()) {
                        String fileName = file.getName();
        %>
        <tr>
            <td><%= fileName %></td>
            <td>
                <button type="button" onclick="location.href='FFFDown?fname=<%= fileName %>'">
                    다운 받기
                </button>
            </td>
        </tr>
        <%
                    }
                }
            } else {
        %>
        <tr>
            <td colspan="2">파일이 존재하지 않습니다.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>