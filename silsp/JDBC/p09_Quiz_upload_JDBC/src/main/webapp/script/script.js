$(function(){
	$("#loginBtn").click(function(){
		window.location.href="member/login.jsp";
	});
	
	$("button[type=submit]").click(function(event){
		event.preventDefault();
		$().submit();
	});
});