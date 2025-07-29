package Modelos;

//Nombre de la clase
public class Lugar {
    //Atributos de la clase
    private String pais;
    private String ciudad;
    private String hotel;
    private String puntosDeInteres;

    //Constructor de la clase
    public Lugar(String pais, String ciudad) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.hotel = null;
        this.puntosDeInteres = null;
    }

    //Métodos de la clase
    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getPuntosDeInteres() {
        return puntosDeInteres;
    }

    public void setPuntosDeInteres(String puntosDeInteres) {
        this.puntosDeInteres = puntosDeInteres;
    }
}