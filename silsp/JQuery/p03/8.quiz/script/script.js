$(function () {
  $(".mli").click(function () {
    $(".mli>a").css({ "font-weight": "nomal" });
    $(this).children("a").css({ "font-weight": "bold" });
    $(".mli").removeClass("selected");
    $(this).addClass("selected");
  });

  $("li.mli")
    .mouseover(function () {
      if (!$(this).hasClass("selected"))
        $(this).children("a").css({ "font-weight": "bold" });
    })
    .mouseout(function () {
      $(this).children("a").css({ "font-weigt": "normal" });
      $(".selected>a").css({ "font-weight": "bold" });
    });
});
