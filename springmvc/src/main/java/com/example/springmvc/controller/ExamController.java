package com.example.springmvc.controller;

import com.example.springmvc.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam")
public class ExamController {
    @GetMapping("/example")
    public String showExample(Model model){
        model.addAttribute("username", "carami");
        model.addAttribute("isAdmin", false);
        model.addAttribute("languages", new String[]{"English","Spanish","Korean"});
        model.addAttribute("item", new Item("pen",3.33));
        return "example";
    }
}
