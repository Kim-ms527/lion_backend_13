import First from "./First";
import Parent from "./Parent";
import Second from "./Second";

const ChildrenExam = () => {
  return (
    <Parent>
      <First></First>
      <Second name="kang" />
      <Second name="kim" />
      <Second name="hong" />
    </Parent>
  );
};

export default ChildrenExam;
