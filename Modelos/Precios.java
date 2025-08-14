package Modelos;

public class Precios {
    private String moneda;
    private double precioVuelo;
    private double precioHotel;
    private boolean descuento;
    private double precioTotal;

    // Constructor
    public Precios(String moneda) {
        this.moneda = moneda;
        this.precioVuelo = 0;
        this.precioHotel = 0;
        this.descuento = false;
        this.precioTotal = 0;
    }

    // Getters
    public String getMoneda() {
        return moneda;
    }

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    public double getPrecioHotel() {
        return precioHotel;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    // Setters
    public void setPrecioVuelo(double precioVuelo) {
        this.precioVuelo = precioVuelo;
        calcularTotal();
    }

    public void setPrecioHotel(double precioHotel) {
        this.precioHotel = precioHotel;
        calcularTotal();
    }

    public void setDescuentoTotal(boolean esOferta) {
        this.descuento = esOferta;
        calcularTotal();
    }

    // Método para calcular el total
    private void calcularTotal() {
        double total = precioVuelo + precioHotel;
        if (descuento) {
            total *= 0.9; // Aplica un 10% de descuento, por ejemplo
        }
        this.precioTotal = total;
    }
}
