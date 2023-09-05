Feature: Login
  i as a user service
  i need to login

  Scenario: Login Exitoso
    Given he user enter to web page
    When he user enter the credentials
      | cedula     | <cedula>     |
      | correo     | <correo>     |
      | contrasena | <contrasena> |
    Then he user his log sucessfull

    Examples:
      | cedula     | correo                         | contrasena |
      | 1021396363 | juadsalinas111@soy.sena.edu.co | 1234       |
      | 1029384756 | juandsalinas2018@gmail.com     | 4321       |
      | 098761284  | juandsalinasnacun@gmail.com    | 1126       |

