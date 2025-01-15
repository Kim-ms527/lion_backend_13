import React, { useState } from "react";

const Note = ({
  note,
  deleteHandler,
  updateHandler,
  toggleCompleteHandler,
}) => {
  const [editMode, setEditMode] = useState(false); // 수정 모드 상태
  const [text, setText] = useState(note.text); // 수정 중 텍스트

  const handleTextChange = (e) => {
    setText(e.target.value);
  };

  if (!editMode) {
    return (
      <li
        style={{
          textDecoration: note.completed ? "line-through" : "none",
          color: note.completed ? "gray" : "black",
        }}
      >
        <p>{note.text}</p>
        <small>Created: {note.createdAt}</small>
        <div>
          <button onClick={() => setEditMode(true)}>수정</button>
          <button onClick={() => toggleCompleteHandler(note.id)}>
            {note.completed ? "미완료" : "완료"}
          </button>
          <button onClick={() => deleteHandler(note.id)}>삭제</button>
        </div>
      </li>
    );
  } else {
    return (
      <li>
        <input type="text" value={text} onChange={handleTextChange} />
        <button
          onClick={() => {
            updateHandler({ id: note.id, text });
            setEditMode(false);
          }}
        >
          저장
        </button>
        <button onClick={() => setEditMode(false)}>취소</button>
      </li>
    );
  }
};

export default Note;
