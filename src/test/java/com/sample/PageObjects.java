package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjects {

    private final WebDriver driver;
    private final WebDriverWait wait;

    //LoginPage Objects

    public static String userNameBox = "//input[@id='user-name']";
    public static String passwordBox = "//input[@id='password']";
    public static String loginButton = "//input[@id='login-button']";
    public static String webSiteHeader = "//*[@class='app_logo']";


    //constructor
    public PageObjects(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }


    //Return methods for the locators
    public WebElement getUserNameBox() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(userNameBox)));
    }

    public WebElement getPasswordBox() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(passwordBox)));
    }

    public WebElement getLoginButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loginButton)));
    }

    public WebElement getWebsiteHeader() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webSiteHeader)));
    }






}
