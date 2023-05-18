package com.example.Tuan2.Controller;

import com.example.Tuan2.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class homeController {
    @Autowired
    private List<Product> products;

    @GetMapping
    public String home(){
        return "home/index";
    }
    @GetMapping("/abc")
    public String lo(){
        return "layout";
    }
}
