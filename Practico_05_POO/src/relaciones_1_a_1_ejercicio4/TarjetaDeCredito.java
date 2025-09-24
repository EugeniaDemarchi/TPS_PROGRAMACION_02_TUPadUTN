
package relaciones_1_a_1_ejercicio4;

public class TarjetaDeCredito {
private String numero;
private String fechaDeVencimiento;
private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaDeVencimiento) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

//Funcion setter con validacion antibucle:

    public void setCliente(Cliente cliente) {
        if (this.cliente != cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
}
//Funcion getter para acceder a datos relacionados:
public Cliente getCliente(){
    return cliente;
}

    public String getNumero() {
        return numero;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}