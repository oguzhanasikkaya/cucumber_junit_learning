package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();



    @When("user types {string} and click enter")
    public void user_types_and_click_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+ Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected",expectedTitle,actualTitle);
    }

    @When("user is ong Google search page")
    public void user_is_ong_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
       // throw new io.cucumber.java.PendingException();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        //Assert.assertEquals("Title is not as expected",expectedTitle,actualTitle);
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }


   /* @When("user types apple and click enter")
    public void userTypesAppleAndClickEnter() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }*/

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected",expectedTitle,actualTitle);
    }



}
