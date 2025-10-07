package Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos disponibles asignados al profesor " + nombre);
        } else {
            System.out.println("Cursos dictados por " + nombre + ":");
            for (Curso c : cursos) {
                System.out.println("- " + c.getCodigo() + ": " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
}

