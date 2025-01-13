import Counter from "./Counter";
import Hello from "./Hello";
import MyButton from "./MyButton";
import MyInputBox from "./MyInputBox";
import Welcome from "./Welcome";
import ChildrenExam from "./component/propsChildren/ChildrenExam";
import UseStateExam1 from "./component/useState/UseStateExam1";
import UseStateExam2 from "./component/useState/UseStateExam2";

function App() {
  console.log("App 컴포넌트 실행!! ");
  return (
    <div>
      <h1>react!!</h1>
      {/* <Counter />
      <MyButton title="뭐야뭐야" />
      <Hello color={"red"} name={"kang"} isSpecial={false} /> */}
      {/* <ChildrenExam /> */}
      {/* <Welcome flag={false} /> */}

      {/* <MyInputBox /> */}
      {/* <UseStateExam1 /> */}
      <UseStateExam2 />
    </div>
  );
}

export default App;
