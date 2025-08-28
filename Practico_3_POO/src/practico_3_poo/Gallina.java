
package practico_3_poo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Gallina {
private int idGallina;
private int edad;
private int huevosPuestos;


public void setIdGallina( int idGallina){
    this.idGallina = idGallina;
}

public void setEdad( int edad){
    this.edad = edad;
}
public int getHuevosPuestos(){
    return huevosPuestos;
}
public void setHuevosPuestos(int huevosPuestos){
    this.huevosPuestos = huevosPuestos;
}

///////////////METODOS///////////////
public void envejecer(){
   this.edad++;
}
public void ponerHuevo(){
  this.huevosPuestos++; 
}

public void mostrarEstado(){
    System.out.println("La gallina con id: " + idGallina + " tiene " + edad + " años y puso " + huevosPuestos + " huevos.");
    }
}
