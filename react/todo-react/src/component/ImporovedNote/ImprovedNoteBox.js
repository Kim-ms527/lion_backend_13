import React, { useState, useEffect } from "react";
import NoteInput from "./NoteInput";
import NoteList from "./NoteList";

const ImporovedNoteBox = () => {
  const [notes, setNotes] = useState([]);
  const [filter, setFilter] = useState("all"); // 'all', 'completed', 'incomplete'

  // 로컬 스토리지에서 메모 불러오기
  useEffect(() => {
    const savedNotes = JSON.parse(localStorage.getItem("notes")) || [];
    setNotes(savedNotes);
  }, []);

  // 메모 상태 변경 시 로컬 스토리지 업데이트
  useEffect(() => {
    localStorage.setItem("notes", JSON.stringify(notes));
  }, [notes]);

  // 메모 추가
  const addNote = (text) => {
    const newNote = {
      id: Date.now(),
      text,
      completed: false,
      createdAt: new Date().toLocaleString(),
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

  // 완료 상태 토글
  const toggleComplete = (id) => {
    setNotes((prevNotes) =>
      prevNotes.map((note) =>
        note.id === id ? { ...note, completed: !note.completed } : note
      )
    );
  };

  // 필터링된 메모 가져오기
  const getFilteredNotes = () => {
    if (filter === "completed") return notes.filter((note) => note.completed);
    if (filter === "incomplete") return notes.filter((note) => !note.completed);
    return notes; // "all"
  };

  return (
    <div className="card">
      <h2>carami Notes(수정,완료)</h2>
      <NoteInput addHandler={addNote} />
      <div>
        <button onClick={() => setFilter("all")}>전체 보기</button>
        <button onClick={() => setFilter("completed")}>완료된 메모</button>
        <button onClick={() => setFilter("incomplete")}>미완료 메모</button>
      </div>
      <NoteList
        notes={getFilteredNotes()}
        deleteHandler={deleteNote}
        updateHandler={updateNote}
        toggleCompleteHandler={toggleComplete}
      />
    </div>
  );
};

export default ImporovedNoteBox;
