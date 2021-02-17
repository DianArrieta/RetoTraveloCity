package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import util.constantes.GuardarTargets;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.ElementosTraveloCity.*;
import static util.constantes.ConstantesMensajes.CAPTCHA_MENSAJE;
import static util.constantes.ConstantesString.MENSAJE;

public class Loguearse implements Task {

    private List<String> datos;

    public Loguearse(List<String> datos){
        this.datos=datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String usuario = datos.get(0);
        String clave= datos.get(1);

        actor.attemptsTo(
                Click.on(INICIAR_SESION),
                Click.on(INICIAR_SERSION_SECUNDARIO),
                Enter.theValue(usuario).into(USUARIO),
                Enter.theValue(clave).into(CLAVE),
                Click.on(INGRESAR)
        );

        if (usuario.isEmpty()){
            GuardarTargets.setEtiqueta(MAIL_ERRONEO);
        }else
            if (clave.isEmpty()){
                GuardarTargets.setEtiqueta(CLAVE_ERRONEA);
            }else
                WaitUntil.the(CAPTCHA, isVisible());
                actor.remember(MENSAJE, CAPTCHA_MENSAJE);
    }

    public static Loguearse con(List<String> datos) {
        return instrumented(Loguearse.class,datos);
    }

}
