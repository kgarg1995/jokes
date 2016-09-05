package com.example.jokes.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Joke extends AppCompatActivity {

    public static final String KEY_EXTRA_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        ((TextView) findViewById(R.id.joke))
                .setText(getIntent().getStringExtra(KEY_EXTRA_JOKE));
    }
}
