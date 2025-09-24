
package relaciones_1_a_1_ejercicio5;


public class Principal {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Dell OptiPlex 7090", "CN0A1B2C3D4E567FG", "ASUS PRIME B560M-A", "Intel B560");
        Propietario p1 = new Propietario("Tomas Perez", "44567888");
        
        System.out.println(computadora);
       computadora.mostrarInformacion();
       
       //usar UNA de las funciones setter para crear la bidireccionalidad:
       p1.setComputadora(computadora);
       System.out.println("Desde Propietario: " + p1.getNombre() +
                   " tiene la computadora " + p1.getMarcaComputadora());

System.out.println("Desde Computadora: " + computadora.getMarca() +
                   " pertenece a " + computadora.getNombrePropietario());

}
}