Feature: Module of cart
  Scenario: Add product to the shopping cart Successfull
    Given : the user is on the index page
    When : the user clicks on "Monitors" option
    And : the user clicks on the first product result
    And : the user add the product to the shopping cart
    Then the user should be presented with a modal view confirming the action
