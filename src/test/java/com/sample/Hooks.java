package com.sample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import com.sample.CommonFunctions;

public class Hooks {
    public static WebDriver driver;
    private  ExtentReports extent;
    public ExtentTest test;


    @Before
    public static void setUp(Scenario scenario)
    {
        System.out.println("Initializing browser...");
        driver = CommonFunctions.launchDriver();
        //driver = CommonFunctions.g
        driver.get("https://www.saucedemo.com/");
        System.out.println("Launched the URL");
        System.out.println("Driver initialized: " + (driver != null));

    }

    @After
    public static void tearDown()
    {
        if(driver!=null) {
            System.out.println("Closing the browser...");
            driver.quit();
            System.out.println("Browser quit!!");
        }
    }
}
