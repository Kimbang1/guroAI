// 중복확인 박스 작업 시작

function chkbox() {
  let scrWid = screen.width;
  let scrHei = screen.height;
  let popWid = 400;
  let popHei = 700;
  let lefPos = (scrWid - popWid) / 2;
  let topPos = (scrHei - popHei) / 2;
  let url = "./popup.html?id=" + id.value;
  let popName = "";
  var option = "width=" + popWid + "px, ";
  option += "height=" + popHei + "px, ";
  option += "left=" + lefPos + "px, ";
  option += "height=" + topPos + "px, ";
  option += "scrollbars=yes";

  window.open(url, popName, option);
}

function dclose() {
  window.close();
}

// 중복 확인 박스 작업 끝

// 비밀번호 동일한지 확인 작업 시작
function chkpwd() {
  const pwd = document.querySelector("#pwd").value;
  const pwd2 = document.querySelector("#pwd2").value;

  if (pwd == pwd2) {
    document.querySelector("#conf").innerText = "비밀번호가 같습니다.";
  } else {
    document.querySelector("#conf").innerText = "비밀번호가 다릅니다.";
  }
}
// 비밀번호 동일한지 확인 작업 끝

// 직접입력 셀렉 칸 작업 시작
function change1() {
  let sel = document.getElementById("eurl");
  let val = sel.value;

  document.getElementById("inemail").value = val;
}
// 직접입력 셀렉 칸 작업 끝

function register() {
  const id = document.querySelector("#id").value.trim();
  const pwd = document.querySelector("#pwd").value;
  const pwd2 = document.querySelector("#pwd2").value;
  const fdigit = document.querySelector("#fdigit").value.trim();
  const Domain = document.querySelector("#inemail").value.trim();

  //회원가입시 빈칸 검사
  let idRegex2 = /^\s*$/;

  if (idRegex2.test(id)) {
    alert("아이디가 비어있습니다. 입력해 주세요");
    location.reload();
    return;
  }
  if (idRegex2.test(pwd)) {
    alert("비밀번호가 비었습니다. 입력해.");
    location.reload();
    return;
  }
  if (idRegex2.test(pwd2)) {
    alert("비밀번호 확인란이 비었습니다. 입력해.");
    location.reload();
    return;
  }

  // 회원가입시 아이디 유효성 검사
  let idRegex = /^[a-zA-Z0-9]{6,20}$/;
  if (!idRegex.test(id)) {
    alert("아이디는 6~20자로 영어 대소문자 숫자로만 이루어져야 합니다.");
    return;
  }

  // 회원가입시 비밀번호 유효성 검사
  let pwdRegex = /^(?=.*[a-zA-Z])(?=.*\d)[a-zA-Z\d]{6,20}$/;
  if (!pwdRegex.test(pwd)) {
    alert("비밀번호는 6~20자로 영어 대소문자와 숫자로만 이루어져야 합니다.");
    return;
  }

  // 회원가입시 이메일 공백 유효성 검사
  if (!fdigit || !Domain) {
    alert("이메일을 입력해 주세요");
    return;
  }

  alert("회원가입이 완료되었습니다.");
}

function cancel() {
  // 'cancle' -> 'cancel'
  if (confirm("가입을 취소하시겠습니까?")) {
    location.reload();
  }
}
