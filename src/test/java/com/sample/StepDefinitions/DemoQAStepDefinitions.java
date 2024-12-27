package com.sample.StepDefinitions;

import com.sample.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DemoQAStepDefinitions {

    private WebDriver driver = Hooks.driver;
    public DemoQAPageObjects demoObjects;


    @Given("User launches demoQA website")
    public void user_launches_demo_qa_website() {
        driver.get("https://demoqa.com/");
        System.out.println("User is currently in: "+driver.getTitle());
        //ExtentReportsManager.getExtentTest().info("Test initalised");

    }
    @Then("User opens the practice form")
    public void user_opens_the_practice_form() {
        demoObjects = new DemoQAPageObjects(driver);
        driver.get("https://demoqa.com/forms");
        demoObjects.getFormLink().click();

    }


    @Then("User fills out the form")
    public void user_fills_out_the_form() throws InterruptedException {

        demoObjects.getFirstName().sendKeys("Parasuram");
        demoObjects.getLastName().sendKeys("Chelikam");
        demoObjects.getEmailField().sendKeys("parasuram@email.com");
        Thread.sleep(2000);
        //demoObjects.getGenderRadioButton().click();
        demoObjects.getMobileNumber().click();


    }



}
