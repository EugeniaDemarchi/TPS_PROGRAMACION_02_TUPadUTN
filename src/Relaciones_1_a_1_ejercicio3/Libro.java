
package Relaciones_1_a_1_ejercicio3;

public class Libro {
private String titulo;
private String isbn;
private Autor autor;//Atributo de relacion unidireccional 1-1


    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

//Funcion setter para esteblecer la relacion:

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
 // Getter para acceder a datos relacionados
    public String getNombreAutor() {
        return autor != null ? autor.getNombre() : "Sin autor";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    
}
