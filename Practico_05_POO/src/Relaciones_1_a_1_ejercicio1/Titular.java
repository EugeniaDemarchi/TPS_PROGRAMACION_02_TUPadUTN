
package Relaciones_1_a_1_ejercicio1;


public class Titular {
private String nombre;
private String DNI;
private Pasaporte pasaporte; // Atributo bidireccional

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

//Funcion setter con validacion anti-bucle:
public void setPasaporte(Pasaporte pasaporte){
    if (this.pasaporte != pasaporte){
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
}

public Pasaporte getPasaporte(){
    return pasaporte;
}

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }
    public void mostrarTitular() {
        System.out.println("Titular: " + nombre + " - DNI: " + DNI);
        if (pasaporte != null) {
            System.out.println("Tiene pasaporte N°: " + pasaporte.getNumero());
        }
    }

}


