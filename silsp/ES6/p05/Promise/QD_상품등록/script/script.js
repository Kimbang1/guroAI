let errMsg = "조건에 맞춰 다시 입력하세요";
let errMsg1 = "검수 확인을 다시 확인해주세요";
let pass = "ok~";

//상품코드 유효성 검사
function codetest(e) {
  const pattern = /^(?=.*[A-z])(?=.*\d)[A-z\d#_-]{5,15}$/;
  return pattern.test(e);
}

//상품명 유효성 검사
function goodstest(e) {
  let pattern =
    /^(?=.*[A-z])(?=.*[ㄱ-ㅎㅏ-ㅣ가-힣])[A-zㄱ-ㅎㅏ-ㅣ가-힣\d#]{2,}$/;
  return pattern.test(e);
}

//담당자 이름 유효성 검사
function nametest(e) {
  let pattern = /^(?=.*[ㄱ-ㅎㅏ-ㅣ가-힣])[ㄱ-ㅎㅏ-ㅣ가-힣]{2,5}$/;
  return pattern.test(e);
}

//버튼 눌렀을때 실행되는 함수들
function submitbtn() {
  const spCDom = document.querySelector("#spC").value;
  const gNDom = document.querySelector("#goodsNm").value;
  const RpDom = document.querySelector("#Responsible").value;
  const chekDom = document.querySelector("#check").checked;

  if (spCDom == "" || gNDom == "" || RpDom == "" || chekDom == false) {
    alert("제대로 작성하세요.");
  }
  //상품코드에 관한것
  if (!codetest(spCDom)) {
    document.querySelector("#pass1").innerText = "코드를 잘못 적었습니다.";
  } else {
    document.querySelector("#pass1").innerText = pass;
    console.log(spCDom);
  }

  //상품명에 관한것
  if (!goodstest(gNDom)) {
    document.querySelector("#pass2").innerText = "상품명이 틀렸습니다.";
    console.log(gNDom);
  } else {
    document.querySelector("#pass2").innerText = pass;
    console.log(gNDom);
  }

  //담당자 이름에 관한 것
  if (!nametest(RpDom)) {
    document.querySelector("#pass3").innerText = "이름이 틀렸습니다.";
  } else {
    document.querySelector("#pass3").innerText = " ";
    console.log(RpDom);
  }

  //검수 확인 버튼
  if (!chekDom) {
    document.querySelector("#pass4").innerText = "확인체크해주세요";
    console.log(chekDom);
  } else {
    document.querySelector("#pass4").innerText = " ";
    console.log(chekDom);
  }

  if (codetest(spCDom) && goodstest(gNDom) && nametest(RpDom) && chekDom) {
    confirm("완료");
    innerText.reset;
  }
}

function returnBtn() {
  if (confirm("작성된 내용을 지우고 다시 작성하시겠습니까?")) {
    document.querySelectorAll(".box").reset();
    document.querySelector("#chbox").reset();
  }
}
