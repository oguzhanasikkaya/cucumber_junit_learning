package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the login page of web table app")
    public void userIsOnTheLoginPageOfWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters username {string}")
    public void userEnters(String string) {
        webTablePage.usernameBox.sendKeys(string);
    }

    @And("user enter password {string}")
    public void userEnter(String string) {
        webTablePage.passwordBox.sendKeys(string);
    }

    @And("user click to login button")
    public void userClickToLoginButton() {
        webTablePage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void userShouldSeeUrlContainsOrders() {
        BrowserUtils.verifyUrlContains("orders");

    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTablePage.login(username,password);

    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map< String, String> credentials) {

      //webTablePage.loginButton.sendKeys(credentials.get("username"));
      //webTablePage.passwordBox.sendKeys(credentials.get("password"));
     // webTablePage.loginButton.click();

        webTablePage.login(credentials.get("username"), credentials.get("password"));


    }
}





