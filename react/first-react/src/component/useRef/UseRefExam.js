import { useRef, useState } from "react";

const UseRefExam = () => {
  console.log("컴포넌트 랜더링!!");
  const [countState, setCountState] = useState(0);
  const countRef = useRef(0);
  let countLet = 0;

  const increaseState = () => {
    setCountState(countState + 1);
    console.log("useState ::::::::::::: " + (count + 1));
  };
  const increatseRef = () => {
    countRef.current++;
    console.log("useRef::::::::::::::::::::::" + countRef.current);
  };
  const increaseLet = () => {
    countLet++;
    console.log("Let :::::::::::::::::  " + countLet);
  };

  return (
    <div>
      <p>useState : {countState}</p>
      <p>useRef : {countRef.current}</p>
      <p>Let : {countLet}</p>

      <button onClick={increaseState}>useState update</button>
      <button onClick={increaseRef}>useRef update</button>
      <button onClick={increaseLet}>Let update</button>
    </div>
  );
};
export default UseRefExam;
