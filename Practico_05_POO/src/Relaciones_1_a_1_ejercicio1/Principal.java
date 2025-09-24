
package Relaciones_1_a_1_ejercicio1;


public class Principal {

    public static void main(String[] args) {
   
        //EJERCICIO 01
        Pasaporte p1 = new Pasaporte("899090", "29/09/86", "blob", "JPG" );
    Titular perez = new Titular ("Perez", "22787899");
    //ASOCIACION BIDIRECCIONAL: TITULAR----PASAPORTE
    p1.setTitular(perez); //perez.setPasaporte(p1); OPCION PARA CONECTAR LAS CLASES
    //MOSTRAMOS
        p1.mostrarPasaporte();
        
       

    }
}
