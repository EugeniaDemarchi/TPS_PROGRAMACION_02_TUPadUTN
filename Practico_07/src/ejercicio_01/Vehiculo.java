
package ejercicio_01;

/**
 *
● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo() 
 */
public class Vehiculo {
private String marca;
private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

public void mostrarInfo(){
    System.out.println("Marca: " + marca );
       System.out.println("Modelo: " + modelo);
}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
