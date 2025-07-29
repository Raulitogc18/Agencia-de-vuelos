package Modelos;

// Nombre de la clase
public class Tiempo {

    // Atributos de la clase
    private final String hora;
    private final String fecha;

    // Constructor de la clase
    public Tiempo(String hora, String fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }


    // Métodos de la clase
    public String setHora(String hora) {
        return hora;
    }

    public String setFecha(String fecha) {
        return fecha;
    }

    // Eliminar método incompleto o implementarlo correctamente
    // public int setDias(String dias) {
    //     // Implementación aquí
    // }

    public void mostrarTiempo() {
        System.out.println("Hora: " + hora + ", Fecha: " + fecha);
    }
}