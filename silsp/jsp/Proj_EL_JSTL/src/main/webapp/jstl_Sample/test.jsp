<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!--  c : core,입출력, 변수, 제어문 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- fmt :  formatting, 형식 적용(천단위 구분, 날짜/시간, 화폐, .... -->


<%
String data ="괴구마";
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
	<h1>JSTL 출력</h1>
	
<%-- 	1. <c:out value="<%=data%>" /> --%>
	1. <c:out value="data" />
	<br>
	1. <c:out value="${'감자'}" />
	<br>
	<!-- EL형식은 안됨-->
	2. ${data}
		
		
		
	<h1>JSTL 출력(JSP 혼용)</h1>	
	
	<h2>변수 생성</h2>
	<c:set var="fruitData" value="수박" />
	<hr>
<!-- 	<h2>벼수 출력(표현 언어)</h2> -->
<%-- 	${fruitData} --%>
	<h2>벼수 출력(JSTL core 출력 태그)</h2>
	<c:out value="${fruitData }" />
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    