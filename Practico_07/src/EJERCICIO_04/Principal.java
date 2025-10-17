
package EJERCICIO_04;

import java.util.ArrayList;

/**
4. Animales y comportamiento sobrescrito 
● Clase: Animal con método hacerSonido() y describirAnimal() 
● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
 ● Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo

 */
public class Principal {
public static void main(String[] args) {
    ArrayList <Animal> animales = new ArrayList<>();
    animales.add(new Perro("Nino"));
    animales.add(new Vaca("Lola"));
    animales.add(new Gato("Luna"));
    
    for (Animal a: animales){
        System.out.println(a.describirAnimal() + " hace "+ a.hacerSonido());
    }
}
}

