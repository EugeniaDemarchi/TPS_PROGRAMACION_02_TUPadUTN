
package Dependencia_Creacion.ejercicio_13;


public class CodigoQR {
private String valor;
private Usuario usuario;


public CodigoQR(String valor, Usuario usuario){
    this.valor = valor;
    this.usuario = usuario;
   
}

public String getValor(){
    return valor;
}

    public Usuario getUsuario() {
        return usuario;
    }

//metodo para la validacion de la creacion:
public void guardarEnBD(){
    System.out.println("codigo guardado: " + valor);
}


//Funcion setter para establecer la relacion:
public void setUsuario(Usuario usuario){
    this.usuario = usuario;
}

//getter para acceder a datos relacionados
public String getNombre(){
    return usuario != null ? usuario.getNombre() : "Sin pasaporte";
}

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
}
