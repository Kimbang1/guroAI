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
	  <form action="/askProc">
		<h1>개발자 지원서</h1>
		<hr>
		
		<div id="prvImpo">
			<div class="subTitle">
				<h3>개인정보</h3>
			</div>
			
			<div class="inputArea">
				<span>이름</span>
				<input type="text" name="uname" placeholder="공백없이 입력하세요.">
			</div>

			<div class="inputArea">
				<span>연락처</span>
				<input type="tel" name="telNum">
			</div>
		</div>
		
		<div id="jiwon">
			<div class="subTitle">
				<h3>지원 분야</h3>
			</div>
			
			<div class="point">
				<input type="radio" name="check" value="JAVA">
				<span>JAVA</span>
			</div>
			
			<div class="point">
				<input type="radio" name="check" value="Android">
				<span>Android</span>
			</div>
			
			<div class="point">
				<input type="radio" name="check" value="React">
				<span>React</span>
			</div>
		</div>
		
		<div id="motive">
		
			<div class="subTitle">
				<h3>지원 동기</h3>
				<input type="text" name="jiwon" placeholder="지원 동기 기재란">
			</div>		
				
			<div id="but">
				<div class="butt">
					<button>접수하기</button>
				</div>
				
				<div class="butt">
					<button type="reset">다시쓰기</button>
				</div>
				
			</div>
		</div>
		
	</form>
	</div>

	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    