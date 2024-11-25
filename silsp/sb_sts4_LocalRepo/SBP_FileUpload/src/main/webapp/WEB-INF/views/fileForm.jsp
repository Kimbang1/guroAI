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
		<h1>파일 업로드</h1>
		<hr>
		<form action="/uploadProc" method="post" enctype="multipart/form-data">
			<label>
				<span>작성자<input type="text" name="writer"></span>
			</label>
			<label>
				<span>파일선택<input type="file" name="fName"></span>
			</label>
			
			<div id="butArea">
				<button>업로드 실행</button>
			</div>
		</form>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    