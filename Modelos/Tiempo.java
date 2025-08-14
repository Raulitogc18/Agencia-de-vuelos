package Modelos;

// Nombre de la clase
public class Tiempo {

    // Atributos de la clase
    private final String hora;
    private final String fecha;

    // Arreglo doble para almacenar múltiples horas y fechas
    private static String[][] registros;

    // Constructor de la clase
    public Tiempo(String hora, String fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }

    // Inicializar el arreglo doble con tamaño dado
    public static void inicializarRegistros(int filas, int columnas) {
        registros = new String[filas][columnas];
    }

    // Guardar un tiempo en el arreglo doble
    public static void guardarRegistro(int fila, int columna, String valor) {
        if (registros != null && fila < registros.length && columna < registros[0].length) {
            registros[fila][columna] = valor;
        }
    }

    // Mostrar todo el arreglo doble
    public static void mostrarRegistros() {
        if (registros != null) {
            for (int i = 0; i < registros.length; i++) {
                for (int j = 0; j < registros[i].length; j++) {
                    System.out.print(registros[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("El arreglo de registros no ha sido inicializado.");
        }
    }

    // Métodos de la clase
    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void mostrarTiempo() {
        System.out.println("Hora: " + hora + ", Fecha: " + fecha);
    }
}
