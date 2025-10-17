
package EJERCICIO_04;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }



@Override
public String hacerSonido(){
    return "Miau";
}
}
