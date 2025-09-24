
package Dependencia_Uso.ejercicio11;


public class Principal {
    public static void main(String[] args) {
Cancion cancion = new Cancion ("Memory Gospel");
Artista artista = new Artista("Moby", "electronica");

cancion.setArtista(artista);
        System.out.println(cancion);
Reproductor reproductor = new Reproductor ();

//Usar la dependencia temporalmente
reproductor.reproducir(cancion);
}
}