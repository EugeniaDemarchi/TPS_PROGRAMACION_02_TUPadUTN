
package ejercicio_01;

/**
● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo() 
 */
public class Auto extends Vehiculo {
private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }


@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Cantidad puertas: " + cantidadPuertas);
}
}
