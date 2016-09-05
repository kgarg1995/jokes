package com.example.jokes;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;


public class ValidateJokeAndroidTest extends AndroidTestCase {
    public void testValidateJoke() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        try {
            String jokeString = endpointsAsyncTask.get();
            assertNull(jokeString);
            assertEquals(jokeString, "");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
