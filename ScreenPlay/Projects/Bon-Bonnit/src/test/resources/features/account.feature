Feature: Account
  Scenario: change address Sucesfull
    Given the user is in the login page
    When  the user enter the credentials
    And the user clicks on the addres option
    And the user change their addres and save the changes
    Then the user should see their addres
