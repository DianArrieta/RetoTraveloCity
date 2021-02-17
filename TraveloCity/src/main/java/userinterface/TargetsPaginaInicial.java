package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TargetsPaginaInicial {

    public static final Target ENLACE_VUELOS =  Target.the("Enlace vuelos").located(By.xpath("//a[@href='?pwaLob=wizard-flight-pwa']"));

}
