
package Dependencia_Creacion.ejercicio_14;


public class Principal {
public static void main(String[] args) {
    Proyecto p1 = new Proyecto("cumpleaños", "15'");
    Render r1 = new Render();
 EditorVideo editor = new EditorVideo();
    
 r1.setProyecto(p1, "MP4");
    System.out.println(r1);
    
    editor.exportar("MP4", p1);

}
}