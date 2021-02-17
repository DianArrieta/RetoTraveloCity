package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ElementosTraveloCity extends PageObject {

    public static final Target CAMPO_ORIGEN_HOTELES = Target.the(" ciudad destido para hoteles").located(By.xpath("//button[@aria-label='Going to']"));

    public static final Target INGRESAR_CIUDAD_UNO = Target.the("Escribir primera ciudad ").located(By.xpath("//*[starts-with(@class,'uitk-field-input uitk-typeahead-input  ')]"));

    public static final Target CIUDAD = Target.the("seleccionar ciudad").located(By.xpath("//ul[starts-with(@class, 'uitk-typeahead-results')]/li"));

    public static final Target BOTON_BUSCAR = Target.the("Botón para buscar un hotel").located(By.xpath("//button[text() = 'Search']"));

    public static final Target RESULTADOS_HOTELES = Target.the("Resultados de busqueda de hoteles").located(By.xpath("//a[@href='https://www.travelocity.com/service/#/article/19958']"));

    public static final Target CAMPO_ORIGEN_VUELO = Target.the("Ciudad origen vuelos").located(By.xpath("//button[@aria-label='Leaving from']"));

    public static final Target CAMPO_DESTINO_VUELO = Target.the("Ciudad destino vuelos").located(By.xpath("//div[@title='Going to']"));

    public static final Target CIUDAD_DESTINO_VUELO = Target.the("Seleccionar ciudad").located(By.xpath("//ul[starts-with(@class, 'uitk-typeahead-results') and @data-stid='location-field-leg1-destination-results']/li"));

    public static final Target RESULTADOS_VUELOS= Target.the("Resultados de vuelos").located(By.id("flightModuleList"));

    public static final Target INICIAR_SESION = Target.the("Botón para ingresar con usuario registrado").located(By.cssSelector("#gc-custom-header-nav-bar-acct-menu > button > div"));

    public static final Target INICIAR_SERSION_SECUNDARIO = Target.the("Botón secundario para ingresar con usuario registrado").located(By.cssSelector("#gc-custom-header-nav-bar-acct-menu > div > div.header-guest-heading > div > div > a.uitk-button.uitk-button-small.uitk-button-fullWidth.uitk-button-has-text.uitk-button-primary"));

    public static final Target USUARIO = Target.the("Area para ingresar usuario").located(By.id("signin-loginid"));

    public static final Target CLAVE = Target.the("Area para ingresar clase").located(By.id("signin-password"));

    public static final Target INGRESAR = Target.the("Botón para enviar datos de logueo").located(By.id("submitButton"));

    public static final Target CAPTCHA = Target.the("Cuadro de captcha").located(By.xpath("//iframe[starts-with(@src,'https://www.google.com/recaptcha/api2/bframe?hl')]"));

    public static final Target CLAVE_ERRONEA = Target.the("Mensaje clave erronea").located(By.id("userPasswordError"));

    public static final Target MAIL_ERRONEO = Target.the("Mensaje email erroneo").located(By.id("userEmailidError"));
}
