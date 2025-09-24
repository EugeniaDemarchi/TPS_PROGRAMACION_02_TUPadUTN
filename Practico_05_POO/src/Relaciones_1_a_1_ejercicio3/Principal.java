
package Relaciones_1_a_1_ejercicio3;

public class Principal {
 public static void main(String[] args) {
 
 Libro libro = new Libro("La condesa sangrienta", "9809");
 Autor autor = new Autor("Alejandra Pizarnik", "argentina");
 Editorial editorial = new Editorial("Kapeluz", "Aguero 2090");
 
 //Establecer la relacion unidirecciona:
 libro.setAutor(autor);
 
   // Mostrar por consola el autor con toString()
        System.out.println(autor);
   //Mostrar el autor desde libro:
     System.out.println("Autor del libro: " + libro.getNombreAutor());
     
     //Establecer agregacion:
     editorial.setLibro(libro);
     System.out.println("El libro " + libro.getTitulo()+ " de la autora " + libro.getNombreAutor() + " fue editado por la editorial " + editorial.getNombre());
 }
}
