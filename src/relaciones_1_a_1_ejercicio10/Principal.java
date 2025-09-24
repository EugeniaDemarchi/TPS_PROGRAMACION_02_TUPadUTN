
package relaciones_1_a_1_ejercicio10;


public class Principal {
public static void main(String[] args) {
    CuentaBancaria cuenta1 = new CuentaBancaria("82783823673672", "$9000000", "12345", "5/8/24");
    Titular t1 = new Titular("Pepe Luis", "23777888"); 
    cuenta1.mostrarInformacion();
    System.out.println(cuenta1);
    
    
    //para ver la bidireccionalidad uso una de las funciones setter
    t1.setCuentaBancaria(cuenta1);
    System.out.println(t1);
}
}
