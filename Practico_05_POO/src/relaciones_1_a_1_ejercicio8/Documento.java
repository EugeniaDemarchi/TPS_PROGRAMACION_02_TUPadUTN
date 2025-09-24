
package relaciones_1_a_1_ejercicio8;


public class Documento { //Clase contenedora
private String titulo;
private String contenido;
private FirmaDigital firmaDigital;//Atributo de composicion

    public Documento(String titulo, String Contenido, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = Contenido;
        //creacion directa de la parte:
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
    }

//Funcion getter para acceder a la parte:
    public FirmaDigital getFirmaDigital(){
        return firmaDigital;
    }
    
    //Funcion que usa la parrte
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        firmaDigital.mostrar();
    }
}
