
package Relaciones_1_a_1_ejercicio1;

public class Pasaporte {
private String numero;
private String fechaEmision;
private Foto foto;//Atributo de composicion
private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

public Foto getFoto(){
    return foto;
}

public void mostrarFoto(){
    System.out.println("El pasaporte " + numero + " tiene fecha de emision: " + fechaEmision);
    foto.mostrarFoto();
}
//Funcion setter con validacion anti-bucle:
public void setTitular(Titular titular){
    if (this.titular != titular){
        this.titular = titular;
        if ( titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
}

public Titular getTitular(){
    return titular;
}

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

       
public void mostrarPasaporte() {
        System.out.println("Pasaporte N°: " + numero + " emitido el " + fechaEmision);
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDNI() + ")");
        }
        foto.mostrarFoto();
    }

}
