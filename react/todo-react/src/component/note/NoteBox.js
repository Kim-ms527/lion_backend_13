import React, { useState } from "react";
import NoteInput from "./NoteInput";
import NoteList from "./NoteList";

const NoteBox = () => {
  const [notes, setNotes] = useState([]);

  // 메모 추가
  const addNote = (text) => {
    const newNote = {
      id: Date.now(),
      text,
      createdAt: new Date().toLocaleString(), // 작성 시간
    };
    setNotes((prevNotes) => [...prevNotes, newNote]);
  };

  // 메모 삭제
  const deleteNote = (id) => {
    setNotes((prevNotes) => prevNotes.filter((note) => note.id !== id));
  };

  // 메모 수정
  const updateNote = (updatedNote) => {
    setNotes((prevNotes) =>
      prevNotes.map((note) =>
        note.id === updatedNote.id ? { ...note, text: updatedNote.text } : note
      )
    );
  };

  return (
    <div className="card">
      <h2>carami Notes(기본)</h2>
      <NoteInput addHandler={addNote} />
      <NoteList
        notes={notes}
        deleteHandler={deleteNote}
        updateHandler={updateNote}
      />
    </div>
  );
};

export default NoteBox;
