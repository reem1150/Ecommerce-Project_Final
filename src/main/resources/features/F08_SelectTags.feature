@smoke
Feature: F08_SelectTags | Logged user could select different tags
  Background:
    Given logged user could hover and open sub-Category
    And logged user can select a popular tag
  #Test Scenario
  Scenario: Logged user could select different tags

    When logged user finds products
    #Expected Result
    Then logged user could select a different tag
    And logged user finds another different products
