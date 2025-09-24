
package relaciones_1_a_1_ejercicio8;


public class Usuario {
private String nombre;
private String email;
private FirmaDigital firmaDigital;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    
    
    
//fUNCION SETTER PARA ESTABLECER LA AGREGACION:
    public void setFirmaDigital(FirmaDigital firmaDigital){
        this.firmaDigital = firmaDigital;
    }

public FirmaDigital getFirmaDigital(){
    return firmaDigital;
}

//Funcion que usa la clase agregada:
public String acceder() {
    if (firmaDigital != null) {
        return "Hash: " + firmaDigital.getCodigoHash() + ", Fecha: " + firmaDigital.getFecha();
    } else {
        return "Documento sin firma";
    }
}
}
