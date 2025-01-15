import { useEffect, useState } from "react";

const Todo = ({ todo, deleteHandler, updateHandler }) => {
  // 수정폼, 수정
  const [updateMode, setUpdateMode] = useState(false);
  const [title, setTitle] = useState(todo.title);

  useEffect(() => {
    console.log("ToDo 컴포넌트가 화면에 나타남" + todo.title);

    return () => {
      console.log("ToDo 컴포넌트가 화면에서 사라짐" + todo.title);
    };
  }, [todo]);

  const updateModeHandler = () => {
    setUpdateMode(true);
  };
  const changeHandler = (e) => {
    setTitle(e.target.value);
  };
  const updater = () => {
    updateHandler({ id: todo.id, title: title });
    setUpdateMode(false);
  };

  if (updateMode) {
    return (
      <>
        <input type="text" value={title} onChange={changeHandler} />
        <button onClick={updater}>수정</button>
      </>
    );
  } else {
    return (
      <li>
        {todo.title}
        <button onClick={() => deleteHandler(todo.id)}>삭제</button>
        <button onClick={updateModeHandler}>수정</button>
      </li>
    );
  }
};

export default Todo;
