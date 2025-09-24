
package Dependencia_Uso.ejercicio11;


public class Cancion {//en asociacion 1 a 1 es la clase que mantiene la referencia
private String titulo;
private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

public void setArtista(Artista artista){
    this.artista = artista;
}

//Funcion getter para acceder a datos relacionados
public String getNombreArtista(){
    return artista != null ? artista.getNombre() : "Sin nombre";
}
public String getGeneroArtista(){
    return artista != null ? artista.getGenero(): "Sin genero";
}    
//DEPENDENIA DE USO

public String getTituloCancion(){
    return titulo;
}

    public Artista getArtista() {
        return artista;
    }


    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
}
