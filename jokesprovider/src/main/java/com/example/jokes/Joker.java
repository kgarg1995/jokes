package com.example.jokes;

import java.util.Random;

public class Joker {

    private static final String[] JOKES = {
            "This is totally a funny joke"
            };

    public static String getJoke() {
        return JOKES[new Random().nextInt(JOKES.length)];
    }
}
