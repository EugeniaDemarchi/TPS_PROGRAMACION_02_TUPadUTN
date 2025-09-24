
package Dependencia_Creacion.ejercicio_14;


public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render();
        render.setProyecto(proyecto, formato);
        System.out.println("Exportando " + render);
    }
    
}
