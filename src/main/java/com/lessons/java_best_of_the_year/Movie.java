package com.lessons.java_best_of_the_year;

public class Movie {
    private int id;
    private String title;

    private static int counter = 0;

    public Movie(String title) {
        this.id = ++counter;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}