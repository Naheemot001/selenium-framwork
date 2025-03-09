package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementsigninsteps {
    WebDriver driver = Hooks.driver;

    @Given("I am on signin page")
    public void iAmOnSigninPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEmail(Email);
        signInPagePO.enterPassword(Password);
    }

    @And("I click on signin")
    public void iClickOnSignin() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.clickSignInButton();
    }

    @Then("My acount page is display")
    public void myAcountPageIsDisplay() {
    }


}
