
package relaciones_1_a_1_ejercicio6;

public class Reserva {//clase contenedora de la agregacion
private String fecha;
private String hora;
private Cliente cliente;//Atributo de relacion
private Mesa mesa;//atributo de la agregacion


    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
//Funcion setter para establecer relacion
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Funcion getter para acceder a datos relacionados
    public String getNombreCliente(){
        return cliente !=null ? cliente.getNombre() : "Sin cliente";
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + '}';
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    //Funcion setter para establecer la agregacion: 
    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }
    
    public Mesa getMesa(){
        return mesa;
    }
}
