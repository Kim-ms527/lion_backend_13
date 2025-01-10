const btnStyle = {
  color: "white",
  background: "teal",
  padding: ".375rem .75rem",
  margin: ".5rem",
  border: "1px solid teal",
};

const MyButton = ({ title, clickHandler }) => {
  console.log("MyButton 컴포넌트 실행!!!");
  return (
    <button style={btnStyle} onClick={clickHandler}>
      {title}
    </button>
  );
};

MyButton.defaultProps = {
  title: "carami button",
  clickHandler: () => alert("디폴트 프롭스"),
};

export default MyButton;
