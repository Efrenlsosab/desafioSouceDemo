#language: es
Característica: proceso de compra de productos

  Escenario: Mostrar botones ADD TO CART
    Dado que un usuario se encuentre Autenticado
    Cuando un usuario ingresa a la pagina home del sitio Sauce demo
    Entonces visualizara los botones para anadir al carro de compras ADD TO CART en los productos

  Esquema del escenario: Funcionalidad carro de compras
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

  Esquema del escenario: Ingreso de infomacion personal para la compra de un producto
    Dado que un usuario autenticado con "<usuario>" y "<password>"
    Y  haya agregado un producto al carro de compras
    Cuando el usuario ingresa en la pagina CHECKOUT: YOUR INFORMATION
    Entonces Se podra ingresar informacion personal en los respectivvos campos
    Ejemplos:
      | usuario       | password     |
      | standard_user | secret_sauce |



