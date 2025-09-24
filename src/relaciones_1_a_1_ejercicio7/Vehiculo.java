
package relaciones_1_a_1_ejercicio7;


public class Vehiculo {
private String patente;
private String modelo;
private Motor motor;// atributo de agregacion
private Conductor conductor; // atributo bidireccional

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

//Funcion setter para establecer la agregacion:

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    //Funcion getter para acceder al motor:
    public Motor getMotor(){
        return motor;
    }
  
    public void encender(){
        if (motor != null){
            motor.arrancar();
        } else{
            System.out.println("Auto sin motor");
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
    //encapsulamiento de atributos de motor:
    public String getTipoMotor(){
        if (motor !=null){
            return motor.getTipo();
            } else {
            return "Sin motor";
        }
    }
    
    public String getNroSerieMotor(){
        if (motor != null){
            return motor.getNroDeSerie();
           } else {
            return "Sin numero de serie";
        }
    }
    
    //Funcion setter con validacion antibucle
    public void setConductor(Conductor conductor){
        if (this.conductor != conductor){
            this.conductor = conductor;
            if (conductor != null && conductor.getVehiculo() != this){
                conductor.setVehiculo(this);
            }
        }
    }
    public Conductor getConductor(){
        return conductor;
    }
public String getNombreConductor(){
    return conductor != null ? conductor.getNombre() : "Sin conductor";
}
    
}
