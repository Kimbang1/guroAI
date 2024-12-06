import "./App.css";
import "./style/Style.css";
import black from "./images/black.gif";
import chai from "./images/chai.gif";
import cocktail from "./images/cocktail.gif";
import yellow from "./images/yellow.gif";

function App() {
  return (
    <div className="elixirs">
      {/* 헤더 섹션 */}
      <header>주간 음료 스페셜</header>

      {/* 레몬 브리즈 */}
      <div className="inner-box">
        <img src={yellow} alt="레몬 브리즈" className="drink-image" />
        <h2>레몬 브리즈</h2>
        <p>
          허브티, 미네랄, 푸르티드 음료와 레몬의 조화를 즐길 수 있는 최고의
          음료입니다.
        </p>
      </div>

      {/* 차가운 차이맛 음료 */}
      <div className="inner-box">
        <img src={chai} alt="차가운 차이맛 음료" className="drink-image" />
        <h2>차가운 차이맛 음료</h2>
        <p>
          일반 차이티가 아닙니다. 얼음을 넣고 휘핑으로 마무리하여 고급스러운
          향을 즐길 수 있습니다.
        </p>
      </div>

      {/* 블랙 베리안 음료 */}
      <div className="inner-box">
        <img src={black} alt="블랙 베리안 음료" className="drink-image" />
        <h2>블랙 베리안 음료</h2>
        <p>
          강렬한 베리와 블랙커피가 조화를 이루는 저녁시간에 적합한 음료입니다.
        </p>
      </div>
      
    </div>
  );
}

export default App;
