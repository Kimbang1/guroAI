import logo from "./logo.svg";
import "./App.css";
import React from "react";

import "./style/Style.css";
function App() {
  //   const element = <h1 className='h1Area'>jsx 출력 2</h1>;

  const element = React.createElement(
    "h1",
    { className: "sample" },
    "JSX 출력3."
  );
  return (
    // <h1 className='h1Area'>jsx를 사용한 출력</h1>
    element
  );
}

export default App;
