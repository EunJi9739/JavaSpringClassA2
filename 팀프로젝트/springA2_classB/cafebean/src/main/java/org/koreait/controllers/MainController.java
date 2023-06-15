package org.koreait.controllers;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.Product;
import org.koreait.models.product.ProductListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/")
//@RequiredArgsConstructor
public class MainController {
    //private final ProductListService productListService;

    @GetMapping
    public String index(Model model){

        System.out.println("test");
        List<Product> list = productListService.gets();
        model.addAttribute("list",list);

        return "/index";
    }
}
