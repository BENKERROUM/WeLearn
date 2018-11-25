package com.welearn.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomePageController {

    @Value("${application.bootstrap.theme}")
    String appTheme;

    @Value("${spring.application.name}")
    String appName;

    private static String HOME_PAGE_TITLE = "Homepage";

    @GetMapping(value={"", "/", "index.html"})
    public String homePage(Model model) {
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Mohamed Benkerroum");
        model.addAttribute("apptheme",appTheme);
        model.addAttribute("pageTitle",HOME_PAGE_TITLE);
        return "homePage";
    }
}