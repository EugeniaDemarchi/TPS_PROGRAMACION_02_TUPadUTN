
package Dependencia_Creacion.ejercicio_13;


public class GeneradorQR {
//no hay atributo codigoQR
    
  // Dependencia de creación: Genera un CodigoQR TEMPORAL

            public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        
       //Validacion
if (validarCodigo(nuevoCodigo)){
    nuevoCodigo.guardarEnBD();
    System.out.println("Codigo creado exitosamente");
    return nuevoCodigo;
}
//eL objeto nuevoCodigo SE DESTRUYE al finalizar el metodo
System.out.println("Error: no se puede crear el codigo");
return null;
    }

private boolean validarCodigo(CodigoQR codigo){
    return codigo.getValor() != null && !codigo.getValor().isEmpty();
}    
}
