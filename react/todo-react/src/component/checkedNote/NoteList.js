import Note from "./Note";

const NoteList = ({
  notes,
  deleteHandler,
  updateHandler,
  toggleCompleteHandler,
}) => {
  return (
    <ul>
      {notes.map((note) => (
        <Note
          key={note.id}
          note={note}
          deleteHandler={deleteHandler}
          updateHandler={updateHandler}
          toggleCompleteHandler={toggleCompleteHandler}
        />
      ))}
    </ul>
  );
};

export default NoteList;
