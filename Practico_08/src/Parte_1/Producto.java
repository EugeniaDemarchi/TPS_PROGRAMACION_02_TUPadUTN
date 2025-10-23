
package Parte_1;

/**
 *
2. Clase Producto: tiene nombre y precio, implementa Pagable. 
 */
public abstract class Producto implements Pagable{
private final String nombre;
private final double precio;


@Override
public double calcularTotal(){
return precio;
}

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
