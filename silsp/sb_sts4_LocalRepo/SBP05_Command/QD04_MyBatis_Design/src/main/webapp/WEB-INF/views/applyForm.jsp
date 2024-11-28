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
	<div id="wrap" class="applyWrap">
		<h1>개발자 지원서</h1>
		<hr>
		
		<form action="/applyProc" id="applyForm">
			<fieldset>
				<legend>개인정보</legend>
				<label>
					<span>이름</span>
					<input type="text" name="userName" required
						placeholder="공백없이 입력하세요">
				</label>
				<label>
					<span>연락처</span>
					<input type="text" name="userPhone" required>
				</label>
			</fieldset>		
						
			<fieldset id="applyFieldset">
				<legend>지원 분야</legend>
				<label>
					<input type="radio" name="applyPart"
					value="Java" checked>
					<span>Java</span>
				</label>
				<label>
					<input type="radio" name="applyPart"
					value="Android">
					<span>Android</span>
				</label>
				<label>
					<input type="radio" name="applyPart"
					value="React">
					<span>React</span>
				</label>
			</fieldset>	
			
			<fieldset id="motiveFieldset">
				<legend>지원 동기</legend>
				<textarea name="applyMotive" placeholder="지원 동기 기재란"></textarea>
			</fieldset>	
			<div id="btnArea">
				<button>접수하기</button>
				<button type="reset">다시 쓰기</button>
			</div>
		</form>
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    






