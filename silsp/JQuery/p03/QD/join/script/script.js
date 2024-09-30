$(function () {
  $("#checkAll").click(function () {
    var isCheckde = $(this).is(":checked");
    $("input").prop("checked", isCheckde);
  });

  $(".items").click(function () {
    var total = $(".items").length;
    var checked = $(".items:checked").length;

    if (total === checked) {
      $("#checkAll").prop("checked", true);
    } else {
      $("#checkAll").prop("checked", false);
    }
  });

  $("#registerBtn").click(function () {
    var total = $(".Required").length;
    var checked = $(".Required:checked").length;

    if (total === checked) {
      
      window.location.href = "join.html";
    } else {
      alert("필수 약관 동의필요");
      console.log("true");
    }
  });
  
});


