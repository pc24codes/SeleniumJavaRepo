package com.sample.StepDefinitions;

import com.sample.Hooks;
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

    public WebDriver driver;
    CommonFunctions objCommon;

    @When("User launches google")
    public void user_launches_google() throws InterruptedException {
        driver = CommonFunctions.launchDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(2000);
    }
    @Then("User searches")
    public void user_searches() throws InterruptedException {
    //Empty commit
    WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
    searchBox.sendKeys("Selenium"+ Keys.ENTER);
    Thread.sleep(2000);
    driver.quit();

    }



}
