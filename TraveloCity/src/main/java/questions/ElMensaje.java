package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ElMensaje implements Question<String> {

    private Target mensaje;

    public ElMensaje(Target mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(mensaje).viewedBy(actor).asString();
    }

    public static ElMensaje existe(Target mensaje) {
        return new ElMensaje(mensaje);
    }

}