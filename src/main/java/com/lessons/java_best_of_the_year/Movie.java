package com.lessons.java_best_of_the_year;

public class Movie {
    private int id;
    private String title;

    private static int counter = 0;

    public Movie(String title) {
        this.id = counter++;
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return this.title;
    }
}