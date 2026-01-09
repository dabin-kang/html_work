<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 라이프사이클</title>
</head>
<body>
	<h1>jsp 라이프사이클</h1>
	
	<!--jsp 스크립트 요소 
	1.선언문
	2.스크립트릿
	3.표현식
	4.주석
	 -->
	 
	 <%!
	 //선언 : 클래스 정의와 같다	jlife.jsp ==> jlife_jsp.java
	 
	 int aa = 111; // 멤버변수
	 
	 void meth_2(){
		 System.out.println("meth_2 실행 : "+aa++);
	 }
	 
	 /*out.println("out 출력입니다. "+a++);  정의부에서는 내장객체를 알수없어서 사용할 수 없다 */
	 
	 public void jspinit(){
		 System.out.println("jspinit() 실행 : ");
	 }
	 
	 public void jspDestroy(){
		 System.out.println("jspDestroy() 실행 : ");
	 }
	 
	 
	 /* public void jspService(){
		 System.out.println("jspService() 실행 : ");
	 } *///호출 할 수 없다
	 
	 %>
	 
	 
	<%
	// 스크립틀릿 : _jspService() --> 메소드 새로고침(요청)이 있을 때마다 호출
	
	int a = 10; // 지역변수
	String b = "아기상어";
	
	class AAA{
		
	}
	
	// 메소드 내부 이기 때문에 메소드를 정의 할 수 없다
	//void meth (){
	//}
	
	System.out.println("스크립틀릿 실행 1");
	
	out.println("out 출력입니다. "+a);// 클라이언트에 출력하는 stream객체
	out.println("out 출력입니다. 2"+b);
	out.println("out 출력입니다. 3<br/>");
	out.println("out 출력입니다. 4<br/>");
	out.println("out 출력입니다. 5<br/><br/>");
	
	System.out.println("스크립틀릿 실행 2<br/><br/>");
	
	for(int i =0; i<5;i++){
		out.println(i+"<br/><br/>");
	}
	
	
	%>
	
	<div> <% %> 밖 은 html 구간
	out.println("out 출력입니다. "+a); <== 코드가 아닌 ,일반적인 문자열
	<br/>
	<br/>
	
	표현식<br/>
	a : <%=a %><br/>
	b : <%=b %><br/>
	</div>
	<br/><br/>
	
	
	<%
	System.out.println("스크립틀릿 실행 3");
	out.println("out 출력입니다. "+a++);
	
	%>
	
	<style>
		.box{
			width:100px;
			height:20px;
			border: 1px solid #333; 
		}
		
		
	/*섞어서 사용하기  */	
	</style>
	<% for (int i = 10; i<50; i+=10){ %>
	<div class = "box"> box</div>
	
	<%}%>
	
	
	<%
	//매서드 호출
	//최초로드시 실행
		meth_2();
	System.out.println("meth_2"+a++);
	
	%>
	
	
	
	
	<!-- diary.jsp 이번달 달력 출력 -->
	
</body>
</html>