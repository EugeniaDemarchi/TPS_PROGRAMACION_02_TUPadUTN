
package Parte_1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Cliente implements Notificable{

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para cliente " + mensaje);
    }
}
