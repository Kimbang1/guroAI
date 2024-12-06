import react from "react";
import "../style/Style.css";

function Login(props) {
  return (
    <div>
      <h1>로그인</h1>
      <div id="inputBox">
        <div class="inputArea">
          <input type="text" placeholder="아이디 입력" />
        </div>

        <div class="inputArea">
          <input type="text" placeholder="비밀번호 입력" />
        </div>
      </div>

      <div id="BtnArea">
        <button>로그인</button>
      </div>
    </div>
  );
}

export default Login;
