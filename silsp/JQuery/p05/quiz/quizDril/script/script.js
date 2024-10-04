$(function () {
  $(".submenu").css({ display: "none" });
  $("#gnb .main").mouseover(function () {
    $(this).children("div.submenu").show();
  });
  $("#gnb .main").mouseout(function () {
    $(this).children("div.submenu").css({ display: "none" });
  });
  $(".submenu").hover(
    function () {
      $(this).show(); // 서브 메뉴에 마우스를 올리면 보이게
    },
    function () {
      $(this).hide(); // 서브 메뉴에서 마우스를 떼면 숨기기
    }
  );

  // 슬라이드 쇼 작업
  function slide() {
    $("#slideFrame").animate({ left: "-1200px" }, 3000, function () {
      $("#slideFrame .slideA:first-child").insertAfter(
        "#slideFrame .slideA:last-child"
      );
      $(this).css({ left: "0" });
    });
  }
  // setInterval(slide,6000);

  // 모달레이어 작업
  function closed() {
    $("#modalWrap").hide();
    console.log("od");
  }

  //click 시 모달 열기
  $("#aclick").click(function () {
    $("#modalWrap").show();
    
  });

  $("#bt3").click(function () {
    closed();
  });
});
