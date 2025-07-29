import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un objeto Lugar
        Lugar lugar = null;

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear lugar");
            System.out.println("2. Asignar hotel");
            System.out.println("3. Ingresar puntos de interés");
            System.out.println("4. Mostrar resumen del viaje");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el país: ");
                    String pais = scanner.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = scanner.nextLine();
                    lugar = new Lugar(pais, ciudad);
                    System.out.println("Lugar creado exitosamente.");
                    break;

                case 2:
                    if (lugar != null) {
                        System.out.print("Ingrese el nombre del hotel: ");
                        String hotel = scanner.nextLine();
                        lugar.setHotel(hotel);
                        System.out.println("Hotel asignado.");
                    } else {
                        System.out.println("Primero debe crear un lugar.");
                    }
                    break;

                case 3:
                    if (lugar != null) {
                        System.out.print("¿Qué puntos de interés desea visitar? ");
                        String puntos = scanner.nextLine();
                        lugar.setPuntosDeInteres(puntos);
                        System.out.println("Puntos de interés guardados.");
                    } else {
                        System.out.println("Primero debe crear un lugar.");
                    }
                    break;

                case 4:
                    if (lugar != null) {
                        System.out.println("\n--- Resumen del viaje ---");
                        System.out.println("País: " + lugar.getPais());
                        System.out.println("Ciudad: " + lugar.getCiudad());
                        System.out.println("Hotel: " + (lugar.getHotel() != null ? lugar.getHotel() : "No asignado"));
                        System.out.println("Puntos de interés: " + (lugar.getPuntosDeInteres() != null ? lugar.getPuntosDeInteres() : "No ingresados"));
                    } else {
                        System.out.println("Primero debe crear un lugar.");
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}