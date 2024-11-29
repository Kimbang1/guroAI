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
			<main id="main">
				<h1>글쓰기 페이지</h1>
				<hr>
				<form id="writeForm">
					<div class="wrtieFormInnerDiv">
						<lable>
							<span>제목</span>
							<input type="text" id="title" name="title" placeholder="제목입력">
						</lable>
					</div>
					<div class="wrtieFormInnerDiv">
						<lable>
							<span>내용</span>
							<textarea name="content" id="content" placeholder="내용입력"></textarea>
						</lable>
					</div>
					<button id="wrtieBtn" type="button">등록</button>
				</form>
			</main>
			<!--	main#main	-->
		</div>
		<!--	div#mainWrap	-->
		<%@	include file="../layout/footer.jsp"%>
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    