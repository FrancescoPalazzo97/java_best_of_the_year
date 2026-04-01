package com.lessons.java_best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lessons.java_best_of_the_year.Movie;
import com.lessons.java_best_of_the_year.Song;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String welcome(Model model) {
        String name = "Francesco";

        model.addAttribute("name", name);

        return "index";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movieList = new ArrayList<Movie>();

        Movie movie1 = new Movie("Il signore degli anelli");
        Movie movie2 = new Movie("Batman");
        Movie movie3 = new Movie("Dune");

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        return movieList;
    }

    private List<Song> getBestSongs() {
        List<Song> songList = new ArrayList<>();

        Song song1 = new Song("Aerials");
        Song song2 = new Song("Bleed it Out");
        Song song3 = new Song("Broken");

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);

        return songList;
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
