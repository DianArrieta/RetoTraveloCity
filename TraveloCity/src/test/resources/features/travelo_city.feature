#language: es

  Característica: validar funcionamiento pagina travelo city
    Yo como usuario deseo verificar las funcionalidades de la pagina travelo city
    para validar su correcto funcionamiento

    @login
  Esquema del escenario: Ingresar a la pagina como usuario registrado
    Dado que el usuario abre la pagina de travelo city
    Cuando ingresa con sus datos
    |<usuario>|<clave>|
      Entonces valida el mensaje
      |<mensaje>|
  Ejemplos:
  |usuario| clave|mensaje|
  |micorreo@YOPmail.com|travelocity|Select all images with|

  @BuscarHotel
  Esquema del escenario: Buscar un hotel
    Dado que el usuario abre la pagina de travelo city
    Cuando ingresa la ciudad destino
      |<destino>|
    Entonces puede ver el mensaje
      |<mensaje>|

    Ejemplos:
    |destino|mensaje|
    |Montreal|What we are paid impacts our sort order|

    @BuscarVuelosIdaVuelta
    Esquema del escenario: Buscar vuelos ida y vuelta
      Dado que el usuario abre la pagina de travelo city
      Cuando busca un vuelo ida y vuelta para
        |<origen> |<destino>|
        |origen|destino|
      Entonces valida el mensaje
        |<mensaje>|
      Ejemplos:
        |origen|destino|mensaje|
        |Medellin|Miami|Prices are roundtrip per person,|


    @UsuarioErroneo
    Esquema del escenario: Ingresar a la pagina con usuario erroneo
      Dado que el usuario abre la pagina de travelo city
      Cuando ingresa con sus datos
        |<usuario>|<clave>|
      Entonces puede ver el mensaje
        |<mensaje>|
      Ejemplos:
        |usuario| clave|mensaje|
        ||travelocity|Please enter your email address.|

    @ClaveErronea
    Esquema del escenario: Ingresar a la pagina con clave erronea
      Dado que el usuario abre la pagina de travelo city
      Cuando ingresa con sus datos
        |<usuario>|<clave>|
      Entonces puede ver el mensaje
        |<mensaje>|
      Ejemplos:
        |usuario| clave|mensaje|
        |micorreo@YOPmail.com||Please enter your password.|

