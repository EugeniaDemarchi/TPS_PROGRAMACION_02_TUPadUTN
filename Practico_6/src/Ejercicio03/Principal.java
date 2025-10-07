
package Ejercicio03;


public class Principal {
public static void main(String[] args) {
             Universidad u = new Universidad("UNLa");

        Profesor p1 = new Profesor("P001", "Ana García", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "Carla Gómez", "Base de Datos");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "POO");
        Curso c3 = new Curso("C003", "SQL");
        Curso c4 = new Curso("C004", "Redes");
        Curso c5 = new Curso("C005", "Taller Web");

        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        u.asignarProfesorACurso("C002", "P002");
        u.asignarProfesorACurso("C003", "P003");
        u.asignarProfesorACurso("C005", "P002");

        System.out.println("=== Listado inicial ===");
        u.listarCursos();
        u.listarProfesores();

        System.out.println("\n=== Cambio de profesor ===");
        c3.setProfesor(p1); // cambiamos el profe de SQL
        u.listarCursos();

        System.out.println("\n=== Eliminamos curso C005 ===");
        u.eliminarCurso("C005");
        u.listarProfesores();

        System.out.println("\n=== Eliminamos profesor P002 ===");
        u.eliminarProfesor("P002");
        u.listarCursos();
  }
}
