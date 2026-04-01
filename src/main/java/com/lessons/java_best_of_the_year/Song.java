package com.lessons.java_best_of_the_year;

public class Song {
    private int id;
    private String title;

    private static int counter = 0;

    public Song(String title) {
        this.id = ++counter;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
