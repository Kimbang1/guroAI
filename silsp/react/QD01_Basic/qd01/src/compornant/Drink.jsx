import React from "react";

function Drink(props) {
  return (
    <div className="drinkArea">
      <img src={props.srcLink} alt={props.altTxt} />
      <h2>{props.title}</h2>
      <p>{props.desc}</p>
    </div>
  );
}

export default Drink;
