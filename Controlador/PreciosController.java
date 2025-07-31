package Controlador;

import Modelos.Precios;

public class PreciosController {
    private Precios precios;

    // Constructor que recibe la moneda
    public PreciosController(String moneda) {
        this.precios = new Precios(moneda);
    }

    // Método para asignar el precio del vuelo
    public void asignarPrecioVuelo(double precioVuelo) {
        precios.setPrecioVuelo(precioVuelo);
    }

    // Método para asignar el precio del hotel
    public void asignarPrecioHotel(double precioHotel) {
        precios.setPrecioHotel(precioHotel);
    }

    // Método para aplicar descuento
    public void aplicarDescuento(boolean esOferta) {
        precios.setDescuentoTotal(esOferta);
    }

    // Método para obtener los precios (puedes mostrarlo en el main)
    public Precios getPrecios() {
        return precios;
    }
}
