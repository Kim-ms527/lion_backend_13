package com.example.friendapp.controller;

import com.example.friendapp.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

}
