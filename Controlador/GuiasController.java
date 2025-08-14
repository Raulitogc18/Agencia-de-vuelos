package Controlador;

import Modelos.Guia;
import java.util.ArrayList;

public class GuiasController {

    private final ArrayList<Guia> guias;

    public GuiasController() {
        guias = new ArrayList<>();
    }

    public void agregarGuia(Guia guia) {
        guias.add(guia);
    }

    public ArrayList<Guia> getGuias() {
        return guias;
    }
}
