
package ejercicio_01;

/**
1. Vehículos y herencia básica 
● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo() 
● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo() 
● Tarea: Instanciar un auto y mostrar su información completa. 

 */
public class Principal {

 
    public static void main(String[] args) {
Auto a = new Auto(2, "Peugeot", "306");
Auto b = new Auto(4, "Honda", "Civic");
a.mostrarInfo();
b.mostrarInfo();
    }
}
