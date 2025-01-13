const Board = (board) => {
  return (
    <tr>
      <td>{board.id}</td>
      <td>{board.title}</td>
      <td>{board.writer}</td>
      <td>{board.created}</td>
      <td>{board.readCount}</td>
    </tr>
  );
};

export default Board;
