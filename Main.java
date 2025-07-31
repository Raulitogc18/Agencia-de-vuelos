import Controlador.VuelosController;
import Modelos.Lugar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VuelosController vuelosController = new VuelosController();


        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear lugar");
            System.out.println("2. Mostrar resumen del viaje");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    lugar = vuelosController.crearLugar(scanner);
                    vuelosController.asignarHotel(lugar, scanner);
                    vuelosController.asignarPuntosDeInteres(lugar, scanner);
                    break;

                case 2:
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
