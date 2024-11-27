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
	 <form action="/receive" method="post">
		<h1>Log in</h1>
		
		<div id="inputArea">
			
			<div class="inputModule">
				<span>Email</span>
				<input type="text" id="email" name="email" required>
			</div>
			<div class="inputModule">
				<span>Password</span>
				<input type="text" id="pwd" name="pwd" required>
			</div>
			
		</div>
		
		<div id="Btn">
			<button>Log in</button>
		</div>
		</form>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>   