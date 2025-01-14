import Todo from "./Todo";

const TodoList = ({ todoList, deleteHandler }) => {
  return (
    <ul>
      {/* <li>리액트 공부하기</li>   todoList 이용해서 출력는것으로 수정해주세요. 
      <li>스프링 공부하기</li>
      <li>커피마시기</li> */}
      {todoList.map((todo) => (
        <li key={todo.id}>
          <Todo todo={todo} deleteHandler={deleteHandler} />
        </li>
      ))}
    </ul>
  );
};

export default TodoList;
