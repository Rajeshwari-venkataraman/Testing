#This Feature file combines all when conditions for the given scenario
@Smoketest
Feature: Validate user able to add products into wish list , find lowest price item and
  add into my cart

  Scenario Outline: Add four products into wishlist
    Given User add four products into wishlist
     When user view mywhishlist
    Then Find price of each wishlist item
   When Search lower price product in Relevance
  And Able to add in to cart
    Then Verify myCart
