
package Dependencia_Creacion.ejercicio_14;

public class Render {
private Proyecto proyecto;
 private String formato;  

public void setProyecto(Proyecto proyecto, String formato){
    this.proyecto = proyecto; 
    this.formato = formato;
}

public String getNombreProyecto(){
    return proyecto != null ? proyecto.getNombre() : "Sin nombre";
 }

  @Override
public String toString() {
    return "Render{proyecto=" + proyecto.getNombre() + 
           ", duracion=" + proyecto.getDuracionMin() +
           ", formato=" + formato + '}';
}


}
