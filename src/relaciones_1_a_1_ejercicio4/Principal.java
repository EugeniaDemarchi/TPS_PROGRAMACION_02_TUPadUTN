
package relaciones_1_a_1_ejercicio4;

public class Principal {
 public static void main(String[] args) {
     TarjetaDeCredito birza = new TarjetaDeCredito("8999999999", "09/09/35");
     Cliente c1= new Cliente ("Raul Lozada", "22347767");
     Banco banco = new Banco("Segovia", " 30-78888898-2");
     
     //Uso una de las funciones setter para establecer la relacion bidireccional:
    c1.setTarjetaDeCredito(birza);
     System.out.println("La tarjeta " + birza.getNumero() + " con vencimiento " + birza.getFechaDeVencimiento() + " es del cliente: " + c1.getNombre());
     
     //Agregacion
     banco.setTarjetaDeCredito(birza);
     System.out.println("La tarjeta " + birza.getNumero() + " pertenece al banco " + banco.getNombreBanco());
 }
 }

