package Modelos;

public class Precios {

    // Atributos privados
    private String moneda;
    private double precioVuelo;
    private double precioHotel;
    private boolean aplicarDescuentoTotal = false;

    // Constructores
    public Precios(String moneda) {
        this.moneda = moneda;
    }

    public Precios(String moneda, double precioVuelo, double precioHotel) {
        this.moneda = moneda;
        this.precioVuelo = precioVuelo;
        this.precioHotel = precioHotel;
    }

    // Métodos
    public double Monto(String moneda) {
        if (this.moneda.equalsIgnoreCase(moneda)) {
            return precioVuelo + precioHotel;
        } else {
            System.out.println("Las monedas no coinciden.");
            return 0;
        }
    }

    public void setPrecioVuelo(double precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public void setPrecioHotel(double precioHotel, boolean esOferta) {
        if (esOferta) {
            this.precioHotel = precioHotel * 0.9;
        } else {
            this.precioHotel = precioHotel;
        }
    }

    public void setDescuentoTotal(boolean descuento) {
        this.aplicarDescuentoTotal = descuento;
    }

    public void mostrarPrecios() {
        System.out.println("Moneda: " + moneda);
        System.out.println("Precio del vuelo: " + precioVuelo + " " + moneda);
        System.out.println("Precio del hotel: " + precioHotel + " " + moneda);

        double total = Monto(moneda);
        if (aplicarDescuentoTotal) {
            total = total * 0.75;
            System.out.println("¡Descuento aplicado del 25% al total!");
        }

        System.out.println("Monto total: " + total + " " + moneda);
    }
}