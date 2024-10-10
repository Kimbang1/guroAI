// 현재시간 출력
let now = new Date();
// 추가작업 : Date() 입력되는 시간에서 초단위는 00입력되도록 작업함

let nowHour = now.getHours();
let nowMinutes = now.getMinutes();
let nowTM = addZero(nowHour) + ":" + addZero(nowMinutes);
console.log("nowTM : " + nowTM);
const nowDom = document.querySelector("#nowTM");
nowDom.innerText = nowTM;

// 년  월 일 시:분:초
// 오늘의 년, 월, 일 산출을 위한 now 변수 활용
let thisYear = now.getFullYear();
let thisMonth = now.getMonth() + 1;
let thisDate = now.getDate();
let thisYMD = thisYear + " ";
thisYMD += thisMonth + " ";
thisYMD += thisDate;

// console.log("년 월 일 : " + thisYMD);

// 현재시간의 절대시간
let nowAbsTM;
// 종료시간의 절대시간
let endAbsTM;
// 종료시간과 현재시간의 절대시간차
let gap;

// 카운트다운 시간

// 종료시간 설정
const setBtnDom = document.querySelector("#setBtn");
setBtnDom.addEventListener("click", () => {
  let endTM = document.querySelector("#insEndTime").value;

  // 종료시간
  let targetTM = thisYMD + " " + endTM + ":00";
  console.log("종료시간 : " + targetTM);

  // 종료시간(=특정시간) 객체 생성
  const end = new Date(targetTM);

  // 종료시간 유효성 검사(현재시간 이후 설정여부 확인)
  console.log("endTM : " + endTM);
  if (endTM == "") {
    alert("종료시간을 입력해주세요");
    document.querySelector("#insEndTime").focus();
    endTM = "00:00";
  } else {
    // 현재시간의 절대시간
    nowAbsTM = now.getTime(); // 절대시간 반환  메서드
    console.log("nowAbsTM : " + nowAbsTM);
    // 종료시간의 절대시간
    endAbsTM = end.getTime();
    console.log("endAbsTM : " + endAbsTM);
    gap = endAbsTM - nowAbsTM;
    console.log("gap : " + gap);
    if (gap < 0) {
      alert("현재 시간 이후를 설정해주세요.");
      document.querySelector("#insEndTime").value = "";
      endTM = "00:00";
    } else {
      let resHour = Math.floor(
        (gap % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60)
      ); // 남은 시간
      let resMin = Math.floor((gap % (1000 * 60 * 60)) / (1000 * 60)); // 남은 분
      let resSec = Math.floor((gap % (1000 * 60)) / 1000); // 남은 초
      cntDown = addZero(resHour) + ":"; // 카운트다운할 시간
      cntDown += addZero(resMin) + ":";
      cntDown += addZero(resSec);
      document.querySelector("#cntdown").innerText = cntDown;
    }
  }

  document.querySelector("#endTM").innerText = endTM;
});

// 카운트 시작
let timeFlag;

const countStartDom = document.querySelector("#countStart");
countStartDom.addEventListener("click", () => {
  timeFlag = setInterval(fnStart, 1000);
});

function fnStart() {
  now = new Date();
  nowAbsTM = now.getTime();

  gap = endAbsTM - nowAbsTM;

  if (gap <= 0) {
    alert("시간종료!!");
    clearInterval(timeFlag);
    //document.querySelector("#cntdown").innerText = "00:00:00";
    return false;
  }

  console.log("gap : " + gap);
  let resHour = Math.floor((gap % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60)); // 남은 시간
  let resMin = Math.floor((gap % (1000 * 60 * 60)) / (1000 * 60)); // 남은 분
  let resSec = Math.floor((gap % (1000 * 60)) / 1000); // 남은 초
  cntDown = addZero(resHour) + ":"; // 카운트다운할 시간
  cntDown += addZero(resMin) + ":";
  cntDown += addZero(resSec);
  document.querySelector("#cntdown").innerText = cntDown;
}

// 카운트 중지
const countStopDom = document.querySelector("#countStop");
countStopDom.addEventListener("click", () => {
  clearInterval(timeFlag);
});

// 종료시간 리셋
const countResetDom = document.querySelector("#countReset");
countResetDom.addEventListener("click", () => {
  clearInterval(timeFlag);
  location.reload();
});

// 10미만 숫자 앞자리 "0" 추가 함수
function addZero(p) {
  p = parseInt(p);
  let res = "";
  if (p < 10) {
    res = "0" + p;
  } else {
    res = p;
  }
  return res;
}
