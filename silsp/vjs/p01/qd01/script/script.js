function func1() {
  let data1 = document.querySelector("#ref").innerText;
  document.querySelector("#output").innerText = data1;
}
function func2() {
  func1();
  document.querySelector("#output").style.fontSize = "30px";
  document.querySelector("#output").style.fontweight = "bold";
  document.querySelector("#output").style.border = "5px solid #f80";
}
