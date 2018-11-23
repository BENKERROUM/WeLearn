package com.welearn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailPageController {

    @GetMapping("/detail")
    public String homePage(Model model) {
        //model.addAttribute("appName", appName);
        return "temp/no-sidebar";
    }
}
