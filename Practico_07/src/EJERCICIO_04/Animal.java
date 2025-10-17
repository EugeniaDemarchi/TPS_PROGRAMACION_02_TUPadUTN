
package EJERCICIO_04;

/**
 *
● Clase: Animal con método hacerSonido() y describirAnimal() 
 */
public abstract class Animal {
private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

public abstract String hacerSonido();

public String describirAnimal(){
 return nombre;
}

}
