package com.welearn.web;

import com.welearn.Constants.Constants;
import com.welearn.models.Series;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class DetailPageController {


    private static String DETAIL_PAGE_TITLE = "Detail page";

    @GetMapping("/detail/{id}")
    public String homePage(Model model,@PathVariable("id") int id) {

        Series series = findSeriesWithID(id);
        model.addAttribute("pageTitle", DETAIL_PAGE_TITLE);
        model.addAttribute("series", series);
        return "detailPage";
    }

    private Series findSeriesWithID(int id){
        return Constants.exercises.stream().filter(series1 -> series1.getId() == id ).findAny().get();
    }

}
