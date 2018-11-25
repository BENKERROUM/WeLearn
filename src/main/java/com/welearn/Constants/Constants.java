package com.welearn.Constants;

import com.welearn.models.Exercise;
import com.welearn.models.Level;
import com.welearn.models.Series;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Constants {

    public static List<Series> exercises;


    public static void initData(){

        Level TRONCCOMUN_Level = new Level(0,"TRONC_COMMUN");

        Exercise exercise1 = new Exercise(0," When \\(a \\ne 0\\), there are two solutions to \\(ax^2 + bx + c = 0\\) and they are\n" +
                "  $$x = {-b \\pm \\sqrt{b^2-4ac} \\over 2a}.$$" ,"1");
        Exercise exercise2 = new Exercise(1,"what's the sum of 1 and 1 ","2");

        Series series1 = new Series(0,"SUM",new ArrayList<Exercise>() {{
            add(exercise1);
            add(exercise2);
        }}, TRONCCOMUN_Level);

        Series series2 = new Series(1,"SUM",new ArrayList<Exercise>() {{
            add(exercise2);
        }}, TRONCCOMUN_Level);

        exercises = new ArrayList<>();
        exercises.add(series1);
        exercises.add(series2);

    }

}
