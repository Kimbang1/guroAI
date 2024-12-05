import logo from "./logo.svg";
import "./App.css";
import black from "./images/black.gif";
import chai from "./images/chai.gif";
import cocktail from "./images/cocktail.gif";
import yellow from "./images/yellow.gif";
import "./style/Style.css";

const drink = [
  {
    name: "레몬 브리즈",
    description:
      "허브티, 미네랄, 푸르티드 음료와 레몬의 조화를 즐길 수 있는 최고의 음료입니다.",
    image: yellow,
  },

  {
    name: "차가운 차이맛 음료",
    description:
      "일반 차이티가 아닙니다. 얼음을 넣고 휘핑으로 마무리하여 고급스러운 향을 즐길 수 있습니다.",
    image: chai,
  },

  {
    name: "블랙 베리안 음료",
    description:
      "강렬한 베리와 블랙커피가 조화를 이루는 저녁시간에 적합한 음료입니다.",
    image: black,
  },
];
function App() {
  return (
    <div className="elixirs">
      <header>
        <span> 주간 음료 스페셜</span>
      </header>
      {drink.map((drink, index) => (
        <div key={index} className="inner-box">
          <img src={drink.image} alt={drink.name} className="drink-image" />
          <h2>{drink.name}</h2>
          <p>{drink.description}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
