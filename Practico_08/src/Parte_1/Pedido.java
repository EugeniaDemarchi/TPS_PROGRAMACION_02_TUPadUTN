
package Parte_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
3.	Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido. 
 */
public class Pedido implements Pagable{
private List<Producto> productos = new ArrayList<>();
private List<Cliente> clientes = new ArrayList<>();
private String estado;


public void agregarCliente(Cliente cliente) {
    clientes.add(cliente);
}
public void agregarProducto(Producto producto) {
    productos.add(producto);
}
    @Override
    public double calcularTotal() {
    double acu = 0;
        for (Producto p : productos){
            acu += p.calcularTotal();
        }
    return acu;
    }

  
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
for (Cliente c : clientes) {
    c.notificar("Tu pedido con total $" + calcularTotal() +
                " ha cambiado de estado a: " + nuevoEstado);
}
    }
}
