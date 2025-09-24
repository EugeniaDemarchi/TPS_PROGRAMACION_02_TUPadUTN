
package relaciones_1_a_1_ejercicio10;

public class Titular {
private String nombre;
private String DNI;
private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

//Funcion setter con validacion anti-bucle
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        if (this.cuentaBancaria != cuentaBancaria){
            this.cuentaBancaria = cuentaBancaria;
            if (cuentaBancaria != null && cuentaBancaria.getTitular() != this){
                cuentaBancaria.setTitular(this);
            }
        }
    }

    
    //FUNCION GETTER PARA ACCEDER A DATOS RELACIONADOS:
    public CuentaBancaria getCuentaBancaria(){
        return cuentaBancaria;
    }
    

public String getCbuCuentaBancaria(){
 return cuentaBancaria != null  ? cuentaBancaria.getCbu() : "Sin CBU";
}
    
    public String getNombre() {
        return nombre;
    }   

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + ", cuentaBancaria=" + cuentaBancaria + '}';
    }
         }
