
package practico_3_poo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {


    public static void main(String[] args) {
       Estudiante e1 = new Estudiante();
       e1.nombre= "Eugenia";
       e1.apellido = "Demarchi";
       e1.curso = "Programacion_2";
       e1.calificacion = 7.70;
       
       e1.mostrarInfo();
       e1.subirCalificacion(1.2);
       e1.mostrarCalificacion();
       e1.bajarCalificacion(0.7);
       e1.mostrarCalificacion();

       /////////////////////
       Mascotas m1 = new Mascotas();
       m1.nombre = "Nino";
       m1.especie = " Can ";
       m1.edad = 15;
       
       m1.mostrarInfo();
       
        for (int i = 0; i < 4; i++) {
       m1.cumplirAnios();
       m1.mostrarEdad();       
        }
     
        /////////////////////
        Libro l1 = new Libro();
        
        l1.setAutor("Pizarnik");
        l1.setTitulo("La condesa Sangrienta");
        
        l1.setAnioPublicacion(3000);
        l1.setAnioPublicacion(1999);
        l1.mostrarInfo();
        
        ///////////////////////
       Gallina g1 = new Gallina();
       Gallina g2 = new Gallina();
   
       g1.setIdGallina(1);
       g2.setIdGallina(2);
       
       g1.setEdad(1);
       g2.setEdad(2);
       
       //coloco un valor, como si ya hubiesen puesto X numero de huevos.
       g1.setHuevosPuestos(3);
       
       g1.ponerHuevo();
       g2.ponerHuevo();
       
       g1.envejecer();
       g2.envejecer();
        
       g1.mostrarEstado();
       g2.mostrarEstado();
        
       ////////////////////////////
       NaveEspacial n1 = new NaveEspacial();
       
       n1.setNombre("LaPoderosa");
       n1.setCombustible(50);
       n1.despegar();
       n1.avanzar(100);
       n1.avanzar(30);
       n1.mostrarEstado();
       
       
    }

}
