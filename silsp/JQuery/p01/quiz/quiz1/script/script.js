$(function () {
  //결과 2구현
  $("label").css({
    color: "#08f",
    "font-size": "20px",
    border: "2px solid #f80",
  });
  //결과 3구현
  $("button").click(function () {
    $("label")
    .text("가나다")
    .css({
      color: "#f80",
      border: "2px solid #08f"
    });
  });
});
