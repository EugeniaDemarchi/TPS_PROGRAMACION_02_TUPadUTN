
package relaciones_1_a_1_ejercicio7;


public class Principal {
public static void main(String[] args) {
    Motor motor = new Motor("V6", "3000");
    Vehiculo v1 = new Vehiculo("IFJ303", "Civic");
    Conductor c1 = new Conductor("Laura Juarez", "jjjik9090");
    
    //Establecer la aghregacion
    v1.setMotor(motor);
    System.out.println("El vehiculo con patente " + v1.getPatente() + " tiene un motor del tipo: " + v1.getTipoMotor());
    //relacion bidireccional conductor-vehiculo
    c1.setVehiculo(v1);
    System.out.println("La conductora " + v1.getNombreConductor() + " esta manejando un Honda " + v1.getModelo() + " con patente " + v1.getPatente());
}
}
