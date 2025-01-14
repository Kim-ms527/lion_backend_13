import { useState } from "react";

const Todo = ({ todo, deleteHandler }) => {
  // 수정폼, 수정
  const [updateMode, setUpdateMode] = useState(false);
  const updateModeHandler = () => {
    setUpdateMode(true);
  };

  if (updateMode) {
    return (
      <>
        <input type="text" value="수정할 값" />
        <button>수정</button>
      </>
    );
  } else {
    return (
      <>
        {todo.title}
        <button onClick={() => deleteHandler(todo.id)}>삭제</button>
        <button onClick={updateModeHandler}>수정</button>
      </>
    );
  }
};

export default Todo;
