const resDom = document.querySelector("#resbtn"); //결과 보기 버튼요소

//결과 표시할 영역
const averageDom = document.querySelector("#average");
const maxDom = document.querySelector("#max");
const reversDom = document.querySelector("#revers");

resDom.addEventListener("click", () => {
  //입력된 점수들 가져오기
  const scoreInputs = document.querySelectorAll(".scoreInput");

  //빈 배열을 선언하여 입력받은 점수 저장
  let scores = [];

  //입력값을 배열로 저장
  scoreInputs.forEach((input) => {
    const score = Number(input.value); //숫자로 변환
    if (!isNaN(score)) {
      scores.push(score);
    }
  });
  
  //평균 계산
  const average = scores.reduce((a, b) => a + b, 0) / scores.length;
  
  //최고 점수 찾기
  const maxScore = Math.max(...scores);
  
  //점수 역순 정렬
  const sortScore = [...scores].sort((a, b) => a - b);

  const reverseScore =sortScore.reverse((a,b) => b-a);
  
  //결과를 화면에 표시
  averageDom.textContent = `1.응시자 평균 :${average.toFixed(1)}`;
  maxDom.textContent = `2.성적 우수자 :${maxScore}`;
  reversDom.textContent = `3.석차 :${reverseScore.join(`, `)}`;
  
});