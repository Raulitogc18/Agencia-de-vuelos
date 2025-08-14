package Controlador;

import Modelos.Lugar;
import Modelos.Vuelos;

public class VuelosController {
    private Vuelos vuelos;
    private Lugar lugar = null;
    
    public VuelosController() {
        this.vuelos = new Vuelos();
    }

    // Crear lugar
    public void crearLugar(String pais, String ciudad) {
        lugar = new Lugar(pais, ciudad);
    }

    // Asignar hotel
    public void asignarHotel(String hotel) {
        if (lugar != null) {
            lugar.setHotel(hotel);
        }
    }

    // Asignar puntos de interés
    public void asignarPuntosDeInteres(String puntos) {
        if (lugar != null) {
            lugar.setPuntosDeInteres(puntos);
        }
    }

    // Obtener el lugar actual
    public Lugar getLugar() {
        return lugar;
    }
}