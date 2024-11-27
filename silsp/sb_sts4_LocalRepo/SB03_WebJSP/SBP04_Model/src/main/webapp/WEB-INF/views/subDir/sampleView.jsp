<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="EUC-KR">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>s
<body>
	<div id="wrap">
		<h1>ModelAndView�� ������ ��°��(subDir/sampleView)</h1>
		<hr>
		<h2>���۵� ������(ObjectTest) : ${ObjectTest}</h2>
		<h2>���۵� ������(name) : ${name}</h2>
		<h2>���۵� ������(lists) : ${lists}</h2>
		
		<ul>
			<c:forEach var="myList" items="${lists }">
				<li>${myList }</li>
			</c:forEach>
		</ul>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    