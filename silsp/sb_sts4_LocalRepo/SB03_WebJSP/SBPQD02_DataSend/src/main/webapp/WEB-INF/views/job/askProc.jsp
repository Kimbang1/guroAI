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
			<span>이름 : ${meB.uname }</span>
		</div>
		<br>
		<div>
			<span>연락처 : ${meB.telNum }</span>
		</div>
		 <br>
		 <div>
		 	<span>지원분야 : ${meB.check }</span>
		 </div>
		
		<div>
		 	<span>지원동기 : ${meB.jiwon }</span>
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