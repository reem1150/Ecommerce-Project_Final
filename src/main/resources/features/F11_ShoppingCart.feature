@smoke
Feature: F11_ShoppingCart | Logged user could add different products to Shopping Cart
Background:
Given logged user selects his favorite product
And logged user adds a product to the Wishlist
And logged user adds another product to the Wishlist
And logged user navigates to his Wishlist page
  #Test Scenario
  Scenario: Logged user could add different products to Shopping Cart

    And logged user checks all his Wishlist products
    #Expected Result
    Then logged user could add his Wishlist products to Shopping Cart