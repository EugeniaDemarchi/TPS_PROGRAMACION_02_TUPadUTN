
package practico_3_poo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Mascotas {
    
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + especie + " " + edad);
    }

    int cumplirAnios(){
        edad = edad + 1;
    return edad;
                }
    void mostrarEdad(){
        System.out.println(nombre + " ya tiene " + edad + " años!!");
    }
}
