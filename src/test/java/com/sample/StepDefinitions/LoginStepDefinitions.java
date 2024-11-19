package com.sample.StepDefinitions;

import com.sample.Hooks;
import com.sample.PageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.sample.CommonFunctions;

public class LoginStepDefinitions {

    private WebDriver driver = Hooks.driver;
    private PageObjects objects;

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
        objects = new PageObjects(driver);

        objects.getUserNameBox().sendKeys("standard_user");
        objects.getPasswordBox().sendKeys("secret_sauce");
        objects.getLoginButton().click();

    }
    @Then("User logs in to SauceDemo")
    public void user_logs_in_to_sauce_demo() throws InterruptedException {

        objects = new PageObjects(driver);
        String header = objects.getWebsiteHeader().getText();

        Assert.assertEquals(header, "Swag Labs", "User is not in homepage");

        Thread.sleep(5000);
        System.out.println("User logged into saucedemo");
    }



}
