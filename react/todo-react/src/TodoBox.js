import { useRef, useState } from "react";
import TodoInput from "./TodoInput";
import TodoList from "./TodoList";

const TodoBox = () => {
  const [todoList, setTodoList] = useState([
    { id: 1, title: "리액트 공부하기" },
    { id: 2, title: "스프링 공부하기" },
    { id: 3, title: "커피마시기" },
    { id: 7, title: "점심 맛있게 먹기" },
  ]);
  //id 는 값을 어떻게 생성하면 좋을까요? useRef 를 이용해야 겠구나.
  const id = useRef(Math.max(...todoList.map((todo) => todo.id)) + 1);
  // 추가
  const addTodoList = (title) => {
    console.log("box::::" + title);
    const newTodo = {
      id: id.current++,
      title: title,
    };

    setTodoList([...todoList, newTodo]);
  };

  // 삭제
  const deleteTodoList = (id) => {
    setTodoList(todoList.filter((todo) => todo.id !== id));
  };

  //수정
  const updateTodoList = (todo) => {
    //리랜더링이 필요없다면..
    todoList.map((item) => {
      if (item.id === todo.id) {
        item.title = todo.title;
      }
    });

    // //수정 후 리렌더링이 일어나야 한다면.
    // const updateTodoList = todoList.map((item) =>
    //   item.id === todo.id ? { ...item, title: todo.title } : item
    // );
    // setTodoList(updateTodoList);
  };
  return (
    <div>
      <TodoInput addTodo={addTodoList} />
      <TodoList todoList={todoList} />
    </div>
  );
};

export default TodoBox;
