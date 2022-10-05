package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_StepDefinitions {
    WebTablePage webTablePage = new WebTablePage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        webTablePage.login();
    }


    @When("user select product type {string}")
    public void userSelectProductType(String arg0) {

    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String arg0) {

    }

    @And("user enters costumer name {string}")
    public void userEntersCostumerName(String arg0) {

    }

    @And("user enters street {string}")
    public void userEntersStreet(String arg0) {

    }

    @And("user enters city {string}")
    public void userEntersCity(String arg0) {

    }

    @And("user enters state {string}")
    public void userEntersState(String arg0) {

    }

    @And("user enters credit card type {string}")
    public void userEntersCreditCardType(String arg0) {

    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {

    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {

    }


    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String arg0) {
    }
}
