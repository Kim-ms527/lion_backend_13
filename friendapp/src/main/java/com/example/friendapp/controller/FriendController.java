package com.example.friendapp.controller;

import com.example.friendapp.domain.Friend;
import com.example.friendapp.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/edit/{id}")
    public String updateForm(@PathVariable("id")Long id, Model model){
        model.addAttribute("friend", friendService.findFriendById(id));
        return "friends/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Friend friend){
        friendService.updateFriend(friend);
        return "redirect:/friends/list";
    }


    @GetMapping("/{id}")
    public String detailFriend(@PathVariable(name = "id")Long id, Model model){
        //서비스에게 부탁해서 id에 해당하는 친구정보를 얻어와야함.
        model.addAttribute("friend",friendService.findFriendById(id));
        return "friends/detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        friendService.deleteFriendById(id);
        return "redirect:/friends/list";
    }

}
