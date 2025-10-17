
package ejercicio_03;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class EmpleadoPlanta extends Empleado{
private double sueldo;

    public EmpleadoPlanta(double sueldo, String nombre) {
        super(nombre);
        this.sueldo = sueldo;
    }

  @Override
  public double calcularSueldo(){
      return sueldo;
  }



}
