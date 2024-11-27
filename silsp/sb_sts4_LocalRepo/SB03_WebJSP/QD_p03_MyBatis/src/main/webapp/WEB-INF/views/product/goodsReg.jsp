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
	<div id="wrap">
	<form action="/reg" method="post">
	
		<div class="dFlex" id="head">
		
			<div id="left">
			<h3>상품등록</h3>
			</div>
			
		<div id="right">
			<div class="showin">
				<span><a href="/list">목록보기</a></span>
			</div>
			<div class="showin">
				<span><a href="/">등록하기</a></span>
			</div>
		</div>
		</div>
		
		<div id="inputGoods">
			<div class="block">
				<div class="namebox">
					<span>* 상품명</span>
				</div>
				<input type="text" name="goodsName" required>
			</div>
			
			<div class="block">
				<div class="namebox">
					<span>* 상품코드</span>
				</div>
				<input type="text" name="goodsCode" required>
			</div>
			
			<div class="block">
				<div class="namebox">
					<span>가격</span>
				</div>
				<input type="number" name="price">
			</div>
			
			<div class="block">
				<div class="namebox">
					<span>* 재고</span>
				</div>
				<input type="number" name="cnt" required>
			</div>
		</div>
		
		
		<div class="dFlex" id="btnArea">
			<span>( * 필수)</span>
			<button>등록</button>
			<button type="reset">초기화</button>		
		</div>
		
		</form>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    