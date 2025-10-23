
package Parte_2.ejercicio4;

import Parte_2.ejercicio4.EdadInvalidaException;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PrincipalEdadInvalida {
public static void main(String[] args) {
    
    System.out.print("Ingresa tu edad:  ");
    
        try {
   Scanner sc = new Scanner(System.in);
   int edad = sc.nextInt();
   if (edad < 0 || edad > 120){
       throw new EdadInvalidaException("La edad esta fuera de rango");
   }
            System.out.println("edad valida: " + edad);
        }
        catch(EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
   
}
}
