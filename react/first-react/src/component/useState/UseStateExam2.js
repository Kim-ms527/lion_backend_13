import { useState } from "react";

const UseStateExam2 = () => {
  const [input, setInput] = useState("");
  const [names, setNames] = useState(["carami", "kang", "hong"]);
  const inputChangeHandler = (e) => {
    setInput(e.target.value);
  };
  const uploadHandler = () => {
    console.log(names);
    console.log(...names);
    console.log([input, names]);
    // setNames();
    setNames([input, ...names]);
  };

  return (
    <div>
      <input type="text" value={input} onChange={inputChangeHandler} />
      <button onClick={uploadHandler}>입력</button>

      {/* 입력받은 값들을 리스트로 출력  */}
      {names.map((name, index) => {
        return <p key={index}>{name}</p>;
      })}
    </div>
  );
};

export default UseStateExam2;
