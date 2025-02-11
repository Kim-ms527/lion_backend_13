package com.example.boardlogin.service;

import com.example.boardlogin.domain.Comment;
import com.example.boardlogin.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // 특정 게시글의 댓글 조회
    public List<Comment> getCommentsByBoardId(Long boardId) {
        return commentRepository.findByBoardId(boardId);
    }

    // 댓글 추가
    @Transactional
    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }

    // 댓글 삭제 (비밀번호 검증)
    @Transactional
    public boolean deleteComment(Long id, String password) {
        return commentRepository.findById(id)
                .filter(comment -> comment.getPassword().equals(password))
                .map(comment -> {
                    commentRepository.deleteById(id);
                    return true;
                }).orElse(false);
    }
}
