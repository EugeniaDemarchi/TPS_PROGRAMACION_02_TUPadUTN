
package relaciones_1_a_1_ejercicio5;


public class PlacaMadre {
private String modelo;
private String chipSet;

    public PlacaMadre(String modelo, String chipSet) {
        this.modelo = modelo;
        this.chipSet = chipSet;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipSet() {
        return chipSet;
    }

public void mostrar(){
    System.out.println("Mostrando modelo de placa madre: " + modelo);
}

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipSet=" + chipSet + '}';
    }
}
