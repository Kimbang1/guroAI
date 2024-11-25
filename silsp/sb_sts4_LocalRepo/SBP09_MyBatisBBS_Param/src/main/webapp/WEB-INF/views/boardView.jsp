<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>내용보기</title>
	<link rel="stylesheet" href="/style/style.css?v">
	<style>
	li {
		line-height: 30px;
	}
	</style>
</head>
<body>
	<div id="wrap">
		<h1>내용보기</h1>
		<hr>
		<ul>
			<li>작성자 : ${mtdBoardView.writer }</li>
			<li>제목 : ${mtdBoardView.title }</li>
			<li>내용 : ${mtdBoardView.content }</li>
		</ul>
		<hr>
		<button type="button" onclick="location.href='/boardList'">목록</button>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    