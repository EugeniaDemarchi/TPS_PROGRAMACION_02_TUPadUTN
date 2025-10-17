
package ejercicio_03;

import java.util.ArrayList;

/**
3. Empleados y polimorfismo
 ● Clase abstracta: Empleado con método calcularSueldo() 
● Subclases: EmpleadoPlanta, EmpleadoTemporal 
● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar 
 */
public class Principal {
      public static void main(String[] args) {
ArrayList<Empleado> empleados = new ArrayList<>();

empleados.add(new EmpleadoPlanta(2000.0,"Jorge"));
empleados.add(new EmpleadoTemporal(70, 200, "Luisa"));


for (Empleado e : empleados) {
    String tipo = (e instanceof EmpleadoPlanta) ? "Planta" : "Temporal";
    System.out.println(tipo + " - " + e.getNombre() + " - Sueldo: " + e.calcularSueldo());
}
}
}
