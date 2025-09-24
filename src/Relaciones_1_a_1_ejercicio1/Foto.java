
package Relaciones_1_a_1_ejercicio1;

public class Foto {
private String imagen;
private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void mostrarFoto(){
        System.out.println("Mostrando foto: " + imagen + " con formato: " + formato);
    }
}
