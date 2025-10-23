
package Parte_1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PayPal implements PagoConDescuento{
    @Override
    public double procesarPago(double monto) {
    System.out.println("Pago procesado: " + monto);
    return monto;
    }
    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
         return monto * (1 - porcentaje / 100);
    }
}
