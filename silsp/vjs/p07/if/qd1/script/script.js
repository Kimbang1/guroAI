// BMI지수 확인
const resBtnDom = document.querySelector("#resBtn");
resBtnDom.addEventListener("click", function () {
  let weight = document.querySelector("#weight").value;
  let height = document.querySelector("#height").value;
  height /= 100;
  let bmi = weight / Math.pow(height, 2);
  document.querySelector("#bmiIndex").innerText = bmi.toFixed(1);
  let chkMsg = "";
  if (bmi >= 25) {
    chkMsg = "과";
  } else if (bmi >= 20) {
    chkMsg = "표준";
  } else {
    chkMsg = "저";
  }
  document.querySelector("#chkBmiMsg").innerText = chkMsg + "체중입니다.";
});

// BMI 체크 메시지
const styleBtnDom = document.querySelector("#styleBtn");
styleBtnDom.addEventListener("click", function () {
  const dom = document.querySelector("#bmiIndex");
  dom.style.color = "#f22";
  dom.style.fontSize = "22px";
  dom.style.textDecoration = "underline";
});
