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
    public static String loginError = "//*[@data-test='error']";

    //Products pageObjects
    public static String boltTshirtButton = "//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']";
    public static String sauceLabsBackPackButton = "//button[@id='add-to-cart-sauce-labs-backpack']";
    public static String sauceLabsOnesie = "//button[@id='add-to-cart-sauce-labs-onesie']";
    public static String removeSauceLabsBackpack = "//button[@id='remove-sauce-labs-backpack']";
    public static String removeSauceLabsTshirt = "//button[@id='remove-sauce-labs-bolt-t-shirt']";
    public static String removeSauceLabsOnesie = "//button[@id='remove-sauce-labs-onesie']";
    public static String cartbutton = "//*[@class='shopping_cart_link']";
    public static String checkOutButton = "//*[@id='checkout']";
    public static String firstNameinCheckOut = "//input[@id='first-name']";
    public static String lastNameinCheckOut = "//input[@id='last-name']";
    public static String postalCodeCheckOut = "//input[@id='postal-code']";
    public static String continueButtonXpath = "//input[@id='continue']";
    public static String confirmationMessage = "//h2['Thank you for your order!']";
    public static String finishButton = "//button[@id='finish']";
    public static String sortDropdown = "//select[@class='select_container']";



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

    public WebElement getErrorMessage() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loginError)));
    }

    public WebElement getBoltTshirtButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(boltTshirtButton)));
    }

    public WebElement getSauceLabsOnesie() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sauceLabsOnesie)));
    }

    public WebElement getSauceLabsBackpack() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sauceLabsBackPackButton)));
    }

    public WebElement getRemoveBackPack() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(removeSauceLabsBackpack)));
    }

    public WebElement getRemoveOnesie() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(removeSauceLabsOnesie)));
    }

    public WebElement getRemoveTshirt() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(removeSauceLabsTshirt)));
    }

    public WebElement getCartButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(cartbutton)));
    }

    public WebElement getCheckOutButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(checkOutButton)));
    }

    public WebElement getFirstName() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstNameinCheckOut)));
    }

    public WebElement getLastname() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lastNameinCheckOut)));
    }

    public WebElement getPinCode() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(postalCodeCheckOut)));
    }

    public WebElement getContinueButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(continueButtonXpath)));
    }

    public WebElement getConfirmationText() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmationMessage)));
    }

    public WebElement getFinishButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(finishButton)));
    }

    public WebElement getSortDropDown() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sortDropdown)));
    }


}
