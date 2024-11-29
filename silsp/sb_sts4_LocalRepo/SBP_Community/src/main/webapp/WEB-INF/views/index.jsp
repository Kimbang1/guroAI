<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
<!-- sid값이 살아있을때 없을때 화면 다르게 띄워보기 -->
	
		<%@	include file="./layout/header.jsp"%>
		<div id="mainWrap" class="wrap">
			<main id="main">
				<h1>인덱스 페이지</h1>
				<hr>
				<h2>웰컴!!</h2>
			</main>
			<!--	main#main	-->
		</div>
		<!--	div#mainWrap	-->
		<%@	include file="./layout/footer.jsp"%>

	
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
