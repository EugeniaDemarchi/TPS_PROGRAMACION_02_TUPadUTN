
package Parte_2.ejercicio4;

import java.util.Scanner;

/**
 *
4.	Excepción personalizada ○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje. 
 */
public class EdadInvalidaException extends Exception{

    public EdadInvalidaException() {
    }

    public EdadInvalidaException(String message) {
        super(message);
    }

    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdadInvalidaException(Throwable cause) {
        super(cause);
    }

}
