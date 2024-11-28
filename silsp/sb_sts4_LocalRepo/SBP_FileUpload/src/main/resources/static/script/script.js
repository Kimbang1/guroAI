$(function() {
	// 파일 다운로드
	$("button#fileDownBtn").click(function() {
		$("form#fileMgrForm").attr("action", "/downloadProc").submit();
	});
	
	//파일삭제
	$("#fileDelBtn").click(function(){
		let removeChk=confirm("파일을 삭제하시겠습니까?")
		$("form#fileMgrForm").attr("action", "/fileDelProc").submit();
	});
});