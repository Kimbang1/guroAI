//결과 보기 버튼 요소 2개
const baYelDom = document.querySelector("#baYelBtn");
const MedianDom = document.querySelector("#MedianBtn");

//결과 표시할 영역
const inputBDom = document.querySelector("#inputB");
const findMDom = document.querySelector("#findM");

//전역변수 설정
let numbers = [];

//각 버튼의 기능 영역
//1.배열 버튼
baYelDom.addEventListener("click", () => {
  //배열을 빈 배열로 초기화
  numbers = [];
  //입력된 배열 표시 초기화
  inputBDom.textContent = "";

  let index = 1; //prompt창에 1번부터 뜨게 하기위해서
  let userInput;

  //숫자 입력을 계속 받음(999 나 취소 누를때 까지)
  while (true) {
    userInput = prompt(`${index}번째 숫자 입력`);

    //입력 취소 또는999
    if (userInput === null || Number(userInput) === 999) {
      break;
    }

    //입력된 값을 배열에 추가(유효할때)
    if (!isNaN(userInput) && userInput.trim() !== "") {
      numbers.push(Number(userInput));
      index++;
    } else {
      alert("유요한 숫자를 쓰시오");
    }
  }

  inputBDom.textContent = `${numbers.join(", ")}`;
});

//2.메디안 버튼
MedianDom.addEventListener("click", () => {
  //중앙값을 구하기 위한 오름차순 정렬
  let sortedNumbers = [...numbers].sort((a, b) => a - b);

  let median;
  const midIndex = Math.floor(sortedNumbers.length / 2);

  if (sortedNumbers.length % 2 === 0) {
    //짝수일 경우, 중간 두 숫자의 평균
    median = (sortedNumbers[midIndex - 1] + sortedNumbers[midIndex]) / 2;
  } else {
    //홀수일 경우, 중간 값
    median = sortedNumbers[midIndex];
  }

  //중앙값을 화면에 표시
  findMDom.textContent = `${median.toFixed(1)}`;
});
