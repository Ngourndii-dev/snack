package com.example.demo.controller;

import com.example.demo.entity.Menus;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/html5/menu.html")
    public String menuPage(Model model) {
        List<Menus> menu = productService.findAll();
        for (Menus item : menu) {
            System.out.println("Image URL: " + item.getImageUrl());
        }
        model.addAttribute("menu", menu);
        return "menu";
    }
    @GetMapping("/")
    public String homePage(Model model){
        return "index";
    }
}
