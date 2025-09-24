
package relaciones_1_a_1_ejercicio9;


public class Profesional {
private String nombre;
private String especialidad;
private CitaMedica citaMedica;// atributo de la relacion

public Profesional(String nombre, String especialidad){
    this.nombre = nombre;
    this.especialidad = especialidad;
}

public void setCitaMedica(CitaMedica citaMedica){
    this.citaMedica = citaMedica;
}

public String getCitaMedica(){
    return citaMedica != null ? citaMedica.getFecha() : "Sin cita medica";
}

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", citaMedica=" + citaMedica + '}';
    }

}
