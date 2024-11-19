package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonFunctions {
//    public static WebDriver driver;

    public static WebDriver launchDriver(){
        WebDriver driver;
         String browserName = PropertiesReader.getProperty("browser");

         switch(browserName.toLowerCase()){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default: throw new IllegalArgumentException("Unsupported Browser "+ browserName);
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        return driver;
    }
}
