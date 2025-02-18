package framework.utils;

// package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("Initializing API Test Execution...");
    }

    @After
    public void teardown() {
        System.out.println("API Test Execution Completed.");
    }
}

