import Counter from "./Counter";
import Hello from "./Hello";
import MyButton from "./MyButton";
import Welcome from "./Welcome";
import ChildrenExam from "./component/propsChildren/ChildrenExam";

function App() {
  console.log("App 컴포넌트 실행!! ");
  return (
    <div>
      <h1>react!!</h1>
      {/* <Counter />
      <MyButton title="뭐야뭐야" />
      <Hello color={"red"} name={"kang"} isSpecial={false} /> */}
      {/* <ChildrenExam /> */}
      <Welcome flag={false} />
    </div>
  );
}

export default App;
