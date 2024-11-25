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
		<h1>업로드 완료</h1>
		<hr>
		<p>원본파일 정보 : ${list.get(0)}</p>
		<p>업로드파일 정보 : ${list.get(1)}</p>
		<p>파일 크기 : ${list.get(2)}</p>
		<p>저장경로 : ${list.get(3)}</p>
		
		<hr>
		<div id="btnArea">
			<button type="button" onclick="location.href='/fileForm'">입력하기</button>
		</div>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
