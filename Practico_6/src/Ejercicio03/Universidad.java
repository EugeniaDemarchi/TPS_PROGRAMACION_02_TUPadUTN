
package Ejercicio03;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
private String nombre;
private List<Profesor> profesores;
private List<Curso> cursos;

public Universidad(String nombre){
    this.nombre=nombre;
    this.profesores= new ArrayList<>();
    this.cursos = new ArrayList<>();
}

public void agregarProfesor(Profesor p){
    if (p !=null && !profesores.contains(p)){
        profesores.add(p);
    }
}

public void agregarCurso(Curso c){
    if (c !=null && !cursos.contains(c)){
        cursos.add(c);
    }
}
 public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
        }
    }

    public void eliminarCurso(String codigo) {
       Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.setProfesor(null); // romper relación
            }
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // dejar sin profesor los cursos que dictaba
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
}
