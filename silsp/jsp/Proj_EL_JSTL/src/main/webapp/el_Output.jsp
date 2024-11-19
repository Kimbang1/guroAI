<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
	<h1>세션 키 출력</h1>
	
	<% 	// JSP 스크립트 릿
	out.print("세션 키의 값:" + session.getAttribute("sKey"));
	
	%>
<%-- 	<h2>세녓 키의 값(EL사용) : ${sessionScope.sKey}</h2> --%>
	<h2>세녓 키의 값(EL사용,EK 객체 제거) : ${sKey}</h2>
	
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    