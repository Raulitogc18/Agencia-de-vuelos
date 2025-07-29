package Modelos;

// Nombre de la clase
public class Guias {

// Atributos de la clase
private final String nombre;
private final String idioma;
private final String experiencia;

// Constructor de la clase
public Guias(String nombre, String idioma, String experiencia) {
    this.nombre = nombre;
    this.idioma = idioma;
    this.experiencia = experiencia;
}

    // Métodos de la clase
    public String getNombre() {
        return nombre;
    }

    public String getIdiomas() {
        return idioma;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void mostrarGuia() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Idioma: " + idioma);
        System.out.println("Experiencia: " + experiencia);
    }
}