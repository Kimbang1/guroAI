import React from "react";

function Book(props) {
  return (
    <div>
      <h1>{`도서명: ${props.name}`}</h1>
      <h2>{`페이지 정보 : ${props.numOfPage}`}</h2>
    </div>
  );
}

export default Book;
