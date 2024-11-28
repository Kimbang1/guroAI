<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrapList">
		<div id="header" class="dFlex">
			<div>
				<span>지원 정보 리스트</span>
			</div>
			<div id="pushBtn">
				<button type="button" onclick="location.href='/applyForm'">입력</button>
			</div>
		</div>
		
		<table>
			<tbody>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>연락처</th>
					<th>분야</th>
					<th>지원 동기</th>
					<th>등록일</th>
				</tr>
				<c:forEach var="applyList" items="${mtdList}">
					<tr class="dataLog">
						<td>${applyList.num}</td>
						<td>${applyList.userName}</td>
						<td>${applyList.userPhone}</td>
						<td>${applyList.applyPart}</td>
						<td>${applyList.applyMotive}</td>
						<td>
							<fmt:formatDate value="${applyList.applyTM}" pattern="yyyy-MM-dd"/>
						</td>			
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