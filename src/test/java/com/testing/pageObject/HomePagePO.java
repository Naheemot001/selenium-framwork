package com.testing.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePO {
    // Element Locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;






}
