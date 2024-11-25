<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>글목록</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>BBS 목록보기(Service 적용)</h1>
		<hr>
		<div class="listHeader listColumn dFlex">
			<span>번호</span>
			<span>제목</span>
			<span>작성자</span>
		</div>
		
		<c:forEach var="list" items="${boardList }">
		<div class="listRow listColumn dFlex">
			<span>${list.num }</span>
			<span>${list.title }</span>
			<span>${list.writer }</span>
		</div>
		</c:forEach>
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    