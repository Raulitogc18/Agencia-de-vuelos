package Controlador;

import Modelos.Lugar;
import Modelos.Vuelos;
import java.util.Scanner;

public class VuelosController {
    private Vuelos vuelos;

    public VuelosController() {
        this.vuelos = new Vuelos();
    }

    // Método para crear un lugar
    public Lugar crearLugar(Scanner scanner) {
        System.out.print("Ingrese el país: ");
        String pais = scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudad = scanner.nextLine();
        Lugar lugar = new Lugar(pais, ciudad);
        System.out.println("Lugar creado exitosamente.");
        return lugar;
    }

    // Método para asignar hotel
    public void asignarHotel(Lugar lugar, Scanner scanner) {
        if (lugar != null) {
            System.out.print("Ingrese el nombre del hotel: ");
            String hotel = scanner.nextLine();
            lugar.setHotel(hotel);
            System.out.println("Hotel asignado.");
        } else {
            System.out.println("Primero debe crear un lugar.");
        }
    }

    // Método para asignar puntos de interés
    public void asignarPuntosDeInteres(Lugar lugar, Scanner scanner) {
        if (lugar != null) {
            System.out.print("¿Qué puntos de interés desea visitar? ");
            String puntos = scanner.nextLine();
            lugar.setPuntosDeInteres(puntos);
            System.out.println("Puntos de interés guardados.");
        } else {
            System.out.println("Primero debe crear un lugar.");
        }
    }
}
