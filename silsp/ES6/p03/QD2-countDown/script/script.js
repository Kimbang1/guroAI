const currentTimedp = document.querySelector("#time span:nth-child(2)");
const closeTimeinput = document.querySelector("#closeTime input");
const closeTimedp = document.querySelector("#chcloseTime span:nth-child(2)");
const remainingTimedp = document.querySelector("#remaining span:nth-child(2)");

const startButton = document.querySelector("#Start");
const stopButton = document.querySelector("#Stop");
const restButton = document.querySelector("#Reset");
const checkButton = document.querySelector("#checkb");

let countdownInterval;
let targetTime;

//현재 시간을 오전/오후 형식으로 변환하는 변수
function formatTimeWithPeriod(date) {
  let hours = date.getHours();
  const minutes = String(date.getMinutes()).padStart(2, "0");
  const period = hours >= 12 ? "오후" : "오전";

  hours = hours % 12 || 12; //0시를 12시로, 13시 이후는 1~11시로 변환
  return `${period}${hours}:${minutes}`;
}

//현재 시간을 보여주는 함수
function updateCurrentTime() {
  const now = new Date();
  currentTimedp.textContent = formatTimeWithPeriod(now);
}

//남은 시간 계산해서 화면에 보여주는 함수
function updateRemainingTime() {
  const now = new Date();
  const remainingTime = targetTime - now;

  if (remainingTime <= 0) {
    clearInterval(countdownInterval);
    remainingTimedp.textContent = "00:00:00";
    alert("시간종료!!");
  } else {
    const hours = String(
      Math.floor((remainingTime / (1000 * 60 * 60)) % 24)
    ).padStart(2, "0");
    const minutes = String(
      Math.floor((remainingTime / (1000 * 60)) % 60)
    ).padStart(2, "0");
    const seconds = String(Math.floor((remainingTime / 1000) % 60)).padStart(
      2,
      "0"
    );
    remainingTimedp.textContent = `${hours}:${minutes}:${seconds}`;
  }
}

//종료 시간 설정 확인 버튼 클릭 시
checkButton.addEventListener("click", () => {
  const inputTime = closeTimeinput.value;
  if (!inputTime) {
    alert("종료시간을 입력하시게.");
    return;
  }
  const [hours, minutes] = inputTime.split(":").map(Number);
  const now = new Date();
  targetTime = new Date(
    now.getFullYear(),
    now.getMonth(),
    now.getDate(),
    hours,
    minutes,
    0
  );

  //현재 시간 이전을 입력한 경우 경고 메시지
  if (targetTime <= now) {
    alert("현재시간 이후를 입력하라!");
    closeTimeinput.value = "";
    closeTimedp.textContent = "00:00";
    return;
  }
  //설정된 종료시간 출력
  closeTimedp.textContent =formatTimeWithPeriod(targetTime);
});

//카운트 시작 버튼 클릭 시
startButton.addEventListener("click", () => {
  if (!targetTime) {
    alert("종료 시간을 먼저 설정하세요");
    return;
  }

  //기존 타이머 중지
  clearInterval(countdownInterval);
  countdownInterval = setInterval(updateRemainingTime, 1000);
}); //1초마다

//카운트 다운 중지 버튼 클릭시
stopButton.addEventListener("click", () => {
  clearInterval(countdownInterval);
});

//종료시간 리셋버튼
restButton.addEventListener("click", () => {
  clearInterval(countdownInterval);
  closeTimedp.textContent = "00:00";
  remainingTimedp.textContent = "00:00:00";
  closeTimeinput.value = ""; //입력 초기화
  targetTime = null;
});

setInterval(updateCurrentTime, 1000);
