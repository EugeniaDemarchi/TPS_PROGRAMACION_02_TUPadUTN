
package Dependencia_Creacion.ejercicio_13;


public class Principal {
     public static void main(String[] args) {

         Usuario usuario = new Usuario("Luis Kike", "kike@gmail.com");
         Usuario usuarioParaCreacion = new Usuario("Luisa Li", "luli@gmail.com");         
         CodigoQR codigo = new CodigoQR("888", usuario);

    
        //establezco la relacion unidireccional:
        codigo.setUsuario(usuario);
        System.out.println(codigo);
         
         //implementacion de dependencia de Creacion:
         //Crear generador
         GeneradorQR generador = new GeneradorQR();
         
         //generar codigo 
         CodigoQR codigo2 = generador.generar("111", usuarioParaCreacion);
   
         System.out.println(codigo2);
         
     }
}
