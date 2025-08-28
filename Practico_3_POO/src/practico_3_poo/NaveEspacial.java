
package practico_3_poo;

public class NaveEspacial {
  private  String nombre;
  private  int combustible;
    
  
  public void setNombre(String nombre){
      this.nombre = nombre;
  }
  public void setCombustible(int combustible){
      this.combustible = combustible;
  }
  public void despegar(){
      if (combustible > 0){
         System.out.println(nombre + " ha despegado");
      } else {
       System.out.println("Es necesario cargar suficiente combustible");
      }
  }

  public void avanzar(int distancia){
   if (combustible >= distancia){
       combustible -= distancia;
       System.out.println(nombre + " avanzó " + distancia + " km.");
         } else {
       System.out.println("Se debe cargar combustible para poder avanzar " + distancia + " km");
     }
    }
 
  public void recargarCombustible(int cantidad){
      int maxCombustible =100;
if (combustible + cantidad > maxCombustible){
    combustible = maxCombustible;
} else {
combustible += cantidad;
}
      System.out.println("Se recargaron " + cantidad + " litros de combustible.");
  }
  
  
public void mostrarEstado(){
    System.out.println("La nave " + nombre + " tiene " +combustible + " lts. de combustible.");
}

}
