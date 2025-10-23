
package Parte_2.ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
5.	Uso de try-with-resources ○ Leer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente.
 */
public class VisorDeArchivo {
  public void mostrarTxt(String ruta){
        File elArchivo = new File(ruta);

        try ( BufferedReader   br = new BufferedReader(new FileReader(elArchivo))) {
    System.out.println(br.readLine());
    } catch (IOException e){
            System.out.println("Error E/S " + e.getMessage());
          } 
       
        }
    }

