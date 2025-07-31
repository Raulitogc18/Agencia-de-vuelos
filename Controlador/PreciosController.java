import Modelos.Precios;
import java.util.Scanner;

public class PreciosController {
    private final Precios precios;

    // Constructor modificado para recibir moneda
    public PreciosController(String moneda) {
        this.precios = new Precios(moneda);
    }

    // Métodos para configurar precios y descuentos
    public void setPrecioVuelo(double precioVuelo, boolean esOferta) {
        precios.setPrecioVuelo(precioVuelo);
    }

    public void setPrecioHotel(double precioHotel, boolean esOferta) {
        precios.setPrecioHotel(precioHotel);
    }

    public void setDescuentoTotal(boolean descuento) {
        precios.setDescuentoTotal(descuento);
    }

    // Mostrar precios
    public void mostrarPrecios() {
        precios.mostrarPrecios();
    }

    // Método main para interactuar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de moneda (por ejemplo: USD, EUR): ");
        String moneda = scanner.nextLine();

        PreciosController controlador = new PreciosController(moneda);

        System.out.print("Ingrese el precio del vuelo: ");
        double precioVuelo = scanner.nextDouble();

        System.out.print("Ingrese el precio del hotel: ");
        double precioHotel = scanner.nextDouble();

        System.out.print("¿El precio total tiene descuento del 25%? (si/no): ");
        scanner.nextLine();
        String respuesta = scanner.nextLine();
        boolean esOferta = respuesta.equalsIgnoreCase("si");

        controlador.setPrecioVuelo(precioVuelo, esOferta);
        controlador.setPrecioHotel(precioHotel, esOferta);
        controlador.setDescuentoTotal(esOferta);

        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ver precios");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.mostrarPrecios();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}
