
package practico_04_poo_ii;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Empleado {
private int id;
private String nombre;
private String puesto;
private double salario;
private static int totalEmpleados= 0;

//2) Constructor copmpleto. Recibe todos los atributos como parametros
public Empleado(int id, String nombre, String puesto, double salario){
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario= salario;
    Empleado.totalEmpleados++;
}

//2)Constructor con nombre y puesto, id automatico y salario por defecto
public Empleado(String nombre, String puesto){
    Empleado.totalEmpleados++;
    this.id = Empleado.totalEmpleados;
    this.nombre = nombre; 
    this.puesto = puesto;
    this.salario = 1500.0;
}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    //Por si el empleado asciende
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }
//metodo estatico. 
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

public void setSalario(double salario){
    this.salario = salario;
}

//3)Metodos sobrecargados:

//metodo que recibe porcentaje de aumento
public void actualizarSalario(double porcentaje){
   this.salario += this.salario * (porcentaje / 100.0);
    
}

//metodo que recibe cantidad fija a aumentar
public void actualizarSalario(int monto){
   this.salario+= monto;
}

//5)Metodo estatico para mostrar total de empleados
public static void mostrarTotalEmpleados(){
    System.out.println("El total de empleados hasta el momento es de: "+ Empleado.totalEmpleados);
}

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }



}
