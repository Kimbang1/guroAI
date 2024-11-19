<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
request.setCharacterEncoding("UTF-8");
%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>수신된 데이터(EL적용계산)</h1>
		<br>
		<h2>덧셈 :${param.num1 +param.num2 } </h2>
		<h2>덧셈 :${param.num1 -param.num2 } </h2>
		<h2>덧셈 :${param.num1 *param.num2 } </h2>
		<h2>덧셈 :${param.num1 /param.num2 } </h2>
		<h2>덧셈 :${param.num1 %param.num2 } </h2>
		
	
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    