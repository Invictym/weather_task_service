package com.weather.service.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String main(Model mode) {
        mode.addAttribute("name", "+17");
        return "greeting";
    }
}
