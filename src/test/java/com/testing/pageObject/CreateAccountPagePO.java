package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {
    // Element Locators
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;


    @FindBy(id = "lastname")
    public static WebElement LastNameField;


    @FindBy(id = "email_address")
    public static WebElement EmailField;


    @FindBy(id = "password")
    public static WebElement PasswordField;


    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPasswordField;



    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;


    // Initialize web element using selenium webdriver
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Write java method to perform web element action
    public void enterFirstName(String Firstname){
        FirstNameField.sendKeys(Firstname);
    }

   public void enterLastName(String Lastname){
        LastNameField.sendKeys(Lastname);
   }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void enterConfirmpassword(String Confirmpassword){
        ConfirmPasswordField.sendKeys(Confirmpassword);
    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }





}
