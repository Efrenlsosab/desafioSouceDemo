#language: es
Característica: proceso de compra de productos

  Escenario: Mostrar botones ADD TO CART
    Dado que un usuario se encuentre Autenticado
    Cuando un usuario ingresa a la pagina home del sitio Sauce demo
    Entonces visualizara los botones para anadir al carro de compras ADD TO CART en los productos

  Esquema del escenario: : Funcionalidad carro de compras
    Dado que un usuario se encuentre Autenticado
    Cuando un usuario ingresa a la pagina home del sitio Sauce demo
    Y da click en el boton ADD TO CART de cualquier "<producto>"
    Entonces el producto se agrega a la lista de ADD TO CART
    Ejemplos:
      | producto |
      | 1        |
      | 2        |
      | 3        |
      | 4        |
      | 5        |
      | 0        |

    Escenario: realizar el proceso de compra para un articulo
      Dado que un usuario haya agregado un producto al carro de compras
      Cuando el usuario ingresa en la pagina YOUR CART

