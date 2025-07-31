import Modelos.Precios;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de moneda (por ejemplo: USD, EUR): ");
        String moneda = scanner.nextLine();

        Precios precios = new Precios(moneda);

        System.out.print("Ingrese el precio del vuelo: ");
        double precioVuelo = scanner.nextDouble();

        System.out.print("Ingrese el precio del hotel: ");
        double precioHotel = scanner.nextDouble();

        System.out.print("¿El precio total tiene descuento del 25%? (si/no): ");
        scanner.nextLine();
        String respuesta = scanner.nextLine();
        boolean esOferta = respuesta.equalsIgnoreCase("si");

        precios.setPrecioVuelo(precioVuelo);
        precios.setPrecioHotel(precioHotel);
        precios.setDescuentoTotal(esOferta);

        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ver precios");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    precios.mostrarPrecios();
                    break;
                case 2:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}
