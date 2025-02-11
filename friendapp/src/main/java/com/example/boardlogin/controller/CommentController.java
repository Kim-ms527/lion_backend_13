package com.example.boardlogin.controller;


import com.example.boardlogin.domain.Comment;
import com.example.boardlogin.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // 댓글 추가
    @PostMapping("/add")
    public String addComment(Comment comment) {
        commentService.addComment(comment);
        return "redirect:/boards/view?id=" + comment.getBoardId();
    }

    @GetMapping("/delete")
    public String deleteForm(@RequestParam("id") Long id, Model model) {
        model.addAttribute("id", id);
        return "board/deleteform";
    }

    // 댓글 삭제
    @PostMapping("/delete")
    public String deleteComment(@RequestParam(name = "id") Long id, @RequestParam(name = "password") String password,
                                @RequestParam(name="board_id") Long boardId, RedirectAttributes redirectAttributes) {
        boolean deleted = commentService.deleteComment(id, password);
        if (!deleted) {
            redirectAttributes.addFlashAttribute("replyErrorMessage", "삭제하려는 댓글의 비밀번호를 올바르게 입력하세요.");
        }
        return "redirect:/boards/view?id=" + boardId;
    }
}