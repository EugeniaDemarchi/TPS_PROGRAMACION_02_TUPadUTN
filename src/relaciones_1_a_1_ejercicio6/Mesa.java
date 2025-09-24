
package relaciones_1_a_1_ejercicio6;


public class Mesa {//clase contenida de la Agregacion
private String numero;
private String capacidad;

    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public String getCapacidad() {
        return capacidad;
    }
}
