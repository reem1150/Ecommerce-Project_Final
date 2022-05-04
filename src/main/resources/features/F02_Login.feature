@smoke
Feature: F02_Login | User could use login functionality to open his account
  #Test Scenario
  Scenario: User could log in with valid email and password
    Given user launch login page
    When user can login with valid email and valid password
    #Expected Result vs Actual Result
    Then user could login successfully
    And logged user logs out
