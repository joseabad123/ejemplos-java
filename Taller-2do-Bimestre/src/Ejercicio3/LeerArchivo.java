/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Jose Abad
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivo {
  
    
    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estudiantes.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
       
       
        try // lee registros del archivo, usando el objeto Scanner
        {
            EscrituraArchivo d = new EscrituraArchivo ();
           
            d.abrir_archivo();
            
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                //System.out.println(linea);
                
                ArrayList<String> estudiantes = new ArrayList<String>(Arrays.asList(linea.split("\\|")));
                
                String nombre = estudiantes.get(0);
                String apellido = estudiantes.get(1);
                
                int edad = Integer.parseInt(estudiantes.get(2));  
                int newedad = ( 2016 - edad );
                        
                d.agregar_informacion(nombre, apellido, newedad);
     
            
            }
            d.cerrar_archivo();
            } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto
