package Ejercicio03;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }

        // Si ya tenía un profesor, lo desvinculo
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = p; // ← corrección

        // Vinculo este curso al nuevo profesor, si no lo tenía
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: [Sin asignar]");
        }
        System.out.println("---------------------------------------");
    }
}

