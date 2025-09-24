
package relaciones_1_a_1_ejercicio2;

public class Principal {

    public static void main(String[] args) {
        Bateria bateria = new Bateria("EB-BG991ABY", "4000 mAh");
        Celular celular = new Celular("356789102345678", "Samsung", "Galaxy21");
        Usuario usuario = new Usuario("Eugenia Demarchi", "3389990");
        
        //Establecer agregacion:
        celular.setBateria(bateria);
        System.out.println("El celular " + celular.getModelo() + " tiene una bateria " + bateria.getModelo() + " con capacidad " + bateria.getCapacidad());
        
        //relacion bidireccional: Usar una de las funciones setter (la relacion se establece automaticamente en ambos sentidos)
        usuario.setCelular(celular);
        
//Ver el toString() -no debe ir toString en Usuario tb porque se genera recursion infinita
        System.out.println(celular);
        
        // Ver desde el celular quién es su usuario
System.out.println("Usuario del celular: " + celular.getUsuario().getNombre());
        
// Ver desde el usuario cuál es su celular
System.out.println("Celular del usuario: " + usuario.getCelular().getMarca());

    }
}
