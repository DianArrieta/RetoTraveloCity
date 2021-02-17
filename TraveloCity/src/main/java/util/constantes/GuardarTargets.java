package util.constantes;

import net.serenitybdd.screenplay.targets.Target;

public class GuardarTargets {

    private static Target etiqueta;

    private GuardarTargets(){}

    public static Target getEtiqueta() {
        return etiqueta;
    }

    public static void setEtiqueta(Target etiquetaInput) {
        etiqueta = etiquetaInput;
    }
}
