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
        actualizarTotal();
    }

    // Método para asignar el precio del hotel
    public void asignarPrecioHotel(double precioHotel) {
        precios.setPrecioHotel(precioHotel);
        actualizarTotal();
    }

    // Método para aplicar descuento
    public void aplicarDescuento(boolean esOferta) {
        precios.setDescuentoTotal(esOferta);
    }

    // Método para obtener los precios
    public Precios getPrecios() {
        return precios;
    }

    // Método privado para actualizar total sin afectar descuento
    private void actualizarTotal() {
        // Si ya hay descuento aplicado, recalcularlo sobre los precios nuevos
        boolean descuentoActivo = precios.getPrecioTotal() < (precios.getPrecioVuelo() + precios.getPrecioHotel());
        if (descuentoActivo) {
            precios.setDescuentoTotal(true);
        } else {
            precios.setDescuentoTotal(false);
        }
    }
}
