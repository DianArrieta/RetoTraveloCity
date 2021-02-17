package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static util.constantes.ConstantesString.MENSAJE;

public class ElResultado implements Question<Boolean> {


    private static String mensajeEsperado;

    public ElResultado(String mensajeEsperado){
        this.mensajeEsperado= mensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String mensaje = theActorInTheSpotlight().recall(MENSAJE);
        return mensaje.contains(mensajeEsperado);
    }

    public static ElResultado para(String mensajeEsperado) {
        return new ElResultado(mensajeEsperado);
    }

}
