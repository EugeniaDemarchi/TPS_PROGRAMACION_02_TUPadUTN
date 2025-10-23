
package Parte_1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public  class TarjetaCredito implements PagoConDescuento{
   @Override
    public double aplicarDescuento(double monto, double porcentaje) {
         return monto * (1 - porcentaje / 100);
    }
    @Override
    public double procesarPago(double monto) {
       System.out.println("Pago procesado: " + monto);
    return monto;
    }
}
