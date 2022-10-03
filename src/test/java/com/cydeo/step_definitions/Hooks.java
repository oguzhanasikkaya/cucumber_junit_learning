package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * In this class we will be able to pass pre- & post- conditions to
 * each scenario and each step
 */

public class Hooks {
    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("===Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(){
        System.out.println("===Closing browser using cucumber @After");
        System.out.println("===Scenario ended/ Take screenshot if failed");
    }

}
