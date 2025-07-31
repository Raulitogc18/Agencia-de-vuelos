package Controlador;

import Modelos.Lugar;
import Modelos.Vuelos;

public class VuelosController {
    private Vuelos vuelos;
    private Lugar lugar = null;
    
    public VuelosController() {
        this.vuelos = new Vuelos();
    }

    // Crear lugar sin imprimir
    public String crearLugar(String pais, String ciudad) {
        lugar = new Lugar(pais, ciudad);
        return "lugar creado exitosamente";

    }

    // Asignar hotel sin imprimir
    public void asignarHotel( String hotel) {
        if (lugar != null) {
            lugar.setHotel(hotel);
        }
    }

    // Asignar puntos de interés sin imprimir
    public void asignarPuntosDeInteres(Lugar lugar, String puntos) {
        if (lugar != null) {
            lugar.setPuntosDeInteres(puntos);
        }
    }
}
