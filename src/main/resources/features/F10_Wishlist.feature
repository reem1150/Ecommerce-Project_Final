@smoke
Feature: F10_Wishlist | Logged user could add different products to Wishlist
  #Test Scenario
  Scenario: Logged user could add different products to Wishlist
    Given logged user selects his favorite product
    When logged user adds a product to the Wishlist
    And logged user adds another product to the Wishlist
    #Expected Result
    Then logged user navigates to his Wishlist page