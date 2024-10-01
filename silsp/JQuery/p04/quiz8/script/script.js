$(function(){
  // $("#textarea").keyup(function(){
  //   con
  // })
  $("#textarea").keyup(function(){
    let count= $(this).val().length;
    $("#count").text(count);
  });
});