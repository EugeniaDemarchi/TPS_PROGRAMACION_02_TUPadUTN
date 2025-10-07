
package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
private String nombre;
private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
    libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
}

public void listarLibros(){
    if (libros.isEmpty()){
        System.out.println("No hay libros en la biblioteca");
    } else {
        for (Libro l: libros) {
            l.mostrarInfo();
            System.out.println("---------------------------");
        }
    }
}
public Libro buscarLibroPorIsbn(String isbn){
    for (Libro l : libros) {
        if (l.getIsbn().equalsIgnoreCase(isbn)){
            return l;
        }
    }
    return null;
}
public void eliminarLibro(String isbn) {
    Libro l = buscarLibroPorIsbn(isbn);
    if (l != null){
        libros.remove(l);
        System.out.println("Libro eliminado " + l.getTitulo());
    } else {
        System.out.println("No se encontro el libro con ese isbn");
    }
}
public int obtenerCantidadLibros(){
  return libros.size();
    }

public void filtrarLibrosPorAnio(int anio) {
    System.out.println("Libros publicados en el año " + anio + ":");
    for (Libro l : libros) {
        if (l.getAnioPublicacion() == anio){
            l.mostrarInfo();
        }
    }
}
public void mostrarAutoresDisponibles() {
    System.out.println("Autores disponibles:");
  
    libros.stream()
          .map(Libro::getAutor)
          .distinct()
            .forEach(Autor::mostrarInfo);

}
}




