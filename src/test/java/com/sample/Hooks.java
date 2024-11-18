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
//        driver = CommonFunctions.launchDriver("chrome");
        driver = CommonFunctions.launchDriver("chrome");
        driver.get("https://google.com");
        System.out.println("Launched the URL");
    }

    @After
    public static void tearDown()
    {
        if(driver!=null) {
            driver.quit();
            System.out.println("Browser quit!!");
        }
    }
}
