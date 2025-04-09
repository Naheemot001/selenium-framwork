package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPagePO {
    // Element Locators
    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(id = "send2")
    public static WebElement SignInButton;

    // initialize web element using selenium webdriver
    public AccountLoginPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Write java method to perform web element action
    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickSignInButton(){
        SignInButton.click();
    }








}
