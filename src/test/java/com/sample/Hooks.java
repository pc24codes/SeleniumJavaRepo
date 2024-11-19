package com.sample;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import com.sample.CommonFunctions;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp()
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
