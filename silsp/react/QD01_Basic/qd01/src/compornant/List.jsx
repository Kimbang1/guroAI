import React from "react";
import black from "../images/black.gif";
import yellow from "../images/yellow.gif";
import cocktail from "../images/cocktail.gif";
import chai from "../images/chai.gif";

import Drink from "./Drink";

function List(props) {
  const lemonDesc =
    "허브티, 미네랄, 푸르티드 음료와 레몬의 조화를 즐길 수 있는 최고의 음료입니다.";
  const chaiDesc =
    "일반 차이티가 아닙니다. 얼음을 넣고 휘핑으로 마무리하여 고급스러운향을 즐길 수 있습니다.";
  const blackDesc =
    "강렬한 베리와 블랙커피가 조화를 이루는 저녁시간에 적합한 음료입니다.";
  return (
    <div>
      <h2>주간 음료 스페셜</h2>
      <Drink
        srcLink={yellow}
        altTxt="레몬 브리즈"
        title="Remon Briz"
        desc={lemonDesc}
      />
      <Drink
        srcLink={chai}
        altTxt="차이 음료"
        title="Chai Drink"
        desc={chaiDesc}
      />
      <Drink
        srcLink={black}
        altTxt="블랙 브레인 음료"
        title="Black Brain"
        desc={blackDesc}
      />
    </div>
  );
}
export default List;
