
package practico_3_poo;


public class Estudiante {
public String nombre;
String apellido;
String curso;
double calificacion;

public void mostrarInfo(){
    System.out.println(nombre + " " + apellido + " " + curso);
}
public double subirCalificacion(double puntos){
   return  calificacion += puntos;
}
public double bajarCalificacion(double puntos){
    return calificacion -= puntos;
}
public void mostrarCalificacion(){
    System.out.println("Calificacion actual: " + calificacion);
}
}



