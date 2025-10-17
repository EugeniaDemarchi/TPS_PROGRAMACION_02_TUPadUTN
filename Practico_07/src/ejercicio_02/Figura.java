
package ejercicio_02;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Figura {
private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }
public abstract double calcularArea();
}
