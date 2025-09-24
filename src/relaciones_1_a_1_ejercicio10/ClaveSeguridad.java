
package relaciones_1_a_1_ejercicio10;


public class ClaveSeguridad {
private String codigo;
private String ultimaModificacion;

public ClaveSeguridad(String codigo, String ultimaModificacion){
    this.codigo = codigo;
    this.ultimaModificacion = ultimaModificacion;
}

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    public void mostrar(){
        System.out.println("Mostrando clave: " + codigo );
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    
}
