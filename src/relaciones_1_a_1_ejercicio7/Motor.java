
package relaciones_1_a_1_ejercicio7;

public class Motor {
private String tipo;
private String nroDeSerie;

    public Motor(String tipo, String nroDeSerie) {
        this.tipo = tipo;
        this.nroDeSerie = nroDeSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

public void arrancar(){
    System.out.println("Motor arrancado");
}
}
