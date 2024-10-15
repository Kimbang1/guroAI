//등록하기 버튼 값 누를때
const btnDom = document.querySelector("#btn");

// //상품명과 수량 기입할때
// const objectTagDom = document.querySelector("#objectTag").value;
// const countDom = document.querySelector("#count").value;

//재고 목록을 표시할 영역
const reslistDom = document.querySelector("#reslist");

//상품 목록을 저장할 Map 객체
const inventory = new Map();

//버튼 클릭시 알람창, 값 가져오기
btnDom.addEventListener("click", () => {
  //상품명과 수량 기입할때
  const oTagValue = document.querySelector("#objectTag").value;
  const cValue = document.querySelector("#count").value;
  //입력값 검증
  if (oTagValue === "" || cValue === "") {
    alert("상품명과 수량을 모두 입력하세요");
    return;
  }
  //등록 확인 프롬프트
  const confirmResister = confirm("상품을 등록하시겠습니까?");
  if (!confirmResister) return;

  //상품등록
  inventory.set(oTagValue, Number(cValue));

  //재고목록 출력
  displayInventory();

  //입력란 초기화
  document.querySelector("#objectTag").value = "";
  document.querySelector("#count").value = "";
});

//재고 목록 표시 함수
function displayInventory() {
  reslistDom.innerHTML = ""; //기존 목록 초기화

  let no = 1;

  // Map 객체를 for...of를 사용하여 순회
  for (const [name, quantity] of inventory) {
    const itemDiv = document.createElement("div");
    itemDiv.classList.add("item");

    itemDiv.innerHTML = `
      <div id="no">${no}</div>
      <div id="name">${name}</div>
      <div id="quantity">${quantity}</div>
      <div class="delete" data-name="${name}">X</div>
      `;
    reslistDom.appendChild(itemDiv);
    no++;
  }

  // const listItem = document.createElement("li");
  // listItem.innerHTML = `
  //    ${productName} - ${productQuantity}개
  //           <button class="delete-btn">삭제</button>`;

  // stockList.appendChild(listItem);

  const dlBts = document.querySelectorAll(".delete");
  dlBts.forEach((btn) => {
    btn.addEventListener("click", (e) => {
      const itemName = e.target.dataset.name;
      inventory.delete(itemName);
      displayInventory();
    });
  });
}
