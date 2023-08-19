Feature: Agregar y eleminar elementos
  yo como usuario
  quiero poder agregar y eleminar elementos

  Scenario: agregar exitoso
    Given Ingresar a la pagina
    When doy click en el segundo enlace
    And doy click en agregar elemento
    Then Aparecer un nuevo elemento
