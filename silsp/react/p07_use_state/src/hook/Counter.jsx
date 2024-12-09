import React, { useState } from "react";

function Counter(props) {
  let [cnt, setCount] = useState(0);    //배열 비구조화 여서 []를 사용한다.

  return (
    <div>
      <p>총 {cnt}번 클릭했습니다.</p>
      <button onClick={() => setCount(cnt + 1)}>클릭</button>
    </div>
  );
}

export default Counter;
