
package relaciones_1_a_1_ejercicio6;


public class Principal {
 public static void main(String[] args) {
     Cliente c1 = new Cliente ("Pedro Jota", "1180909090");
     Reserva r1 = new Reserva("11/10/25", "21:00");
     Mesa mesa1 = new Mesa("20", "6 personas");
     
     //Establecer la relacion unidireccional
     r1.setCliente(c1);
     System.out.println("La reserva con fecha " + r1.getFecha() + " para el cliente: " + r1.getNombreCliente() + " es a las " + r1.getHora() + " hs.");
 
 //Establecer la agregacion:
 r1.setMesa(mesa1);
     System.out.println("La reserva para " + r1.getNombreCliente() + " sera en la mesa " + mesa1.getNumero() + " con capacidad para " + mesa1.getCapacidad());
 }
}
