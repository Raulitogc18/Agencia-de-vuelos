import Controlador.VuelosController;
import Modelos.Lugar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VuelosController vuelosController = new VuelosController();

        int opcion = 0;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear lugar");
            System.out.println("2. Mostrar resumen del viaje");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número válido.");
                scanner.nextLine();
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Crear lugar
                    System.out.print("Ingrese el país: ");
                    String pais = scanner.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = scanner.nextLine();
                    vuelosController.crearLugar(pais, ciudad);
                    System.out.println("Lugar creado exitosamente.");

                    // Asignar hotel
                    System.out.print("Ingrese el nombre del hotel: ");
                    String hotel = scanner.nextLine();
                    vuelosController.asignarHotel(hotel);
                    System.out.println("Hotel asignado.");

                    // Asignar puntos de interés
                    System.out.print("¿Qué puntos de interés desea visitar? ");
                    String puntos = scanner.nextLine();
                    vuelosController.asignarPuntosDeInteres(puntos);
                    System.out.println("Puntos de interés guardados.");

                    break;

                case 2:
                    Lugar lugar = vuelosController.getLugar();
                    if (lugar != null) {
                        System.out.println("\n--- Resumen del viaje ---");
                        System.out.println("País: " + lugar.getPais());
                        System.out.println("Ciudad: " + lugar.getCiudad());
                        System.out.println("Hotel: " +
                            (lugar.getHotel() != null ? lugar.getHotel() : "No asignado"));
                        System.out.println("Puntos de interés: " +
                            (lugar.getPuntosDeInteres() != null ? lugar.getPuntosDeInteres() : "No ingresados"));
                    } else {
                        System.out.println("Primero debe crear un lugar.");
                    }
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
