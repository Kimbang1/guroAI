$(function(){
	
	// 입력 페이지 이동
	$(".dataLog").click(function(){
		let val = $(this).children().eq(0).text();

		location.href="/view?num="+val;
	});
	
	
	//리스트 페이지로 이동
	 $("button.applyList").click(function(){
		console.log("에러")
		location.href="/applyList";
	});
	
	//입력 페이지로 이동
	$("#insFormBtn").click(function(){
		location.href="/applyForm";
	});
	
	//내용 수정 페이지 이동
	$("#refactorBtn").click(function(){
		var num=$("#test").val();
		console.log("numpara:"+num );
		location.href="/refactor?num="+num;
	});
});