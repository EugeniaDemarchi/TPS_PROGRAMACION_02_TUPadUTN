
package Ejercicio_01;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Producto {
private String ID;
private String nombre;
private double precio;
private int cantidad;
private CategoriaProducto categoria;

    public Producto(String ID, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

public void mostrarInfo(){
    System.out.println("ID: " + ID);
    System.out.println("Nombre: " + nombre);
    System.out.println("Precio: $" + precio);
      System.out.println("Cantidad: " + cantidad);
    System.out.println("Categoria: " + categoria + " (" + categoria.getDescripcion() + ") ");
    System.out.println("---------------------------------------------");
}
}
