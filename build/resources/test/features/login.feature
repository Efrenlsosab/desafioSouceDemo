#language: es

Característica:Autenticacion de usuario en el sitio Sauce demo

  Esquema del escenario: Autenticacion fallida
    Dado un usuario en la pagina inicial de souce demo
    Cuando el usuario ingresa un "<usuario>" y "<contrasena>" incorrectos
    Entonces se visualiza un "<mensaje>" de error

    Ejemplos:
      | usuario         | contrasena   | mensaje                                                                   |
      | standard_user   | claveerronea | Epic sadface: Username and password do not match any user in this service |
      | usuariomal      | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      |                 | secret_sauce | Epic sadface: Username is required                                        |
      | standard_user   |              | Epic sadface: Password is required                                        |

  Esquema del escenario: Autenticacion exitosa
    Dado un usuario en la pagina inicial de Sauce demo
    Cuando el usuario ingresa "<usuario>" y "<contrasena>" correctos
    Entonces se puede autenticar correctamente
    Ejemplos:
      | usuario                 | contrasena   |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

    Escenario: Autenticacion por medio de base de datos
      Dado un usuario en la pagina inicial de souce demo
      Cuando ingresa usuario y contrasena por medio de la base de datos
      Entonces se autentica correctamente