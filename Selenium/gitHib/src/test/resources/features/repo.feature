Feature:  Abrir repositorio de Github
  Como usuario logueado
  Quiero ingresar a un repositorio personal
  Y leer la descripcion del README
  @AbrirRepositorio
  Scenario: Apertura de repositorio exitoso
    Given Que me encuentro en el dashboard de mi github
    When Hago click en el repositorio de JavaOwn
    Then vDebería ser redirigido a la url del repositorio "https://github.com/juanDsalinas/Automatizacion-Selenium"
    And Debería ver la descripción del readme como "este repositorio contiene todos y cada uno delos proyectos realizados para la preparacion del SenaSoft"
