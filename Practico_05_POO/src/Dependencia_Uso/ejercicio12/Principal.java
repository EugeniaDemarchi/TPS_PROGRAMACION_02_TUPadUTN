
package Dependencia_Uso.ejercicio12;


public class Principal {
 public static void main(String[] args) {
     Impuesto impuesto = new Impuesto(9000);
     Contribuyente c1 = new Contribuyente("Fernando Luis", "28372389738-9");
     Calculadora calcu = new Calculadora();
     
     impuesto.setContribuyente(c1);
     System.out.println(impuesto);
     
     calcu.calcular(impuesto);
 }
}
