const TodoInput = ({ addTodo }) => {
  const keyDownHandler = (e) => {
    // console.log(e.key);
    if (e.key === "Enter") {
      //   console.log(e.target.value);
      //엔터가 입력되면 e.target.value 이 값이 todoList에 저장되면 되나요?
      if (e.target.value === "") return;
      //실제 리스트에 저장
      addTodo(e.target.value);
      e.target.value = "";
      e.target.focus();
    }
  };
  return (
    <input
      type="text"
      placeholder="할일을 입력하세요."
      onKeyDown={keyDownHandler}
    />
  );
};

export default TodoInput;
