
//유효성 검사

function validateFrom(){
	var password = document.getElementById('password').value;
	var confirmPwd = document.getElementById('confirmPwd').value;
	var error = document.getElementById('confirmPwdE');
	
	if(password != confirmPwd){
		
		error.style.display='block'; //불일치시 메시지 보이기
		return false;
	}else{
		
		error.style.display='none';//일치하면 메세지 숨기기
		return true;
	}
}
	
