
package Ejercicio_01;

import java.util.ArrayList;

public class Inventario {
private ArrayList<Producto> productos;

//Constructor que inicializa la lista
public Inventario(){
    productos = new ArrayList<>();
}

public void agregarProducto(Producto p){
    if (p!= null && !productos.contains(p)){
        productos.add(p);
    }
}
public void listarProductos(){
    if (productos.isEmpty()){
        System.out.println("No hay productos en el inventario");
    } else {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}
public Producto buscarProductoPorId(String Id){
    for (Producto p : productos) {
        if (p.getID().equalsIgnoreCase(Id)){
            return p;
        }
    }
    return null;
}
public void eliminarProducto(String Id){
    Producto p = buscarProductoPorId(Id);
    if (p != null){
        productos.remove(p);
        System.out.println("Producto eliminado: " + p.getNombre());
    } else {
        System.out.println("No se encontro el producto con ese ID: ");
    }
}
public void actualizarStock(String id, int cantidadASumar){
     Producto p =buscarProductoPorId(id);
     if (p != null){
       int nuevoStock = p.getCantidad() + cantidadASumar;
       p.setCantidad(nuevoStock);
         System.out.println("Stock actualizado. Nuevo stock: " + nuevoStock);
     } else {
         System.out.println("No se encontro el producto cobn ese id");
     }
}

public void filtrarPorCategoria(CategoriaProducto categoria){
    System.out.println("Productos de la categoria: "+ categoria);
    for (Producto p : productos) {
        if (p.getCategoria() == categoria){
            p.mostrarInfo();
        }
    }
}

public int obtenerTotalStock(){
    int total= 0;
    for (Producto p : productos){
        total+=p.getCantidad();
    }
    return  total;
}

public Producto obtenerProductoConMayorStock(){
    if (productos.isEmpty()) return null;
    Producto max = productos.get(0);
    for (Producto p : productos) {
        if (p.getCantidad() > max.getCantidad()){
            max = p;
        }
    }
    return max;
}
public void filtrarProductosPorPrecio(double min, double max){
    System.out.println("Productos con precio entre: " + min + " y $" + max );
    for (Producto p : productos){
        if (p.getPrecio() >= min && p.getPrecio() <= max){
            p.mostrarInfo();
        }
    }
}

public void mostrarCategoriasDisponibles(){
    System.out.println("Categorias disponibles: ");
    for (CategoriaProducto c: CategoriaProducto.values()){
        System.out.println("- " + c + ": " + c.getDescripcion());
    }
}
}
