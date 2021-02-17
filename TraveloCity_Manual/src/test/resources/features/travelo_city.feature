#language: es

  Característica: validar funcionamiento pagina travelo city
    Yo como usuario deseo verificar las funcionalidades de la vapiga travelo city

    @manual
    Escenario: Buscar vuelos solo ida
      Cuando ingreso la ciudad origen y la fecha
      Entonces puedo ver la tarifa del vuelo disponible

    @manual
    Escenario: Buscar vuelos multidestino
      Cuando ingreso los datos del primer y segundo vuelo
      Entonces puedo ver la tarifa del cada vuelo disponible

    @manual
    Escenario: Crear cuenta
      Cuando diligencio en formalio de registro
      Entonces puedo ver que el registro fue exitoso

    @manual
    Escenario: Buscar actividades
      Cuando ingreso la ciudad que quiero visitar y las fechas
      Entonces puedo las actividades que se peuden realizar

    @manual
    Escenario: Buscar cruceros
      Cuando ingreso el destino y las fechas del viaje
      Entonces puedo ver los cruceros disponibles

    @manual
    Escenario: Botón de ayuda
      Cuando ingreso a la zona de ayuda
      Cuando elijo un tema para consultar
      Entonces puedo ver la respuesta en pantalla

    @manual
    Escenario: Itinerarios
      Cuando ingreso a revisar mis itinerarios
      Cuando elijo un tema para consultar
      Entonces puedo ver los itinerarios que tengo guardados

    @manual
    Escenario: Revisar idiomas
      Cuando elijo el idioma de la pagina
      Entonces puedo ver la pagina en el idioma seleccionado

    @manual
    Escenario: Viajes para mi
      Cuando ingreso a la seccion revisar viajes
      Entonces puedo ver las recomendaciones de viaje personalizadas

    @manual
    Escenario: Cierre de sesion
      Dado que estoy logueada en la pagina de travelocity
      Cuando cierro sesion
      Entonces puedo ver que la sesión se cerro correctamente

    @manual
    Escenario: Mas viajes
      Cuando ingreso a la seccion mas viajes
      Entonces puedo ver las subcategorias disponibles

    @manual
    Escenario: Acerca de traveloCity
      Cuando ingreso a la seccion acerca de travelocity
      Entonces puedo ver la descripcion de la pagina

    @manual
    Escenario: preguntas frecuentes
      Cuando ingreso a la seccion preguntas frecuentes
      Entonces puedo ver los articulos mas leidos

    @manual
    Escenario: Politica de privacidad
      Cuando ingreso a la seccion policitca de privacidad
      Entonces puedo ver el manifiesto de las politicas

    @manual
    Escenario: Que te ayudamos a buscar
      Cuando voy hasta la seccion que te ayudamos a buscar
      Entonces puedo ver que se muestran todas las opciones de busqueda