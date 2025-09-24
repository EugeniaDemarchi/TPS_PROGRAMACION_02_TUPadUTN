
package relaciones_1_a_1_ejercicio2;


public class Celular {
private String imei;
private String marca;
private String modelo;
private Bateria bateria; //Atributo de agregacion
private Usuario usuario; //Atributo bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

//Funcion setter para establecer agregacion:
    public void setBateria(Bateria bateria){
        this.bateria = bateria;
    }

//Funcion getter para acceder a la bateria:

    public Bateria getBateria() {
        return bateria;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    //Funcion setter con validacion antibucle:
    public void setUsuario(Usuario usuario){
        if (this.usuario != usuario){
            this.usuario = usuario;
            if (usuario != null && usuario.getCelular() != this){
                usuario.setCelular(this);//Establece relacion bidireccional
            }
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
}
