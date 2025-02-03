package com.example.springmvc.controller;

import com.example.springmvc.domain.Item;
import com.example.springmvc.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("welcomeMessage","안녕하세요.  반갑습니다.");
        List<Item> items = Arrays.asList(
                new Item("사과",1.24),
                new Item("banana", 0.77),
                new Item("orange",0.44)
        );



//        List<Item> itemList = new ArrayList<>();
//        itemList.add(new Item("사과",1.24));
//        itemList.add(new Item("banana", 0.77));
//
//
//        Arrays.asList("a","b","c");

        model.addAttribute("items", items);

        return "welcome";
    }

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Apple", 1.20),
            new Product(2, "Banana", 0.75),
            new Product(3, "Cherry", 2.05)
    ));

    @GetMapping("/products2")
    public String showProducts(Model model) {
        model.addAttribute("productList", products);
        return "products2"; // 뷰의 이름을 반환
    }
    @GetMapping("/products3")
    public String showProducts3(Model model) {
        model.addAttribute("productList", products);
        return "products2"; // 뷰의 이름을 반환
    }

}
