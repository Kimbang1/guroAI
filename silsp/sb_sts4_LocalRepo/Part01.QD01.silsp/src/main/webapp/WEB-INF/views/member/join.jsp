<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="EUC-KR">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
	
	<div id="header">
	<img src="/image/m_naver_logo_20191126.png" alt="naver.logo">
	</div>
				
			<div id="conArea">
			<form action="/submit" method="post" id="signupForm">
			
				<span>���̵�</span>
				<div class="inpA" >
					<input type="text" name="userId" required>
					<div class="id_naver">@naver.com</div>
				</div>
			
			
				<span>��й�ȣ</span>
				<div class="inpA">
					<input id="password" type="text" name="password" required>	
					<div class="pwdImg"><img src="/image/pw_01.png" alt="��й�ȣ ����"></div>	
				</div>
			
			
				<span>��й�ȣ ��Ȯ��</span>
				<div class="inpA">
					<input id="confirmPwd" type="password" name="confirmPwd" required>
					<div class="pwdImg"><img src="/image/pw_02.png" alt="��й�ȣ üũ����"></div>
					<div id="confirmPwdE" style="color:red; font-size: 12px; dislay:none;">��й�ȣ�� ��ġ���� �ʽ��ϴ�.</div>
				</div>

				<span>�̸�</span>
				<div class="inpA">
					<input type="text" name="username" required>
				</div>
			
			</form>
			</div>
			
			<div id="BTN">
			<button type="submit">�����ϱ�</button>
			</div>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    