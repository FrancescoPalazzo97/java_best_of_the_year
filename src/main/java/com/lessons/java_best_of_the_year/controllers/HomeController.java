package com.lessons.java_best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lessons.java_best_of_the_year.Movie;
import com.lessons.java_best_of_the_year.Song;

@Controller
public class HomeController {

    private List<Movie> getBestMovies() {
        return List.of(new Movie("Il signore degli anelli"), new Movie("Batman"), new Movie("Dune"));
    }

    private List<Song> getBestSongs() {
        return List.of(new Song("Aerials"), new Song("Bleed it Out"), new Song("Broken"));
    }

    @GetMapping("/")
    public String welcome(Model model) {
        String name = "Francesco";

        model.addAttribute("name", name);

        return "index";
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "moviesPage";
    }

    @GetMapping("/songs")
    public String getSongs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songsPage";
    }

}
