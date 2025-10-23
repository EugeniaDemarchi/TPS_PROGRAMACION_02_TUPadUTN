
package Parte_2;

import java.util.Scanner;

/**
 *
2.	Conversión de cadena a número ○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido. 
 */
public class cadena_a_numero {
public static void main(String[] args) {
    
    System.out.print("Ingresa un numero: ");
    
    try {
   Scanner sc = new Scanner(System.in);
   String texto = sc.nextLine();
   int numero = Integer.parseInt(texto);
    }
    catch (NumberFormatException n){
        System.out.println("Debes ingresar un numero");
    }
    finally{
        System.out.println("Gracias");
    }
}
    
    
}
