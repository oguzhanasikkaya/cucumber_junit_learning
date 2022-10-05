package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {


    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(Map<String,String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.entrySet());

    }

    //--------------------------------------------------------------------


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {



    }


}
