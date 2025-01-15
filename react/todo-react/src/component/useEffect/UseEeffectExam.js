import { useEffect, useState } from "react";

const UseEeffectExam = () => {
  console.log("UseEeffectExam 랜더링");

  const [count, setCount] = useState(0);
  const [name, setName] = useState("test");

  // useEffect --  컴포넌트가 마운트, 업데이트, 마운트 해제될때 부려짐.
  // useEffect(()=>{})  -- 랜더링 될때마다 매번 실행
  //   useEffect(()=>{},[])  -- [] 디펜전지어레이 의 값이 변경될때 마다 실행
  //함수가  함수를  리턴할수 있나요?
  //useEffect(()=>{ return ()=>{clean up코드 }},[]) // 언마운팅될때 이 함수가 실행됨.

  useEffect(() => {
    console.log("useEffect() 실행!!");
  });
  useEffect(() => {
    console.log("useEffect() [count] 실행!!");
  }, [count]);
  useEffect(() => {
    console.log("useEffect() [name] 실행!!");
  }, [name]);
  useEffect(() => {
    console.log("useEffect() [] 실행!!");
  }, []); //비어있는 디펜전시 어레이는 최초 한 번 만 실행됨.

  return (
    <div>
      <span>count :: {count}</span>{" "}
      <button
        onClick={() => {
          setCount(count + 1);
        }}
      >
        update
      </button>
      <span>name :: {name} </span>
      <input
        type="text"
        value={name}
        onChange={() => {
          setName(name);
        }}
      />
    </div>
  );
};

export default UseEeffectExam;
