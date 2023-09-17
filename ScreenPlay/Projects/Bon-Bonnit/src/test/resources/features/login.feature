Feature: Login

  Scenario: Login Sucessfull
    Given the user is in the login page
    When  the user enter the credentials
    Then  the user should see a dashboard


  Scenario: Login Failed
    Given the user is in the login page
    When  the user enter the failed credentials
    When the user should see a message error
