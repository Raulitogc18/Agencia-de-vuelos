package Modelos;

//Nombre de la clase 
public class Vuelos {

    //Atributos de la clase
    private final String marcaAvion;
    private final int asiento;

    //Constructor de la clase
    public Vuelos(String marcaAvion, int asiento) {
        this.marcaAvion = marcaAvion;
        this.asiento = asiento;
    }

    //Métodos de la clase
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
}