
package relaciones_1_a_1_ejercicio6;


public class Cliente {//clase independiente
private String nombre;
private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
