package com.example.boardlogin.repository;


import com.example.boardlogin.domain.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
    // 특정 게시글의 댓글을 조회
    List<Comment> findByBoardId(Long boardId);
}
