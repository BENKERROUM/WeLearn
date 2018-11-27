package com.welearn.web;

import com.welearn.Constants.Constants;
import com.welearn.models.Series;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
public class HomePageController {

    private static int ROWS_NBR = 3;
    private static String HOME_PAGE_TITLE = "Homepage";

    @Value("${application.bootstrap.theme}")
    String appTheme;

    @Value("${spring.application.name}")
    String appName;



    @GetMapping(value={"", "/", "index.html"})
    public String homePage(Model model) {
       populateModel(model);
        return "homePage";
    }

    private List<Series> findAllSeries() {
        return Constants.exercises;
    }


    private void populateModel(Model model){
        model.addAttribute("pageTitle",HOME_PAGE_TITLE);
        model.addAttribute("series", findAllSeries());
    }

}