package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.stream.Collectors;


public class TargetsPaginaDeBusqueda extends PageObject {

    public static final Target SOLO_IDA = Target.the("Opcion de solo ida en el vuelo")
            .located(By.linkText("Solo ida"));


    public static final Target DESDE = Target.the("Selecciona el origen del vuelo").located(By.xpath("//*[starts-with(@id,'pbOrigen_2_')]"));

    public static final Target RECIENTES_DESDE  = Target.the("ciudad origen del vuelo").located(By.cssSelector(".v-middle"));

    public static final Target HACIA = Target.the("Selecciona el destino del vuelo").located(By.xpath( "//*[starts-with(@id,'#pbDestino_2_')]"));

   // public static final Target EXPLORA_DESTINOS_HACIA  = Target.the("ciudad origen del vuelo").located(By.cssSelector("#exp_2417 .v-middle"));

    public static final Target RECIENTES_HACIA  = Target.the("ciudad origen del vuelo").located(By.cssSelector(".v-middle"));

   // public static //final Target MEDELLIN = Target.the("Elige la Medellín en la lista").located(By.cssSelector("css=.airport-item-explorer:nth-child(13) > .name"));


    public static final Target FECHA_IDA = Target.the("Selecciona la fecha de ida del vuelo").located(By.cssSelector("#pbFechaIda_2_1636648479"));

    public static final Target DIA_ACTUAL = Target.the("Selecciona la fecha de ida del vuelo").located(By.cssSelector("#pbFechaIda_2_1636648479"));

    public static final Target PASAJEROS = Target.the("Numero de pasajeros").located(By.cssSelector("#pbPasajeros_1_1636648479"));

    public static final Target ADULTOS = Target.the("Agrega adultos al vuelo").located(By.cssSelector(".float > .adults .plus > .material-icons"));

    public static final Target CONTINUAR_PASAJEROS = Target.the( "Botón continuar seleccionar numero de pasajeros").located(By.cssSelector(".float > .btn"));



    public static final Target PAIS = Target.the( "Selecciona Pais").located(By.xpath("//div[@class ='scroll' and @role ='list']/div[@tabindex='-1' and  @data-id='Colombia']"));



    public List<String> getJobTabs() {
        return findAll("//div[@id='tabs']//a").stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }







    public static final Target NIÑOS = Target.the("Agrega niños al vuelo").located(By.xpath("//div[@class='controls noadults' and @aria-label='Niños  2 - 11 años']//div[@class='plus control']//i[@class='material-icons']"));

    public static final Target BEBES = Target.the("Agrega bebés al vuelo")
            .located(By.xpath("//div[@class='controls noadults' and @aria-label='Bebés Menores de 2 años']//div[@class='plus control']//i[@class='material-icons']"));

    public static final Target CONTINUAR_NUMERO_PASAJEROS = Target.the("Botón continuar seccion agrregar numero de pasajeros")
            .located(By.xpath("//div[@class='passenger float']/button[@type='button' and @aria-label='Continuar, cerrar cuadro de pasajeros']"));

    public static final Target BUSCAR_VUELOS = Target.the("Boton buscar vuelos")
            .located(By.xpath("//div[@class='col-xs-12 text-right col-sm-4 col-md-6 especial-padding-3 noPadl boton-container']/button[@type='submit' and @title='Buscar vuelos']"));


    public static final Target IDA = Target.the("pais de origen").located(By.cssSelector("ul[role='list'][aria-label='Búsquedas recientes'] li:last-child"));


   }
