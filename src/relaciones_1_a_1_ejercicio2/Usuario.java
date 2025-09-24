
package relaciones_1_a_1_ejercicio2;

public class Usuario {
private String nombre;
private String DNI;
private Celular celular;//Atributo bidireccional

    public Usuario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

//Funcion setter con validacion anti-bucle:

    public void setCelular(Celular celular) {
        if( this.celular != celular){
            this.celular = celular; 
            if (celular != null && celular.getUsuario() != this){
                celular.setUsuario(this);
            }
        }
    }
    
    
    public Celular getCelular(){
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

}
