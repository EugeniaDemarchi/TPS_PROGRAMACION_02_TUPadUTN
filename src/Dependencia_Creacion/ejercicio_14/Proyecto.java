
package Dependencia_Creacion.ejercicio_14;

public class Proyecto {
private String nombre;
private String duracionMin;

public Proyecto(String nombre, String duracionMin){
    this.nombre= nombre;
    this.duracionMin = duracionMin;   
}

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }




}
