@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: Create an account with a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then My account page is displayed
    Examples:
      | Firstname | Lastname | Email                 | Password    | Confirmpassword |
      | Ken       | Ron      | kenron002@testing.com | Naptime123_ | Naptime123_     |


  @DuplicateAccount
  Scenario Outline: Duplicate account creation not allowed
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then An error message should be displayed stating account already exists
    Examples:
      | Firstname | Lastname | Email                 | Password    | Confirmpassword |
      | ken       | Ron      | Kenron002@testing.com | Naptime123_ | Naptime123_     |


  @AccountLogin
  Scenario Outline: Customers to use email and password to login into account
    Given I am on signin page
    When I enter "<Email>" "<Password>"
    And I click on signin
    Then My acount page is display
    Examples:
      | Email                 | Password    |
      | Kenron001@testing.com | Naptime123_ |
