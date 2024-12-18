
Feature: Test whether user can provide checkout information successfully

  Scenario: Providing information to complete the checkout process
    Given User need to open the checkout page
    When User enter first name
    And User enter last name
    And User enter zip code
    And User click continue button
    Then User need to navigate to checkout overview page
    And User click finish button
    Then User need to navigate to checkout complete page
