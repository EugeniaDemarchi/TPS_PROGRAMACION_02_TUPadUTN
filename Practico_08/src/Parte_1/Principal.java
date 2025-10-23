
package Parte_1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Pedido p = new Pedido();
Cliente perez = new Cliente();
ProductoNormal cartera =new ProductoNormal ("cartera", 70000); 
p.agregarProducto(cartera);
p.agregarCliente(perez);
p.setEstado("Entregado");
    }

}
