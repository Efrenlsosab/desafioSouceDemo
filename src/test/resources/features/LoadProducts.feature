#language: es
Característica: Cargue de productos de la pagina Souce demo

  Esquema del escenario:el usuario visualiza los nombres de los productos
    Dado que un usuario se encuentre Autenticado con el "<usuario>" y "<password>"
    Cuando el usuario ingrese a la pagina Home de Souce demo
    Entonces se visualizan los nombres de los articulos

    Ejemplos:
      | usuario       | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |