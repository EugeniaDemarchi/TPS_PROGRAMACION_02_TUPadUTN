
package ejercicio_02;

import java.util.ArrayList;

/**
2. Figuras geométricas y métodos abstractos 
● Clase abstracta: Figura con método calcularArea() y atributo nombre
 ● Subclases: Círculo y Rectángulo implementan el cálculo del área 
● Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo. 

 */
public class Principal {
      public static void main(String[] args) {
ArrayList<Figura> figuras = new ArrayList<>();

figuras.add(new Rectangulo(3, 4, "Rectangulo"));
figuras.add(new Circulo(3, "Circulo"));



   for (Figura figura: figuras) {
            System.out.println("Area de " + figura.getNombre() + " " +  figura.calcularArea());
        }
}
}