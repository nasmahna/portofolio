package com.portfolio.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/linux"})
    public String home() {
        return "index-linux";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
