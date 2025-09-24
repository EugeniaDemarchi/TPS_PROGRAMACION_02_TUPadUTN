
package relaciones_1_a_1_ejercicio9;


public class CitaMedica {//clase asociada por Paciente y por Profesional
private String fecha;
private String hora;

public CitaMedica(String fecha, String hora){
    this.fecha = fecha;
    this.hora = hora;
}

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + '}';
    }
    
}
