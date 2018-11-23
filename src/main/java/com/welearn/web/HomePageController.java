package com.welearn.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping(value={"", "/", "index.html"})
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "temp/index";
    }
}