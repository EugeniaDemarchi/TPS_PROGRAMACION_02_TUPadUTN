
package practico_04_poo_ii;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {


    public static void main(String[] args) {
        // Instanciar con los dos constructores
        Empleado e1 = new Empleado(1, "Eugenia", "Frontend", 2000.0);
        Empleado e2 = new Empleado("Martin", "Tester");
        Empleado e3 = new Empleado("Ana", "Backend");

        // Mostrar empleados recién creados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Aplicar aumentos de salario
        e1.actualizarSalario(20.0); // % aumento
        e2.actualizarSalario(500);  // monto fijo

        // Mostrar empleados después de actualizaciones
        System.out.println("Después de aumentos:");
        System.out.println(e1);
        System.out.println(e2);

        // Mostrar total de empleados creados
        Empleado.mostrarTotalEmpleados();
    }
}

        
        
        /*
        Empleado e1 = new Empleado(1, "Eugenia", "frontend", 2000.0);
        System.out.println(e1);
  
        Empleado e2 = new Empleado("Martin", "tester");
        System.out.println(e2);
        
        e1.actualizarSalario(30.0);
        System.out.println("Con aumento del 30 % el empleado : "+ e1.getNombre() + " gana :" + e1.getSalario());
        
        e2.actualizarSalario(500);
        System.out.println("Con aumento fijo el empleado/a : "+ e2.getNombre()+ " gana :" + e2.getSalario());
        
        Empleado.mostrarTotalEmpleados();
        
        e1.setPuesto("u-x engeneer");
        System.out.println("El nuevo puesto de " + e1.getNombre() + " es " + e1.getPuesto() );
        System.out.println("El salario de " + e2.getNombre() + " ahora es de " + e2.getSalario());
        e2.actualizarSalario(20.0);
        e2.setPuesto("Fullstack");
        System.out.println("En su nuevo puesto de " + e2.getPuesto() + " gana " + e2.getSalario());
        System.out.println("El id de " + e1.getNombre() + " es " + e1.getId() );
      */

 
