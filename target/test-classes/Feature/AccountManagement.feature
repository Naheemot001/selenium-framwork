@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: Create an account with a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then My account page is displayed
    Examples:
      | Firstname | Lastname | Email              | Password    | Confirmpassword |
      | Ken       | Ron      | kenron002@testing.com | Naptime123_ | Naptime123_     |