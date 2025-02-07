package com.example.friendapp.controller;

import com.example.friendapp.domain.Friend;
import com.example.friendapp.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/friends")
@RequiredArgsConstructor
public class FriendController {
    private final FriendService friendService;
    @GetMapping("/list")
    public String list(Model model){
        //해야할일??
        model.addAttribute("friends", friendService.findAllFriend());
        return "friends/list";
    }
    @GetMapping("/add")  //친구추가폼보여줘요.
    public String addForm(Model model){
        model.addAttribute("friend", new Friend());
        return "friends/form";
    }

    @PostMapping("/add")  //친구저장해줘요.
    public String addFriend(@ModelAttribute Friend friend){
        friendService.addFriend(friend);
        return "redirect:/friends/list";
    }

    @GetMapping("/{id}")
    public String detailFriend(){
        return "friends/detail";
    }

}
