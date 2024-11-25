<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>글쓰기</title>
	<link rel="stylesheet" href="/style/style.css?v">
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
		<form action="/boardWrite" id="formWrite">
			<table>
				<tbody>
					<tr>
						<td>작성자</td>
						<td>
							<input type="text" name="writer">
						</td>
					</tr>
					<tr>
						<td>제목</td>
						<td>
							<input type="text" name="title">
						</td>
					</tr>
					<tr>
						<td style="vertical-align: top">내용</td>
						<td>
							<textarea name="content" cols="50" rows="5"></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<button>저장</button>
							<button type="button" onclick="location.href='/boardList'">목록</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    