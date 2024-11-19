<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="pack.el.ELBean" />
<jsp:setProperty name = "bean" property="uid" />
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>DTO의 uid필드에 저장된 값</h1>
		<h2>액션태그 사용</h2>
		<jsp:getProperty name = "bean" property="uid" />
		
<!-- 		<h2>EL사용</h2> -->
<%-- 		${bean.uid} --%>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    