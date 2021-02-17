package co.com.migrupo.certification.proyectobase.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import questions.ElMensaje;
import questions.ElResultado;
import tasks.AbrirNavegador;
import tasks.BuscarHotel;
import tasks.BuscarVuelo;
import tasks.Loguearse;
import userinterface.PaginaPrincipal;
import util.constantes.GuardarTargets;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class TravelCityStepDefinitios {

    @Dado("^que el usuario abre la pagina de travelo city$")
    public void queElUsuarioAbreLaPaginaDeTraveloCity() throws Exception {
        theActorInTheSpotlight().wasAbleTo(AbrirNavegador.on(new PaginaPrincipal()));
    }


    @Cuando("^ingresa la ciudad destino$")
    public void ingresaLaCiudadDestino(List<String> datos) throws Exception {

        theActorInTheSpotlight().attemptsTo(
                BuscarHotel.enLaPagina(datos)
        );

    }

    @Cuando("^busca un vuelo ida y vuelta para$")
    public void buscaUnVueloIdaYVueltaPara(List<String> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                BuscarVuelo.enLaPagina(datos)
        );
    }

    @Cuando("^ingresa con sus datos$")
    public void ingresaConSusDatos(List<String> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                Loguearse.con(datos)
        );
    }
    @Entonces("^puede ver el mensaje$")
    public void puedeVerElMensaje(List<String> mensaje) throws Exception {
        Thread.sleep(1000);
        theActorInTheSpotlight().should(
                seeThat(ElMensaje.existe(GuardarTargets.getEtiqueta()),containsString(mensaje.get(0)))
        );
    }

    @Entonces("^valida el mensaje$")
    public void validaElMensaje(List<String> mensaje) throws Exception {
        theActorInTheSpotlight().should(
                seeThat(ElResultado.para(mensaje.get(0)),is(true))
        );
    }
}

