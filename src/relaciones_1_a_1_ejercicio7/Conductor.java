
package relaciones_1_a_1_ejercicio7;


public class Conductor {
private String nombre;
private String licencia;
private Vehiculo vehiculo;//Atributo bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    //Funcion setter con validacion antibucle:
    public void setVehiculo(Vehiculo vehiculo){
        if (this.vehiculo != vehiculo){
            this.vehiculo = vehiculo;
if (vehiculo != null && vehiculo.getConductor() != this){
    vehiculo.setConductor(this);//Establece relacion bidireccional
}
        }
    }

    //Funcion getter para acceder a datos relacionados:
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    public String getPatenteVehiculo(){
        return vehiculo != null ? vehiculo.getPatente() : "Sin vehiculo";
    }
    
    public String getNombre() {
        return nombre;
    }
}
