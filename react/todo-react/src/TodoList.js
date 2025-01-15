import Todo from "./Todo";

const TodoList = ({ todoList, deleteHandler, updateHandler }) => {
  return (
    <ul>
      {/* <li>리액트 공부하기</li>   todoList 이용해서 출력는것으로 수정해주세요. 
      <li>스프링 공부하기</li>
      <li>커피마시기</li> */}
      {todoList.map((todo) => (
        <Todo
          key={todo.id}
          todo={todo}
          deleteHandler={deleteHandler}
          updateHandler={updateHandler}
        />
      ))}
    </ul>
  );
};

export default TodoList;
