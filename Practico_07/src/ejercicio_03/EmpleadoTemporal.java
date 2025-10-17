
package ejercicio_03;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class EmpleadoTemporal extends Empleado{
private double sueldoPorHora;
private int cantidadHorasTrabajadas;

    public EmpleadoTemporal(double sueldoPorHora, int cantidadHorasTrabajadas, String nombre) {
        super(nombre);
        this.sueldoPorHora = sueldoPorHora;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }


  @Override
  public double calcularSueldo(){
      return sueldoPorHora * cantidadHorasTrabajadas;
  }
}
