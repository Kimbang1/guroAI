<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="stylesheet" href="/style/style.css?v">
<style>

table {
	width: 300px;
	border-collapse: collapse;
}

th {
	color: #08f;
	padding: 10px;
	background-color: rgba(136, 136, 136, 0.2);
}

td {
	padding: 6px;
	border-bottom: 1px solid #ddd;
}
</style>
</head>
<body>
	<div id="wrap">
		<h1>Mybatis Framework JDBC</h1>
		<hr>
		
		<table>
			<tbody>
				<tr>
					<th>아이디</th>
					<th>이름</th>
				</tr>		
				
				<c:forEach var="member" items="${memberList}">	
				<tr>
					<td>${member.uid}</td>
					<td>${member.uname}</td>
				</tr>		
				</c:forEach>
			</tbody>
		</table>
	
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
