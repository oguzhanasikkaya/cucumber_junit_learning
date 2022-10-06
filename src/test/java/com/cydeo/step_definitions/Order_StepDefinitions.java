package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {
    WebTablePage webTablePage = new WebTablePage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();

    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        //calling our login method to log in to web table app
        webTablePage.login();

        //clicking to "order" link  to go order page
        basePage.order.click();

    }


    @When("user select product type {string}")
    public void userSelectProductType(String arg0) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(arg0);

    }

   // @And("user enters quantity {string}")
   // public void userEntersQuantity(String arg0) {
   // }
   @And("user enters quantity {int}")
   public void userEntersQuantity(int arg0) {
       // orderPage.inputQuantity.clear();
       orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);

       // orderPage.inputQuantity.sendKeys(arg0+"");
        orderPage.inputQuantity.sendKeys(String.valueOf(arg0));
   }


    @And("user enters costumer name {string}")
    public void userEntersCostumerName(String arg0) {
        orderPage.inputName.sendKeys(arg0);

    }

    @And("user enters street {string}")
    public void userEntersStreet(String arg0) {
        orderPage.inputStreet.sendKeys(arg0);
    }

    @And("user enters city {string}")
    public void userEntersCity(String arg0) {
        orderPage.inputCity.sendKeys(arg0);
    }

    @And("user enters state {string}")
    public void userEntersState(String arg0) {
        orderPage.inputState.sendKeys(arg0);
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String arg0) {
        orderPage.inputZip.sendKeys(arg0);
    }

    @And("user enters credit card type {string}")
    public void userEntersCreditCardType(String expectedCardType) {
        List<WebElement> cardTypes = orderPage.cardType;

        for (WebElement each : cardTypes) {
            if (each.getAttribute("value").equals(expectedCardType)){
                each.click();
            }
            
        }


    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String arg0) {
        orderPage.cardnoInput.sendKeys(arg0);
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {
        orderPage.cardexpInput.sendKeys(arg0);

    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
        orderPage.processOrderButton.click();
    }


    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {

        String actualName = viewAllOrdersPage.firstRowFirstCell.getText();

        Assert.assertEquals(expectedName,actualName);

    }



}
