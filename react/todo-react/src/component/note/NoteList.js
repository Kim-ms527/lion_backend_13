import Note from "./Note";

const NoteList = ({ notes, deleteHandler, updateHandler }) => {
  return (
    <ul>
      {notes.map((note) => (
        <Note
          key={note.id}
          note={note}
          deleteHandler={deleteHandler}
          updateHandler={updateHandler}
        />
      ))}
    </ul>
  );
};

export default NoteList;
