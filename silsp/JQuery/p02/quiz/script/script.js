$(function () {
  $("#b1").click(function () {
    $("#sp").fadeToggle(3000);
  });
  $("#b2").click(function () {
    $("#sp").toggle(3000);
  });
  $("#b3").click(function () {
    $("#sp").slideToggle(3000);
  });
  $("#b4").click(function () {
    $("#sp").animate(
      {
        top: "20%",
        left: "20%",
        width: "-70%",
        height: "-70%",
      },
      3000,
      function () {
        $("#sp").animate({
          width: "60%",
          height: "60%",
        });
      }
    );
  });
});
