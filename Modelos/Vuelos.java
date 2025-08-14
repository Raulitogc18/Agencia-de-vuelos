package Modelos;

// Nombre de la clase 
public class Vuelos {

    // Atributos de la clase
    private final String marcaAvion;
    private final int asiento;

    // Arreglo nativo de ejemplo: lista de pasajeros
    private String[] pasajeros;

    // Constructor vacío (Opción A)
    public Vuelos() {
        this.marcaAvion = "Desconocida";
        this.asiento = 0;
        this.pasajeros = new String[5]; // por ejemplo, máximo 5 pasajeros
    }

    // Constructor de la clase con parámetros
    public Vuelos(String marcaAvion, int asiento) {
        this.marcaAvion = marcaAvion;
        this.asiento = asiento;
        this.pasajeros = new String[5];
    }

    // Métodos de la clase
    public String getMarcaAvion() {
        return marcaAvion;
    }

    public int getAsiento() {
        return asiento;
    }

    public void mostrarVuelo() {
        System.out.println("Vuelo en avión de marca " + marcaAvion + " con asiento número " + asiento);
    }

    public String getEjecutivo() {
        return "Vuelo en clase ejecutiva con asiento " + asiento + " en avión de marca " + marcaAvion;
    }

    // Métodos para manejar el arreglo nativo
    public void agregarPasajero(String nombre, int posicion) {
        if (posicion >= 0 && posicion < pasajeros.length) {
            pasajeros[posicion] = nombre;
        } else {
            System.out.println("Posición inválida");
        }
    }

    public void mostrarPasajeros() {
        System.out.println("Lista de pasajeros:");
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null) {
                System.out.println((i + 1) + ". " + pasajeros[i]);
            }
        }
    }
}
