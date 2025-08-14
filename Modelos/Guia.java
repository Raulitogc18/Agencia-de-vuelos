package Modelos;

public class Guia {
    private String nombre;
    private String idiomas;
    private String experiencia;

    public Guia(String nombre, String idiomas, String experiencia) {
        this.nombre = nombre;
        this.idiomas = idiomas;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public String getExperiencia() {
        return experiencia;
    }
}
