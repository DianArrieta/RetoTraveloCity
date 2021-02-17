package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ElementosTraveloCity;
import userinterface.TargetsPaginaInicial;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.ElementosTraveloCity.*;
import static util.constantes.ConstantesMensajes.MENSAJE_RESULTADOS_VUELOS;
import static util.constantes.ConstantesString.MENSAJE;

public class BuscarVuelo implements Task {

    private static List<String> datos;

public BuscarVuelo (List<String> datos){
    this.datos = datos;
}

    @Override
    public <T extends Actor> void performAs(T actor) {

        String origen = datos.get(0);
        String destino = datos.get(1);

        actor.attemptsTo(
                Click.on(TargetsPaginaInicial.ENLACE_VUELOS),
                Click.on(CAMPO_ORIGEN_VUELO),
                Enter.theValue(origen).into(ElementosTraveloCity.INGRESAR_CIUDAD_UNO),
                WaitUntil.the(CIUDAD, isVisible()),
                Click.on(CIUDAD),
                Click.on(CAMPO_DESTINO_VUELO),
                Enter.theValue(destino).into(ElementosTraveloCity.INGRESAR_CIUDAD_UNO),
                WaitUntil.the(CIUDAD_DESTINO_VUELO,isVisible()),
                Click.on(CIUDAD_DESTINO_VUELO),
                WaitUntil.the(BOTON_BUSCAR, isVisible()),
                Click.on(BOTON_BUSCAR),
                WaitUntil.the(RESULTADOS_VUELOS, isVisible())
        );

        actor.remember(MENSAJE, MENSAJE_RESULTADOS_VUELOS);

    }



    public static BuscarVuelo enLaPagina(List<String> datos) {
        return instrumented(BuscarVuelo.class, datos);
    }

}