
package relaciones_1_a_1_ejercicio10;

public class CuentaBancaria {
private String cbu;
private String saldo;
private ClaveSeguridad claveSeguridad;// atributo de composicion
private Titular titular; // atributo de asociacion bidireccional

public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion){
    this.cbu = cbu;
    this.saldo = saldo;
    //Creacion directa de la parte
    this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
}

//Getter para acceder a la parte
public ClaveSeguridad getClaveSeguridad(){
    return claveSeguridad;
}

//fUNCION QUE UTILIZA LA PARTE:
public void mostrarInformacion(){
    System.out.println("La cuenta con CBU: " + cbu);
    claveSeguridad.mostrar();
}

    public String getCbu() {
        return cbu;
    }
//Para la asociacion bidireccional: funcion setter con validacion antibucle:
    public void setTitular(Titular titular){
        if (this.titular != titular){
            this.titular = titular;
            if (titular != null && titular.getCuentaBancaria() != this){
                titular.setCuentaBancaria(this);
            }
        }
    }
    //Funciopn getter para acceder a datos relacionados
    public Titular getTitular(){
        return titular;
    }
    
    public String getNombreTitular(){
        return titular !=null ? titular.getNombre() : "Sin nombre";
    }
    

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + '}';
    }
}
