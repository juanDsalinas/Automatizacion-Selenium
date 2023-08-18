Feature: Productos en el carrito
  Como usuario del e-commerce Amazon
  Quiero poder agregar 3 productos a mi carrito
  Para luego proceder al pago

  @CarritoExitoso
  Scenario: Poner 3 productos en mi carrito de manera exitosa
    Given Estoy en la pagina principal de Amazon
    When Ingreso nombre del producto en la barra de navegacion
    And realizo la busqueda
    Then deberia aparecer el primer producto de mi busqueda
    When Hago clic en el producto y lo agrego al carrito
    Then procedo al proceso de pago
