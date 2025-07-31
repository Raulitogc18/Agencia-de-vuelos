package Modelos;

public class Precios {
    private String moneda;
    private double precioVuelo;
    private double precioHotel;
    private boolean descuentoTotal;

    // Constructor
    public Precios(String moneda) {
        this.moneda = moneda;
        this.precioVuelo = 0.0;
        this.precioHotel = 0.0;
        this.descuentoTotal = false;
    }

    // Setter para precio del vuelo
    public void setPrecioVuelo(double precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    // Setter para precio del hotel
    public void setPrecioHotel(double precioHotel) {
        this.precioHotel = precioHotel;
    }

    // Setter para descuento total
    public void setDescuentoTotal(boolean descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    // Método para mostrar precios
    public void mostrarPrecios() {
        double total = precioVuelo + precioHotel;
        if (descuentoTotal) {
            total *= 0.75; // Aplica 25% de descuento al total
        }

        System.out.println("\n--- Resumen de precios ---");
        System.out.println("Vuelo: " + precioVuelo + " " + moneda);
        System.out.println("Hotel: " + precioHotel + " " + moneda);
        System.out.println("Total con descuento: " + total + " " + moneda);
    }
}
