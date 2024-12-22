package com.sample.StepDefinitions;

import com.sample.Hooks;
import com.sample.JSONReader;
import com.sample.PageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.sample.CommonFunctions;

import java.util.List;

public class LoginStepDefinitions {

    private WebDriver driver = Hooks.driver;
    public PageObjects objects;

    @When("User launches google")
    public void user_launches_google() throws InterruptedException {
        objects = new PageObjects(driver);
        Thread.sleep(2000);
        System.out.println("User launched the website");
    }
    @Then("User searches")
    public void user_searches() throws InterruptedException {
    //Empty commit

    WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
    searchBox.sendKeys("Selenium"+ Keys.ENTER);
    Thread.sleep(2000);

    }


    @When("User launches SauceDemo")
    public void user_launches_sauce_demo() {
        System.out.println("Website launched");
        objects = new PageObjects(driver);
//    driver.get("https://www.saucedemo.com/");

    }
    @Then("User enters the credentials")
    public void user_enters_the_credentials() throws InterruptedException {
//        objects = new PageObjects(driver);

        objects.getUserNameBox().sendKeys("standard_user");
        objects.getPasswordBox().sendKeys("secret_sauce");
        objects.getLoginButton().click();

    }
    @Then("User logs in to SauceDemo")
    public void user_logs_in_to_sauce_demo() throws InterruptedException {

//        objects = new PageObjects(driver);
        String header = objects.getWebsiteHeader().getText();

        Assert.assertEquals(header, "Swag Labs", "User is not in homepage");

        Thread.sleep(5000);
        System.out.println("User logged into saucedemo");
    }

    @Then("User enters the credentials for locked out user")
    public void user_enters_the_credentials_for_locked_out_user() {

        String userName = JSONReader.getValue("Locked Out User","username");
        String password = JSONReader.getValue("Locked Out User","password");

        objects.getUserNameBox().sendKeys(userName);
        objects.getPasswordBox().sendKeys(password);
        objects.getLoginButton().click();

    }
    @Then("User is unable to login as locked out user")
    public void user_is_unable_to_login_as_locked_out_user() {
        String errorMessage = objects.getErrorMessage().getText();
        Assert.assertEquals(errorMessage, "Epic sadface: Sorry, this user has been locked out.", "The error displayed is incorrect!");

    }

    @Then("User adds all the products in cart")
    public void user_adds_all_the_products_in_cart() {

        objects.getBoltTshirtButton().click();
        objects.getSauceLabsOnesie().click();
        objects.getSauceLabsBackpack().click();
        String CartValue = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']")).getText();
        System.out.println("Cart value: "+CartValue);

    }
    @Then("User verifies in the cart")
    public void user_verifies_in_the_cart() {

        objects.getCartButton().click();
        String YourCartText = driver.findElement(By.xpath("//*[@class='title']")).getText();

        Assert.assertEquals(YourCartText, "Your Cart", "User not redirected to Your cart");
        System.out.println("User is in Your cart section!");


    }

    @Then("user removes the items from cart")
    public void user_removes_the_items_from_cart() {

        objects.getRemoveBackPack().click();
        objects.getRemoveOnesie().click();
        objects.getRemoveTshirt().click();

    }

    @Then("User enters the details in checkout")
    public void user_enters_the_details_in_checkout() {

        String firstName = JSONReader.getValue("User adds products","FirstName");
        String lastName = JSONReader.getValue("User adds products","LastName");
        String pinCode = JSONReader.getValue("User adds products","Pincode");

        objects.getCheckOutButton().click();

        objects.getFirstName().sendKeys(firstName);
        objects.getLastname().sendKeys(lastName);
        objects.getPinCode().sendKeys(pinCode);

        objects.getContinueButton().click();

    }
    @Then("User verifies the pricing and itemlist")
    public void user_verifies_the_pricing_and_itemlist() {

        String OrderDeets = driver.findElement(By.xpath("//div[@class='summary_info']")).getText();
        System.out.println(OrderDeets);

        objects.getFinishButton().click();




    }
    @Then("User order is confirmed")
    public void user_order_is_confirmed() throws InterruptedException {
        Thread.sleep(2000);
        if(objects.getConfirmationText().isDisplayed()) {
            System.out.println("Order is confirmed!!!");
        }
    }

    @Then("User sorts with AtoZ")
    public void user_sorts_with_ato_z() {

//        WebElement dropDown = driver.findElement(By.xpath("//select[@data-test='product-sort-container']"));
//        Select sortDrop = new Select(dropDown);
//
//        dropDown.click();
//        WebElement option = driver.findElement(By.xpath("//option[text()='Price (low to high)']"));
//        option.click();
//        List<WebElement> options = sortDrop.getOptions();
//        for(WebElement option : options ) {
//            System.out.println(option.getText());
//        }


    }
    @Then("User sorts with ZtoA")
    public void user_sorts_with_zto_a() {

    }
    @Then("User sorts with low to high")
    public void user_sorts_with_low_to_high() {

    }
    @Then("User sorts with high to low")
    public void user_sorts_with_high_to_low() {

    }
}
