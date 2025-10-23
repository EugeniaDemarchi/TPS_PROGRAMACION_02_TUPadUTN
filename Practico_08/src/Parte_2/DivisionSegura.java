
package Parte_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
1. División segura ○ Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero
 */
public class DivisionSegura {
  public static void main(String[] args) {
      int x, y, z;
      System.out.println("Ingrese x: ");
      System.out.println("Ingrese y: ");
     try{
 Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    z = x/y;
    System.out.println("El resultado es " + z);
      }
      catch(ArithmeticException a)
      {
          System.out.println("No se puede dividir por 0");    
      } 
       catch(InputMismatchException a)
       {
           System.out.println("Deben ingresarse numeros enteros");  
      } finally{
       
          System.out.println("Adios!");
      }
  }
}

