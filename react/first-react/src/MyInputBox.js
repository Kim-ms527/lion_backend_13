import { useState } from "react";

const MyInputBox = () => {
  //text에 들어갈 값을 무엇으로 선언하면 될까요?
  //   const text = "기본값";    useState 를 이용해야겟구나.

  const [text, setText] = useState("기본값");

  const resetHandler = () => {
    // alert("안녕!!");
    setText("");
  };
  const changeHandler = (e) => {
    //무슨일을 하면 될까요? 인풋상자에서 값을 얻어와서 이 값으로 state를 바꾸면된다.
    setText(e.target.value);
  };

  return (
    <div>
      <label>{text}</label> <br />
      <input type="text" value={text} onChange={changeHandler} />
      <button onClick={resetHandler}>RESET</button>
    </div>
  );
};

export default MyInputBox;
