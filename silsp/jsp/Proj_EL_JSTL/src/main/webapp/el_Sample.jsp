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
		
		<h1>세션 생성</h1>
		<%
//		session.setAttribute("세션 키",세션키에 저장할 데이터);
		//이한줄이 생성돼면 세션이 생성됨
		//이 컴퓨터에서 지정된 시간동안 지속됌
		session.setAttribute("sKey","울트라마");
		%>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    