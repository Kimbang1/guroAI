import react from "react";
import "../style/Style.css";
import "../script/Script.js";
import { useRef } from "react";

function Login(props) {
  /*아이디와 비번 설정*/
  //ref를 useRef로 초기화
  const idref = useRef(null);
  const pwdref = useRef(null);

  //로그인 버튼 클릭시 빈칸확인
  const loginBtn = () => {
    idref.current && pwdref.current
      ? idref.current.value === "" || pwdref.current.value === ""
        ? alert("아이디와 비밀번호를 모두 입력하거라")
        : alert("로그인 성공이니라")
      : alert("입력이 뭔가 이상한데?");
  };

  return (
    <div class="viewBox">
      <h1>로그인</h1>
      <div id="inputBox">
        <div class="inputArea">
          <input type="text" placeholder="아이디 입력" ref={idref} />
        </div>

        <div class="inputArea">
          <input type="password" placeholder="비밀번호 입력" ref={pwdref} />
        </div>

        <div id="BtnArea">
          <button onClick={loginBtn}>로그인</button>
        </div>
      </div>
    </div>
  );
}

export default Login;
