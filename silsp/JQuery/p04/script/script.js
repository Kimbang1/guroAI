// $(function () {
//   $(".mainLi").mouseover(function () {
//     $(this).find(".subMenu").slideDown(200);
//   }),
//     $(".mainLi").mouseleave(function () {
//       $(this).find(".subMenu").slideUp(200);
//     });

//   $(".subLi").mouseover(function () {
//     $(this).css("background-color", "blue");
//   });
//   $(".subLi").mouseleave(function () {
//     $(this).css("background-color", "white");
//   });
// });
$(function () {
  function showsubLi() {
    $(this).css("background-color", "blue");
  }
  function hidesubLi() {
    $(this).css("background-color", "");
  }
  $(".subLi").on("focusin mouseenter", showsubLi);
  $(".subLi").on("focusout mouseleave", hidesubLi);
});
