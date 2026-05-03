package com.portfolio.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/alt")
    public String homeSidebar() {
        return "index-sidebar";
    }

    @GetMapping("/dayy")
    public String homeDayy() {
        return "index-dayy";
    }

    @GetMapping("/linux")
    public String homeLinux() {
        return "index-linux";
    }
}
