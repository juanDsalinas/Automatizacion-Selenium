Feature: Login

  Scenario : Login Successfull
    Given : the user enter in the web page
    When : the user enter the credentials
      | name  | addres                 | password |
      | Juan  | juandsalinas@gmail.com | Ex@88@zz |
      | Kevin | keivn@gmail            | oeoeoeo  |
    Then : the user should see the index page

