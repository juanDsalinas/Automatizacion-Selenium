Feature: Inicio de sesión en Github
  Como usuario de la plataforma Github
  Quiero iniciar sesión en mi cuenta
  Para acceder al dashboard y gestionar mis repositorios

  @LogueoExitoso
  Scenario: Inicio de sesión exitoso
    Given Que estoy en la página de inicio de sesión de Github
    When Ingreso mi dirección de correo electrónico "juandsalinasnacun@gmail.com" y mi contraseña "Em@ji2018"
    And Presiono el botón de inicio de sesión
    Then Debería ser redirigido al dashboard de mi cuenta el cual es "https://github.com/"
    #And Debe ría ver opciones para gestionar mis repositorios y proyectos