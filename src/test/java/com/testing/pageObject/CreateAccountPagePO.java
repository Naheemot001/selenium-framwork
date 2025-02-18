package com.testing.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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







}
