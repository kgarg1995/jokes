package com.example.jokes.backend;

/** The object model for the data we are sending through endpoints */
public class Joke {

    private String jokeString;

    public String getJokeString() {
        return jokeString;
    }

    public void setJokeString(String jokeString) {
        this.jokeString = jokeString;
    }
}