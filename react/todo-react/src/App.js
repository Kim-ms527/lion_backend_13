import ImporovedNoteBox from "./component/ImporovedNote/ImprovedNoteBox";
import NoteBox from "./component/note/NoteBox";
import CheckedNoteBox from "./component/checkedNote/CheckdNoteBox";

function App() {
  return (
    <div className="grid-container">
      {/* <TodoBox className="card" /> */}
      {/* <UseEeffectExam /> */}
      {/* <UseEffectCleanUp /> */}
      <NoteBox />
      <CheckedNoteBox />
      <ImporovedNoteBox />
    </div>
  );
}

export default App;
