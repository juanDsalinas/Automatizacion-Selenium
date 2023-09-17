Feature: login
  Scenario: Login Sucessfull
    Given the user is in the login page
    When  the user enter the credential
    Then the user should see a dashboard

