$(function(){
	
	// 입력 페이지 이동
	$(".dataLog").click(function(){
		let val = $(this).children().eq(0).text();

		location.href="/view?num="+val;
	});
	
});