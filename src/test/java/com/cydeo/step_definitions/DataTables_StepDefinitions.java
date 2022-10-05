package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {


    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(Map<String,String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.entrySet());

    }


}
