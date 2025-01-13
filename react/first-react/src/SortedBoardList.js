import React, { useState } from "react";
import Board from "./Board";

const boardList = [
  {
    id: 3,
    title: "게시판 제목 3",
    created: "2021-10-01",
    readCount: 10,
    writer: "고길동",
  },
  {
    id: 2,
    title: "게시판 제목 2",
    created: "2021-09-22",
    readCount: 5,
    writer: "둘리",
  },
  {
    id: 1,
    title: "게시판 제목 1",
    created: "2021-07-03",
    readCount: 4,
    writer: "도우너",
  },
];

const SortedBoardList = () => {
  const [sortType, setSortType] = useState("readCount"); // 정렬 기준 상태

  // 정렬된 리스트 생성
  const sortedBoardList = [...boardList].sort((a, b) => {
    if (sortType === "readCount") {
      return b.readCount - a.readCount; // 조회수 내림차순
    } else if (sortType === "created") {
      return new Date(b.created) - new Date(a.created); // 작성일 내림차순
    } else if (sortType === "title") {
      return a.title.localeCompare(b.title); // 제목 오름차순
    }
    return 0;
  });

  return (
    <div>
      <div>
        <button onClick={() => setSortType("readCount")}>
          조회수 기준 정렬
        </button>
        <button onClick={() => setSortType("created")}>작성일 기준 정렬</button>
        <button onClick={() => setSortType("title")}>제목 기준 정렬</button>
      </div>
      <table border="1">
        <caption>게시판목록</caption>
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회수</th>
          </tr>
        </thead>
        <tbody>
          {sortedBoardList.map((board) => (
            <Board
              key={board.id}
              id={board.id}
              title={board.title}
              writer={board.writer}
              created={board.created}
              readCount={board.readCount}
            />
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default SortedBoardList;
