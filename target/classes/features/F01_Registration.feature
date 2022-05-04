@smoke
Feature: Registration | New user should be able to sign up with new account
  #Test Scenario
  Scenario: User could register with valid data
    Given new user navigates to registration page
    And new user fills registration form with valid data
    When new user clicks on register button
    #Expected result
    Then a success message is displayed
    And user logs out after registering
