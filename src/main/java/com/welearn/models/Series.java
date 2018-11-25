package com.welearn.models;

import java.util.List;

public class Series {

    private int id;
    private String title;
    private List<Exercise> exercises;
    private Level level;


    public Series(int id, String title, List<Exercise> exercises, Level level) {
        this.id = id;
        this.title = title;
        this.exercises = exercises;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
