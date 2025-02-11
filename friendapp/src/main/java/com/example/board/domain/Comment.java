package com.example.board.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("comment") // 테이블 매핑
@Getter
@Setter
public class Comment {
    @Id
    private Long id; // 댓글 ID (Primary Key)

    @Column("board_id") // 특정 게시글과 연결되는 ID
    private Long boardId;

    private String author;  // 댓글 작성자
    private String content; // 댓글 내용
    private String password; // 비밀번호 (삭제 시 검증)

    @Column("created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}
