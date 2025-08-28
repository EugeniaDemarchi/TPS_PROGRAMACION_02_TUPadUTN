
package practico_3_poo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public String getTitulo(){
        return titulo;
    }
   public void setTitulo(String titulo){
        this.titulo = titulo;
   }

    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    
   public  int getAnioPublicacion(){
        return añoPublicacion;
    }
   public void setAnioPublicacion(int añoPublicacion){
        if (añoPublicacion >= 1900 && añoPublicacion <=2025){
            this.añoPublicacion= añoPublicacion;
   }
            else {
                    System.out.println("Ingrese un año válido");
        }
}
   public void mostrarInfo(){
       System.out.println(titulo + " " + autor + " " + añoPublicacion);
   }

    
    
    }



