$(()=>{
	
//  상품등록페이지로 이동	
    $(".goodsReg").click(()=>{
		location.href='/reg.html';
	});
	
//  상품목록페이지로 이동
	$("#btnGoList").click(()=>{
		location.href="/list.jsp";
	});
	
//  가격표 천단위 구분 쉼표 적용	
    $("p.price").each(function(){
		let money = parseInt($(this).text());
		//console.log(money);
		$(this).text(money.toLocaleString());
	});
	
	
// 	업로드 파일삭제 및 DB Row 제거 시작	
	$(".delIcon").click(function(){
		
		let chk = confirm("삭제하시겠습니까?");
		if (chk) {
			let number = $(this).parents("div.goodsItem").children("input[type=hidden]").eq(0).val();
			console.log("number : " + number);
			let upFName = $(this).parents("div.goodsItem").children("input[type=hidden]").eq(1).val();
			console.log("upFName : " + upFName);
			
			location.href="/fileRemove.jsp?number="+number+"&upFName="+upFName;
		} else {
			alert("취소하셨습니다.");
		}
		
	});
	
});