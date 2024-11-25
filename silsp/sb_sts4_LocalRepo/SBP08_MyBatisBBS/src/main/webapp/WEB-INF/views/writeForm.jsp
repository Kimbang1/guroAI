<%@	page language="java" contentType="text/html;	charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE	html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<link rel="stylesheet" href="/style/style.css">
<style>
table {
	width: 600px;
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

button:hover {
	cursor: pointer;
}
</style>
</head>
<body>
	<div id="wrap">
		<h1>글쓰기(MyBatis)</h1>
		<hr>
		<table>
			<tbody>
				<tr>
					<td>작성자</td>
					<td><input type="text" name="writer" form="formWrite"
						maxlength="20"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" form="formWrite" size="50">
					</td>
				</tr>
				<tr>
					<td style="vertical-align: top;">내용</td>
					<td><textarea name="content" cols="50" rows="5"
							form="formWrite"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center">
						<button type="submit" form="formWrite">저장</button>
						<button type="button" onclick="location.href='/boardList'">목록</button>
					</td>
				</tr>
			</tbody>
		</table>
		<form action="/boardWrite" id="formWrite"></form>
	</div>
	<!--	div#wrap	-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
