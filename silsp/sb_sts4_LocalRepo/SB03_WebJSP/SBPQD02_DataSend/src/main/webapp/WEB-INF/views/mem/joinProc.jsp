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
		<h1>수신 데이터</h1>
		<hr>
		<div>
			<span>이메일 : ${email }</span>
		</div>
		<br>
		<div>
			<span>패스워드 : ${pwd }</span>
		</div>
		 <br>
		 <div>
		 	<span>수신동의 체크 : ${agree }</span>
		 </div>
		
		<div>
		<span>- END</span>
		</div>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    