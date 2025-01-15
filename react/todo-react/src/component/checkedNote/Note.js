const Note = ({ note, deleteHandler, toggleCompleteHandler }) => {
  return (
    <li
      style={{
        textDecoration: note.completed ? "line-through" : "none", // 완료된 메모는 취소선 적용
        color: note.completed ? "gray" : "black",
      }}
    >
      <p>{note.text}</p>
      <small>Created: {note.createdAt}</small>
      <div>
        <button onClick={() => toggleCompleteHandler(note.id)}>
          {note.completed ? "미완료" : "완료"}
        </button>
        <button onClick={() => deleteHandler(note.id)}>삭제</button>
      </div>
    </li>
  );
};

export default Note;
