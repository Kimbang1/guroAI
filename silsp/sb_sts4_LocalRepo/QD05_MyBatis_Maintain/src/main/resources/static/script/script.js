$(function(){
	
	// 입력 페이지 이동
	$(".dataLog").click(function(){
		let val = $(this).children().eq(0).text();

		location.href="/view?num="+val;
	});
	
	
	//리스트 페이지로 이동
	 $("button#applyList").click(function(){
		console.log("에러")
		location.href="/applyList";
	});
	
	//입력 페이지로 이동
	$("#insFormBtn").click(function(){
		location.href="/applyForm";
	});
});