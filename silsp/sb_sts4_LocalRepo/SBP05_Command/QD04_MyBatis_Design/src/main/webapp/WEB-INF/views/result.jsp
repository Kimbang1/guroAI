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
	<div id="wrap" class="resWrap">
		<h1>수신 데이터</h1>
		<hr>
		
		<div class="res">
			<span>이름</span> : 
			<span>${userName}</span>
		</div>
		<div class="res">
			<span>연락처</span> : 
			<span>${userPhone}</span>
		</div>
		<div class="res">
			<span>지원 분야</span> : 
			<span>${applyPart}</span>
		</div>
		<div class="res">
			<span>지원 동기</span> : 
			<span>${applyMotive}</span>
		</div>
		
		<div id="btnArea">
			<button type="button" id="insFormBtn">입력</button>
		</div>
		
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    