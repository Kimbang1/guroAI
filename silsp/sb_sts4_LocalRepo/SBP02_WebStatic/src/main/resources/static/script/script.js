/**
 * 
 */
 //메인에서 서브로
// $("#goSubMain").on("click",function(){
//	location.href ='/sub/subMain.html';
//});
//
////서브에서 메인으로
//$("#goMain").on("click",function(){
//	location.href='/index.html'
//});

$(function(){
//메인에서 서브로	
	$("#goSubMain").click(()=>{
		location.href="/sub/subMain.html";
	});

//서브에서 메인으로
	$("#goMain").click(()=>{
		location.href="/";
	});
	
});