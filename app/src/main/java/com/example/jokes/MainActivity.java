package com.example.jokes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        MainActivityFragment mainActivityFragment =
                (MainActivityFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragment);

        mainActivityFragment.tellJoke();
    }
}
