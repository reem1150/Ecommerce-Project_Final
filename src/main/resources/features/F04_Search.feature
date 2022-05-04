@smoke
Feature: F04_Search | Logged user could search for any product on the website
  #Test Scenario
  Scenario: Logged user could search by product name
    Given user launch login page
    And user can login with valid email and valid password
    When logged user clicks on search field
    And logged user searches with name of product
    Then logged user could find relative results
