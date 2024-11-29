$(function() {

	//회원가입이 유효한 검사
	$("button#joinBtn").click(function() {
		let uidVal = $("#userid").val().trim();
		let pwdVal = $("#password").val().trim();
		let emailVal = $("#email").val().trim();

		if (uidVal == "" || pwdVal == "" || emailVal == "") {
			alert("가입 정보를 모두 입력하세요")
			$("#userid").focus();
			return false;
		} else {
			let user = {
				userid: uidVal,
				password: pwdVal,
				email: emailVal
			}
			console.log("user");

			$.ajax({
				type: "POST",
				url: "/join",
				data: JSON.stringify(user),
				contentType: "application/json; cahrset=utf-8"
			}).done(function(reponse) {
				console.log(reponse);
				location = "/"
			}).fail(function(error) {
				alert("에러 발생" + error);
			});
		}
	});


	//로그인 시작
	$("button#loginBtn").click(function() {
		let uidVal = $("#userid").val().trim();
		let upwVal = $("#password").val().trim();

		if (uidVal == "" || upwVal == "") {
			alert("ID와 PW를 모두 입력하시오");
			$("#userid").focus();
		} else {
			let loginData = {

				userid: uidVal,
				password: upwVal
			}
			console.log(loginData);
			$.ajax({
				type: "POST",
				url: "/login",
				data: JSON.stringify(loginData),
				contentType: "application/json;	charset=utf-8"
			}).done(function(response) {
				//	데이터	전송 정상실행
					location="/";					
			}).fail(function(error) {
				alert("오류가 발생했습니다." + error);
			});
		}

	
	});
	
	//글쓰기 저장 시작
	$("button#writeBtn").click(function(){
		let titleVal=$("#title").val().trim();
		let contentVal=$("#content").vla();
		
		if(titleVal==""){
			alert("글 제목을 입력하세요");
			$("#title").focus();
		}else{
			let writeData ={
				title: titleVal,
				content: contentVal
			}
			console.log(wrtieData);
			
			$.ajax({
				type:"POST",
				url:"/write",
				data:JSON.stringify(writeData),
				contentType: "appliction/json; charset=utf-8"
			}).done(function(){
				location="/";
			}).fail(function(error){
				alert("오류가 발생했습니다.")
			});
		}
	});
	
	
});