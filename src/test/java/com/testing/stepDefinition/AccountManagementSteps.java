package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.AccountLoginPagePO;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(Firstname);
        createAccountPagePO.enterLastName(Lastname);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmpassword(ConfirmPassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();

    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
        String ExpectedTitle = "My Account";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }


    @Then("An error message should be displayed stating account already exists")
    public void anErrorMessageShouldBeDisplayedStatingAccountAlreadyExists() {
        String ExpectedTitle = "Create New Customer Account";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @Given("I am on signIn page")
    public void iAmOnSignInPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.enterEmail(Email);
        accountLoginPagePO.enterPassword(Password);
    }

    @And("I click on signIn")
    public void iClickOnSignIn() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickSignInButton();

    }

    @Then("My account page is displayed display")
    public void myAccountPageIsDisplayedDisplay() {
        String ExpectedResult = "My Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Then("Error message should display")
    public void errorMessageShouldDisplay() {
        String ExpectedResult = "Customer Login";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }




}
