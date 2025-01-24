package com.example.springmvc.controller;

import com.example.springmvc.domain.Item;
import com.example.springmvc.domain.UserForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/list")
    public String showList(Model model){

        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
                "Item 6", "Item 7", "Item 8", "Item 9", "Item 10");
        model.addAttribute("items", items);

        return "list";
    }

    @GetMapping("/datetime")
    public String datetiem(Model model){
        model.addAttribute("currentDate", LocalDate.now());
        model.addAttribute("currentDateTime", LocalDateTime.now());
        model.addAttribute("currentTime", LocalTime.now());
        model.addAttribute("currentZonedDateTime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")));
        return "datetime";
    }

    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "form";
    }

//    @PostMapping("/submitForm")
//    public String submitForm(@ModelAttribute("userForm") UserForm userForm){
//        System.out.println(userForm.getPassword() +"::::"+ userForm.getUsername());
//        return "result";  //성공 시 결과 페이지로 리다이렉트
//    }

//    @PostMapping("/submitForm")
//    public String submitForm(@RequestParam("username") String username, @RequestParam("password") String password){
//        System.out.println(username +"::::"+ password);
//        return "result";  //성공 시 결과 페이지로 리다이렉트
//    }

    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult result){
        if(result.hasErrors()){
            return "form";  //유효성 검사 실패했을 때 다시 폼뷰초 리턴
        }

//        return "result";  //성공 시 결과 페이지로 포워딩
         return "redirect:/exam/datetime";
    }
//
//    @GetMapping("/submitForm")
//    public String submit(){
//        return "result";
//    }
}
