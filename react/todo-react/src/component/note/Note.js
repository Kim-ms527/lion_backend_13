import React, { useState } from "react";

const Note = ({ note, deleteHandler, updateHandler }) => {
  const [editMode, setEditMode] = useState(false);
  const [text, setText] = useState(note.text);

  const handleTextChange = (e) => {
    setText(e.target.value);
  };

  if (!editMode) {
    return (
      <li>
        <p>{note.text}</p>
        <small>Created: {note.createdAt}</small>
        <div>
          <button onClick={() => setEditMode(true)}>수정</button>
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
