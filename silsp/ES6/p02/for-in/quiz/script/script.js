const btnDom = document.querySelector("#resbtn");
btnDom.addEventListener("click", () => {
  let num1 = document.querySelector("#num1").value;
  let num2 = document.querySelector("#num2").value;
  let ary = [num1, num2];

  let min = Math.min(...ary);
  let max = Math.max(...ary);
  let sum = 0;

  for (let i = min; i <= max; i++) {
    sum += i;
  }

  let res = `${min}부터 ${max}까지의 누적 합: ${sum}`;
  document.querySelector("#resArea").innerText = res;
});
