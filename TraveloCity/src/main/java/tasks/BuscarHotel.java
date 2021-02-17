package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ElementosTraveloCity;
import util.constantes.GuardarTargets;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.ElementosTraveloCity.*;

public class BuscarHotel implements Task {

private  List<String> datos;

public BuscarHotel(List<String> datos){
    this.datos= datos;
}

    @Override
    public <T extends Actor> void performAs(T actor) {

        String destino = datos.get(0);
        actor.attemptsTo(
                Click.on(ElementosTraveloCity.CAMPO_ORIGEN_HOTELES),
                Enter.theValue(destino).into(ElementosTraveloCity.INGRESAR_CIUDAD_UNO),
                WaitUntil.the(CIUDAD, isVisible()),
                Click.on(CIUDAD),
                WaitUntil.the(BOTON_BUSCAR, isVisible()),
                Click.on(BOTON_BUSCAR)
        );

        GuardarTargets.setEtiqueta(RESULTADOS_HOTELES);

  }

    public static BuscarHotel enLaPagina(List<String> datos) {
        return instrumented(BuscarHotel.class, datos);
    }


}
