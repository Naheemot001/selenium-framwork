package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String Confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(Firstname);
        createAccountPagePO.enterLastName(Lastname);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmpassword(Confirmpassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();

    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }


    @Then("An error message should be displayed stating account already exists")
    public void anErrorMessageShouldBeDisplayedStatingAccountAlreadyExists() {
    }

    @Given("I am on signin page")
    public void iAmOnSigninPage() {
    }

    @When("I enter {string} {string}")
    public void iEnter(String arg0, String arg1) {
    }

    @And("I click on signin")
    public void iClickOnSignin() {
    }

    @Then("My account page is displayed display")
    public void myAccountPageIsDisplayedDisplay() {
    }

    @Then("Error message should display")
    public void errorMessageShouldDisplay() {
    }




}
