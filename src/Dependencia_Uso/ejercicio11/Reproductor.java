
package Dependencia_Uso.ejercicio11;


public class Reproductor {
//No hay atributo de reproductor
    
    //Metodo que usa temproalmente una Cancion (dependencia de uso)
    public void reproducir(Cancion cancion){
        System.out.println("Titulo de la cancion: " + cancion.getTituloCancion());
        System.out.println("Artista: " + cancion.getNombreArtista());
        
        //La cancion se usa solo durante la ejecucion del metodo
    }
}
