package com.welearn.models;

public class Exercise {

    private int id;
    private String statement;
    private String solution;

    public Exercise(int id, String statement, String solution) {
        this.id = id;
        this.statement = statement;
        this.solution = solution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
