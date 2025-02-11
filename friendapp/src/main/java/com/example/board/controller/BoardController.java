package com.example.board.controller;

import com.example.board.domain.Board;
import com.example.board.domain.Comment;
import com.example.board.service.BoardService;
import com.example.board.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {


    private final BoardService boardService;
    private final CommentService commentService;

    @GetMapping
    public String listBoards(Model model,
                             @RequestParam(name="page",required = false, defaultValue = "1") int page,
                             @RequestParam(name="pageSize",required = false,defaultValue = "5") int pageSize) {
//
        model.addAttribute("boards", boardService.findAllBoards(page,pageSize));
        model.addAttribute("currentPage", page);

        return "board_reply/list";
    }

    @GetMapping("/view")
    public String viewBoard(@RequestParam("id") Long id,
                            @RequestParam(value = "page", defaultValue = "1") int page,
                            Model model) {
        Optional<Board> board = boardService.findById(id);
        board.ifPresent(b -> {
            model.addAttribute("board", b);
            model.addAttribute("currentPage", page);

            //댓글리스트추가!!
            List<Comment> comments = commentService.getCommentsByBoardId(id);
            model.addAttribute("comments", comments);
        });
        return "board_reply/view";
    }

    @GetMapping("/deleteform")
    public String deleteForm(@RequestParam("id") Long id, Model model) {
        model.addAttribute("id", id);
        return "board_reply/deleteform";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id, @RequestParam("password") String password) {
        if (boardService.verifyPassword(id, password)) {
            boardService.deleteById(id);
            return "redirect:/boards";
        }
         return "redirect:/boards/deleteform?id=" + id + "&error=true";
    }

    @GetMapping("/writeform")
    public String writeForm(Model model) {
        model.addAttribute("board", new Board());
        return "board_reply/writeform";
    }

    @PostMapping("/write")
    public String write(Board board) {
        boardService.saveBoard(board);
        return "redirect:/boards";
    }

    @GetMapping("/updateform")
    public String updateForm(@RequestParam("id") Long id, Model model) {
        Board board = boardService.findById(id).orElse(null);
        model.addAttribute("board", board);
        return "board_reply/updateform";
    }

    @PostMapping("/update")
    public String update(Board board, RedirectAttributes redirectAttributes) {
        if (boardService.verifyPassword(board.getId(), board.getPassword())) {
            boardService.update(board);
            return "redirect:/boards/view?id=" + board.getId();
        }else{
            redirectAttributes.addFlashAttribute("errorMessage", "비밀번호가 일치하지 않으므로 수정 할 수없습니다.");
            return "redirect:/boards/view?id=" + board.getId();
        }
    }
}