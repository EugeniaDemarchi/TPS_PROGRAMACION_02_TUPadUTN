
package relaciones_1_a_1_ejercicio5;


public class Propietario {
    private String nombre;
    private String DNI;
private Computadora computadora;//ATRIBUTO BIDIRECCIONAL

    public Propietario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

public void setComputadora(Computadora computadora){
    if (this.computadora != computadora){
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() !=this){
            computadora.setPropietario(this);//Establecer relacion bidireccional
        }
    }
}

//Funcion getter para acceder a los datos relacionados:
public Computadora getComputadora(){
    return computadora;
}

public String getMarcaComputadora(){
    return computadora !=null ? computadora.getMarca() : "Sin marca";
}

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", DNI=" + DNI + ", computadora=" + computadora + '}';
    }
}
