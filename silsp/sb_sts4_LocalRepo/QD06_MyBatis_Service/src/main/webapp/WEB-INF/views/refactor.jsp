<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>개발자 지원서</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap" class="applyWrap">
		<h1>개발자 지원서</h1>
		<hr>
		
		<form action="/applyUpdateProc" id="applyForm" method="post">
			<fieldset>
			<input type="hidden" name="num" value="${applyDto.num}">
			
				<legend>개인정보</legend>
				<label>
					<span>이름</span>
					<input type="text" name="userName" value="${applyDto.userName}" required>
				</label>
				<label>
					<span>연락처</span>
					<input type="text" name="userPhone" value="${applyDto.userPhone}" required>
				</label>
			</fieldset>		
						
			<fieldset id="applyFieldset">
				<legend>지원 분야</legend>
				<label>
					<input type="radio" name="applyPart"
					value="Java" ${applyDto.applyPart == 'Java'?'checked':''}>
					<span>Java</span>
				</label>
				<label>
					<input type="radio" name="applyPart"
					value="Android"${applyDto.applyPart == 'Android'?'checked':''}>
					<span>Android</span>
				</label>
				<label>
					<input type="radio" name="applyPart"
					value="React"${applyDto.applyPart == 'React'?'checked':''}>
					<span>React</span>
				</label>
				
			</fieldset>	
			
			<fieldset id="motiveFieldset">
				<legend>지원 동기</legend>
				<textarea name="applyMotive" required>${applyDto.applyMotive}</textarea>
			</fieldset>	
			
			<div id="btnArea">
				<button type="submit">수정 완료</button>
				<button type="reset">다시 쓰기</button>
				<button type="button" class="applyList">리스트</button>
			</div>
		</form>
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
