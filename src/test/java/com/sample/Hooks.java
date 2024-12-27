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
//        ExtentReportsManager.getExtentReport();
//
//        // Create a new ExtentTest instance for the current scenario
//        ExtentTest extentTest = ExtentReportsManager.getExtentReport().createTest(scenario.getName());
//
//        // Set the current ExtentTest to the thread-local
//        ExtentReportsManager.getExtentTest();


        System.out.println("Initializing browser...");
        driver = CommonFunctions.launchDriver();
        //driver = CommonFunctions.g
        driver.get("https://www.saucedemo.com/");
        System.out.println("Launched the URL");
        System.out.println("Driver initialized: " + (driver != null));

    }

    @After
    public static void tearDown(Scenario scenario)
    {
        if(driver!=null) {
            System.out.println("Closing the browser...");
            driver.quit();
            System.out.println("Browser quit!!");
        }

//        if (scenario.isFailed()) {
//            ExtentReportsManager.takeScreenshot(driver, scenario);
//        } else {
//            ExtentReportsManager.getExtentTest().pass("Scenario passed");
//        }
//
//        // Clean up the ExtentTest thread local
//        ExtentReportsManager.removeExtentTest();
    }
}
