#language:es

Característica: Logueo

  Escenario: Logueo exitoso
    Dado que el usuario esta en la pagina web
    Cuando el usuario ingresa las credenciales
    Entonces el usuario estara logueado


  Escenario: Campos vacios
    Dado que el usuario esta en la pagina web
    Cuando el usuario no ingresa las dos credenciales
    Entonces el usuario no estara logueado


