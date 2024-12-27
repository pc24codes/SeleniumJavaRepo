package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQAPageObjects {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public DemoQAPageObjects (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public String formButton = "//h5[contains(text(),'Forms')]";
    public String practiceForm = "//span[contains(text(),'Practice Form')]";
    public String firstName = "//*[@id='firstName']";
    public String lastName = "//*[@id='lastName']";
    public String emailField = "//*[@id='userEmail']";
    public String genderRadioButton = "//input[@id='gender-radio-2']";
    public String mobileNumber = "//input[@id='userNumber']";


    //getMethods

    public WebElement getFormButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(formButton)));
    }

    public WebElement getFormLink() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(practiceForm)));
    }

    public WebElement getFirstName() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstName)));
    }

    public WebElement getLastName() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lastName)));
    }

    public WebElement getEmailField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(emailField)));
    }

    public WebElement getGenderRadioButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(genderRadioButton)));
    }

    public WebElement getMobileNumber() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(mobileNumber)));
    }




}
