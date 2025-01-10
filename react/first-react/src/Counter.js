import { useState } from "react";
import MyButton from "./MyButton";

const Counter = () => {
  console.log("counter 컴포넌트 실행!! ");
  //   let count = 5;
  const [count, setCount] = useState(0);

  const plusHandler = () => {
    console.log(count);
    // count++;
    setCount(count + 1);
  };
  const minusHandler = () => {
    console.log(count);
    // count--;
    setCount(count - 1);
  };
  return (
    <div>
      <h2>{count}</h2>
      {/* <input type="button" value="+" onClick={plusHandler} />
      <input type="button" value="-" onClick={minusHandler} /> */}
      <MyButton title="+" clickHandler={plusHandler} />
      <MyButton title="-" clickHandler={minusHandler} />

      <MyButton title="안녕" clickHandler={() => alert("안녕")}></MyButton>
    </div>
  );
};

export default Counter;
