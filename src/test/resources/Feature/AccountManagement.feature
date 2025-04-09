@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: Create an account with a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed
    Examples:
      | Firstname | Lastname | Email                 | Password    | ConfirmPassword |
      | Ken       | Ron      | kenron002@testing.com | Naptime123_ | Naptime123_     |


  @DuplicateAccount
  Scenario Outline: Duplicate account creation not allowed
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then An error message should be displayed stating account already exists
    Examples:
      | Firstname | Lastname | Email                 | Password    | ConfirmPassword |
      | ken       | Ron      | Kenron002@testing.com | Naptime123_ | Naptime123_     |


  @AccountLogin
  Scenario Outline: Customers to use email and password to login into account
    Given I am on signIn page
    When I enter "<Email>" "<Password>"
    And I click on signIn
    Then My account page is displayed display
    Examples:
      | Email                 | Password    |
      | Kenron001@testing.com | Naptime123_ |


  @UnregisteredCustomer
  Scenario Outline: Unregistered customer cannot login
    Given I am on signIn page
    When I enter "<Email>" "<Password>"
    And I click on signIn
    Then Error message should display
    Examples:
      | Email                   | Password     |
      | Samsmith123@testing.com | Moonnight333_ |
