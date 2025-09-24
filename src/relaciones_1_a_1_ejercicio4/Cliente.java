
package relaciones_1_a_1_ejercicio4;

public class Cliente {
private String nombre;
private String DNI;
private TarjetaDeCredito tarjetaDeCredito;//Bidireccionalidad

    public Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

//Funcion setter con validacion antibucle:

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetDeCredito ) {
        if (this.tarjetaDeCredito != tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetDeCredito;
        if (tarjetDeCredito != null && tarjetDeCredito.getCliente() != this){
            tarjetDeCredito.setCliente(this);
        }
    }
}
//Funcion getter para acceder a datos relacionados:
public TarjetaDeCredito getTarjetaDeCredito(){
    return tarjetaDeCredito;
}

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }
}
