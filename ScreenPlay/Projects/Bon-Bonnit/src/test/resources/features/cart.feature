Feature: Cart
  Scenario: show details of shopping cart
    Given the user is in the index page
    When the user is in the login page
    And  the user enter the credential
    And the user clicks on shopping cart
    Then the user should see a list of favorite products