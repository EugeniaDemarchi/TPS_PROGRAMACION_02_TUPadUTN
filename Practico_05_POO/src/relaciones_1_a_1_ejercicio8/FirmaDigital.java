
package relaciones_1_a_1_ejercicio8;


public class FirmaDigital {//clase contenida de la composicion y de la agregacion
private String codigoHash;
private String fecha;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

public void mostrar(){
    System.out.println("Mostrando firma digital: " + codigoHash);
}
}
