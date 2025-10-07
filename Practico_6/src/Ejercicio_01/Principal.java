
package Ejercicio_01;

public class Principal {

  
    public static void main(String[] args) {
   Inventario inv = new Inventario();
        
   //1)Crear 5 productos con diferentes categorias y agregarlos:
   inv.agregarProducto(new Producto("P1", "Chocolate", 1000, 3, CategoriaProducto.ALIMENTOS));
    inv.agregarProducto(new Producto("P2", "Parlante", 5000, 5, CategoriaProducto.ELECTRONICA));
     inv.agregarProducto(new Producto("P3", "Tapado", 9800, 13, CategoriaProducto.ROPA));
      inv.agregarProducto(new Producto("P4", "Alfombra", 77000, 7, CategoriaProducto.HOGAR));
       inv.agregarProducto(new Producto("P5", "Platos", 33800, 5, CategoriaProducto.HOGAR));
   
       //2)Listar productos
      // inv.listarProductos();
        
       //3)bUSCAR PRODUCTOS POR id:
//        System.out.println("\nBuscando producto con ID P3: ");
//        Producto buscado = inv.buscarProductoPorId("P3");
//        if (buscado !=null) buscado.mostrarInfo();
    
//4)Filtrar por categoria:
    //inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
    
    //5) Eliminar un producto por su ID y listar los productos restantes.  
    //inv.eliminarProducto("P5");
    //inv.listarProductos();
    
    //6. Actualizar el stock de un producto existente.  
   // inv.actualizarStock("P1", 10);
    
    //7. Mostrar el total de stock disponible.  
//    int totalStock =inv.obtenerTotalStock();
//        System.out.println("Total de unidades en stock: " + totalStock);
    
        
//8. Obtener y mostrar el producto con mayor stock.  
//Producto productoMayorStock = inv.obtenerProductoConMayorStock();
//   if (productoMayorStock != null){
//        System.out.println("Producto con mayor stock: ");
//        productoMayorStock.mostrarInfo();
//   } else {
//       System.out.println("No hay productos en el inventario.");
//   }

//9. Filtrar productos con precios entre $1000 y $3000.  
//inv.filtrarProductosPorPrecio(1000, 3000);


//10. Mostrar las categorías disponibles con sus descripciones.  
inv.mostrarCategoriasDisponibles();

    }
}
