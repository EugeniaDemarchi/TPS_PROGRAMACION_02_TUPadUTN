
package relaciones_1_a_1_ejercicio9;


public class Paciente {
private String nombre;
private String obraSocial;
private CitaMedica citaMedica;//Atributo de la relacion

public Paciente(String nombre, String obraSocial){
    this.nombre = nombre;
    this.obraSocial = obraSocial;
}

public void setCitaMedica(CitaMedica citaMedica){
    this.citaMedica = citaMedica;
}
public String getFechaCitaMedica(){
    return citaMedica!= null ? citaMedica.getFecha() : "Sin fecha";
}

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }


    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + ", citaMedica=" + citaMedica + '}';
    }



}
