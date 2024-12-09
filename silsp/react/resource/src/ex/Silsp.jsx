import React from "react";
import "../assets/style/Style.css";

function Silsp(props) {
  const myStyle = {
    color: "#08f",
    fontSize: "24px",
  };

  return (
    <div>
      <p style={myStyle}>컴퍼넌트 내부CSS 객체 적용</p>
      <p className="sample">외부 클래스 테스트</p>
      <div>
      <img src={process.env.PUBLIC_URL+"images/yellow.gif"} alt="" />

      </div>
    </div>
  );
}
export default Silsp;
