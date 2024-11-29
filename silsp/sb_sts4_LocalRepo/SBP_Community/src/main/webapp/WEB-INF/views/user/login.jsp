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
		<%@	include file="../layout/header.jsp"%>
		<div id="mainWrap" class="wrap">
			<h1>로그인 페이지</h1>
			<hr>
			<form id="loginForm">
				<div class="loginFormInnerDiv">
					<label> <input type="text" id="userid" name="userid"
						placeholder="아이디 입력">
					</label>
				</div>
				<div class="loginFormInnerDiv">
					<label> <input type="password" id="password"
						name="password" placeholder="비밀번호 입력">
					</label>
				</div>
				
				<button type="button" id="loginBtn">login</button>
			</form>
			
		</div>
		<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    