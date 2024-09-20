//DOM을 사용한 데이터 처리

const dom = document.querySelector("button");
dom.addEventListener("click", function () {
  const inputDom = document.querySelectorAll("input");
  let ary = [];
  ary[0] = parseInt(inputDom[0].value);
  ary[1] = parseInt(inputDom[1].value);
  ary[2] = parseInt(inputDom[2].value);
  ary[3] = parseInt(inputDom[3].value);

  console.log("입력한 배열 :" + ary.toString());

  let sum = ary[0] + ary[1] + ary[2] + ary[3];
  let avg = sum / ary.length;
  console.log("합계 : " + sum);
  console.log("평균 : " + avg.toFixed(1));
  ary.sort(function (a, b) {
    return a - b;
  });
  console.log("오름차순 정렬 : " + ary.toString());
  ary.sort(function (a, b) {
    return b - a;
  });
  console.log("내림차순 정렬 :" + ary.toString());
});
