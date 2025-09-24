
package relaciones_1_a_1_ejercicio8;
public class Principal {
public static void main(String[] args) {
    Documento doc1 = new Documento ("Contrato de locacion", "alquiler propiedad", "#456hhy", "12/12/25");
    Usuario u1 = new Usuario("Pedro", "pedro@hotmail.com");
   FirmaDigital f1 =new FirmaDigital("#456hhy", "12/12/25");
    doc1.mostrarInformacion();
   
    u1.setFirmaDigital(f1);
    System.out.println(u1.acceder());
}
}
