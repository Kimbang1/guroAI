<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<body>
	<div id="headerWrap" class="wrap">
		<nav id="gnb">
			<ul id="mainMenu">
				<li class="mainLi"><a href="/">메인</a></li>
				
				<!-- 세션이 없을때 -->
				<c:if test="${sid == null}">
					
					<li class="mainLi"><a href="/join">회원가입</a></li>
					<li class="mainLi"><a href="/login">로그인</a></li>
					<li class="mainLi"><a href="javascript('로그인이 필요합니다)">글쓰기</a></li>
				</c:if>
				<!-- 세션이 존재할때 -->
				<c:if test="${sid != null}">
					<li class="mainLi"><a href="/logout">로그아웃</a></li>
					<li class="mainLi"><a href="/write">글쓰기</a></li>
				</c:if>
				
					<li class="mainLi"><a href="/list">글목록</a></li>
			</ul>
		</nav>
	</div>
	<!-- div#headerWrap -->

</body>
</html>
