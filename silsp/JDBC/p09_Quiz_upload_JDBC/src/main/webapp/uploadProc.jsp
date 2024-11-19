<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="fuo" class="pack.ex.FUO" />
<%
boolean chk = fuo.mtdupload(request); 

String txt = null;

	if(chk){
		txt= "파일 업로드 완료";
	}else{
		txt = "문제가 발생 파일 업로드 실패";
	}

%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>업로드 페이지</h1>
		<p><%= txt %></p>
		<button type="button" onclick="history.back()">돌아가기</button>
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    