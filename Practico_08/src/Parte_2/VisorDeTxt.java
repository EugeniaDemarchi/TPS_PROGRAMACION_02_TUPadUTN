
package Parte_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
3.	Lectura de archivo ○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
 */
public class VisorDeTxt {
    public void mostrarTxt(String ruta){
        java.io.File elArchivo = new java.io.File(ruta);
        
        
  // try-with-resources para cerrar automáticamente el BufferedReader
        try ( BufferedReader br = new BufferedReader(new FileReader(elArchivo))) {
String linea;
while ((linea = br.readLine()) != null) {
    System.out.println(linea);
}
    } catch (FileNotFoundException fnfe){
         System.out.println("Archivo no encontrado: " + ruta);
          } 
        catch(IOException ioe){
            System.out.println("Error E/S: " + ioe.getMessage());
        }
       
        }
}
