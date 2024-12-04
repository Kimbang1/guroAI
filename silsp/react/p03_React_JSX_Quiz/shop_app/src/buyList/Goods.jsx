import React from "react";

function Goods(props) {
  return (
    <div>
      <p>{`${props.name} ${props.num}개 ${props.priceSum}원 `}</p>
    </div>
  );
}
export default Goods;
