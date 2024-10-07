const btnDom = document.querySelector("button#resBtn");
btnDom.addEventListener("click", function () {
  let fruitCnt = document.querySelector("#fruitCnt").value;
  console.log("입력한 과일 개수 : " + fruitCnt);

  let resMsg = "";
  if (fruitCnt < 20) {
    resMsg = "입력오류! 20개 이상 입력해주세요.";
  } else {
    let boxAmount = 0; // 박스 1개에 포장할 수량
    let rdoDom = document.querySelectorAll("input[type=radio");
    // radio버튼 컬렉션(Collection)
    rdoDom.forEach(function (e, i) {
      // 컬렉션을 순환할 때 사용(e: element, i: index)
      if (rdoDom[i].checked) {
        console.log(i + ": " + e.value);
        boxAmount = e.value;
      }
    });

    // let rdoData1 = rdoDom[0].checked;
    // let rdoData2 = rdoDom[1].checked;
    // let rdoData3 = rdoDom[2].checked;
    // console.log(`rdoData1 : ${rdoData1}`);
    // console.log(`rdoData2 : ${rdoData2}`);
    // console.log(`rdoData3 : ${rdoData3}`);
    let boxName = "";
    switch (boxAmount) {
      case "8":
        boxName = "대과";
        break;
      case "11":
        boxName = "중과";
        break;
      case "15":
        boxName = "소과";
        break;
    }

    // 상자 개수
    let boxCnt = Math.floor(fruitCnt / boxAmount);
    console.log("boxCnt : " + boxCnt);
    // 남은 과일 개수
    let fruitRemain = fruitCnt % boxAmount;
    console.log("fruitRemain : " + fruitRemain);
    let resBox = `${boxName} ${boxCnt}`;

    resMsg = `${resBox} 상자를 포장하고 ${fruitRemain}개 남습니다.`;
  }

  document.querySelector("#resArea>p").innerText = resMsg;
});
