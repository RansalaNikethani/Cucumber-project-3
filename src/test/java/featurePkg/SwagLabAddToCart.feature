
Feature:  Test whether user can add items to the cart successfully

  
  Scenario: Adding items to the cart to checkout
    Given User need to open the product page
    When User click sauce labs bolt tshirt add to cart
    And User click tshirt red add to cart
    Then two items should be visible in the cart icon
    When click the cart icon should navigate to cart page 
    And click the checkout button
    Then User need to navigate to the checkout page