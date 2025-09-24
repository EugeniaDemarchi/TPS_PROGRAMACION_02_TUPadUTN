
package relaciones_1_a_1_ejercicio4;


public class Banco {
private String nombreBanco;
private String cuit;
private TarjetaDeCredito tarjetaDeCredito; //atributo agregacion


    public Banco(String nombre, String cuit) {
        this.nombreBanco = nombre;
        this.cuit = cuit;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + ", cuit=" + cuit + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getCuit() {
        return cuit;
    }
}
