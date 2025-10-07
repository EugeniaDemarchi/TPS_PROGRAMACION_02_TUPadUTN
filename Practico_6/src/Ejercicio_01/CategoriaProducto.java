
package Ejercicio_01;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public enum CategoriaProducto {
ALIMENTOS("Productos Comestibles"),
ELECTRONICA("Dispositivos electronicos"),
ROPA("Prendas de vestir"),
HOGAR("Articulos para el hogar");

private final String descripcion;


CategoriaProducto(String descripcion){
    this.descripcion =descripcion;
}

    public String getDescripcion() {
        return descripcion;
    }
}
