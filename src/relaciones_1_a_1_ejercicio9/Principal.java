
package relaciones_1_a_1_ejercicio9;


public class Principal {
    public static void main(String[] args) {
Paciente p1 = new Paciente("Eugenia", "Omint");
CitaMedica c1= new CitaMedica("22/11/25", "10.45");
Profesional profesional1 = new Profesional ("Carla Dambrosio","Ginecologia");  
p1.setCitaMedica(c1);
        System.out.println(p1);
        System.out.println("La fecha de la cita del paciente  " + p1.getNombre() + " es : " + p1.getFechaCitaMedica());
        profesional1.setCitaMedica(c1);
        System.out.println(profesional1);
    }
}