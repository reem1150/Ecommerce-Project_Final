@smoke
Feature: F12_OrderCheckout | Logged user could Create Successful Order
  Background:
    Given new user navigates to registration page
    And new user fills registration form with valid data
    When new user clicks on register button
    Given logged user selects his favorite product
    And logged user adds a product to the Wishlist
    And logged user adds another product to the Wishlist
    And logged user navigates to his Wishlist page
    And logged user checks all his Wishlist products
    And logged user could add his Wishlist products to Shopping Cart
  #Test scenario
  Scenario: Logged user could Create Successful Order
    When logged user agrees with terms and proceed to Checkout
    And logged user fills out Billing address to Create Order
    And logged user confirms Billing address
    And logged user selects Shipping Method to Continue
    And logged user selects Payment Method to Continue
    When logged user fills out Payment Information
    Then logged user could confirm his order
    And logged user can check order details
    And logged user could save invoice
    And logged user could print invoice


