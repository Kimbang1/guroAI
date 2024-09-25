$(function () {
  // $(선택자).(function(){
  //   $(선택자).(function(){
  //     $(선택자.메서드();
  //};)

  $("button").click(function () {
    $("span").animate({ "margin-left": "300px" }, 3000, function () {
      $("span").css({ "margin-left": "0" });
    });
  });
  //인수=>CSS, Duration,CallBack
});
