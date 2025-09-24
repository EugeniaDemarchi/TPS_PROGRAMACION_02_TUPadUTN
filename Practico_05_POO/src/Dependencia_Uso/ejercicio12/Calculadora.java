
package Dependencia_Uso.ejercicio12;

public class Calculadora {

    //metodo que usa temporalmente el impuesto
    public void calcular(Impuesto impuesto){
        System.out.println("El monto del impuesto es de: " + impuesto.getMonto());
        System.out.println("Sera deducido del contribuyente: " + impuesto.getNombreContribuyente());
    }
}
