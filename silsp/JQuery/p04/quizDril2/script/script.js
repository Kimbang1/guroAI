$(function () {
  let currentIndex = 0;

  const slideCount = $("#slideFrame img").length; // 이미지 개수
  const slideWidth = $("#slideFrame").width(); // 슬라이드의 너비

  function moveSlider() {
    currentIndex++;

    if (currentIndex >= slideCount) {
      currentIndex = 0; // 마지막 이미지 이후에는 첫 번째 이미지로
    }
    $("#slideFrame").css("transform",`translateX(-${slideWidth * currentIndex}px)`);
    console.log(slideCount);
    console.log(slideWidth);

    
  }

  // 5초마다 슬라이드 이동
  setInterval(moveSlider, 3000);
});

// $(function () {
//   function slide() {
//     $("#slideFrame").animate({ "left": "-1000px" }, 1000, function () {
//       $("#slideFrame div.box:first-child").insertAfter("#slideFrame div.box:last-child");
//       $(this).css("left", "0");
//     });
//   }
//   // slide();
//   setInterval(slide,3000);
// });

// function slideShow() {
//   $("div#slideFrame").animate({"left" : "-1000px"}, 1000, function() {
//     $("div#slideFrame a:first-child").insertAfter("div#slideFrame a:last-child");
//     $(this).css({"left": "0"});
//   });

// $("div#slideFrame").animate({"left" : "-1000px"}, 1000, function() {
//   $(this).find("a").first().insertAfter($(this).children("a").last());
//   $(this).css({"left" : "0"});
// });

// }
