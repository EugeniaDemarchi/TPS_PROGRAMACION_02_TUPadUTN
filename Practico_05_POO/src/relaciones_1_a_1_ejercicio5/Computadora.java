
package relaciones_1_a_1_ejercicio5;


public class Computadora {
private String marca;
private String nroSerie;
private PlacaMadre placaMadre;//atributo de composicion
private Propietario propietario;//atributo bidireccional

    public Computadora(String marca, String nroSerie, String modelo, String chipSet) {
        this.marca = marca;
        this.nroSerie = nroSerie;
        //Creacion directa de la parte (composicion)
        this.placaMadre =  new PlacaMadre(modelo, chipSet);
    }

public PlacaMadre getPlacaMadre(){
    return placaMadre;
}


public void mostrarInformacion(){
    System.out.println("Marca: " + marca);
    placaMadre.mostrar();
}

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", nroSerie=" + nroSerie + ", placaMadre=" + placaMadre + '}';
    }

    public String getMarca() {
        return marca;
    }
    
    //Funcion setter con validacion anti-bucle
    public void setPropietario(Propietario propietario){
        if (this.propietario != propietario){
            this.propietario =propietario;
            if (propietario !=null && propietario.getComputadora() != this){
                propietario.setComputadora(this);
            }
        }
    }
    public Propietario getPropietario(){
        return propietario;
    }
    
    public String getNombrePropietario(){
        return propietario !=null ? propietario.getNombre() : "Sin propietario";
    }
}
