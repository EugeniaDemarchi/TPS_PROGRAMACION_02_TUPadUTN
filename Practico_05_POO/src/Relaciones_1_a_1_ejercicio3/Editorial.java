
package Relaciones_1_a_1_ejercicio3;


public class Editorial {
private String nombre;
private String direccion;
private Libro libro; //Atributo de agregacion

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getNombre() {
        return nombre;
    }

}
