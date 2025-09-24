
package Dependencia_Uso.ejercicio12;


public class Impuesto {//asociacion 1 a 1 con Contribuyente
private double monto;
private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

public void setContribuyente(Contribuyente contribuyente){
    this.contribuyente =contribuyente;
}
//Funcion getter para acceder a datos relacionados

public String getNombreContribuyente(){
    return contribuyente != null ? contribuyente.getNombre() : "Sin nombre";
}

//getters para que el metodo calcular los llame

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
}
