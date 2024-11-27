
<%@	page language="java" contentType="text/html;	charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE	html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>내용보기</title>
<link rel="stylesheet" href="/style/style.css">
<style>
li {
	line-height: 30px;
}
</style>
</head>
<body>
	<div id="wrap">
		<h1>내용보기(MyBatis)</h1>
		<hr>
		<ul>
			<li>작성자 : ${mtdBoardView.writer}</li>
			<li>제목 : ${mtdBoardView.title}</li>
			<li>내용 : ${mtdBoardView.content}</li>
		</ul>
		<hr>
		<button type="button" onclick="location.href='/boardList'">목록</button>
	</div>
	<!--	div#wrap	-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>