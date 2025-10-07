
package Ejercicio_02;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {
  public static void main(String[] args) {
//  1. Creamos una biblioteca. 
Biblioteca b1 = new Biblioteca("Universo");

//2. Crear al menos tres autores 
Autor a1 = new Autor("a1", "Gabriel Garcia Marquez", "Colombia");
Autor a2 = new Autor("a2", "Julio Cortazar", "Argentina");
Autor a3 = new Autor("a3", "Jane Austen", "Gran Bretaña");


//3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca. 
b1.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
b1.agregarLibro("ISBN002", "El amor en los tiempos de colera", 1985, a1);
b1.agregarLibro("ISBN003", "Rayuela", 1963, a2);
b1.agregarLibro("ISBN004", "Orgullo y prejuicio", 1813, a3);
b1.agregarLibro("ISBN005", "Emma", 1815, a3);


//4. Listar todos los libros con su información y la del autor. 
//b1.listarLibros();

//5. Buscar un libro por su ISBN y mostrar su información. 
//Libro encontrado = b1.buscarLibroPorIsbn("ISBN001");
//      if (encontrado != null){
//          encontrado.mostrarInfo();
//      } else {
//          System.out.println("Libro no encontrado");
//      }


//6. Filtrar y mostrar los libros publicados en un año específico. 
//b1.filtrarLibrosPorAnio(1985);


//7. Eliminar un libro por su ISBN y listar los libros restantes.
//b1.eliminarLibro("ISBN005");
//      System.out.println("|||||||||||||||||||||||||||||||");
//b1.listarLibros();

//8. Mostrar la cantidad total de libros en la biblioteca. 
//int cantidadTotal = b1.obtenerCantidadLibros();
//      System.out.println("La cantidad total de libros en " + b1.getNombre() + " es: " + cantidadTotal);

//9. Listar todos los autores de los libros disponibles en la biblioteca. 
  b1.mostrarAutoresDisponibles();
  
  }
}
