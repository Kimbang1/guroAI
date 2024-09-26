$(function () {
  $("#gongji").click(function () {
    $("#gal").css({ display: "none" });
    $("#main").css({ display: "flex" });
    $("#gongji").css({ "border-bottom": "none" });
    $("#gallery").css({ "border-bottom": "1px solid #000" });

    console.log("gallery");
  });

  $("#gallery").click(function () {
    $("#main").css({ display: "none" });
    $("#gal").css({ display: "flex" });
    $("#gallery").css({ "border-bottom": "none" });
    $("#gongji").css({ "border-bottom": "1px solid #000" });
  });
});
