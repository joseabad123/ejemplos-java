/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Jose Abad
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LecturaPaises {

    private Scanner entrada;
    

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("paises.txt"));
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
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                ArrayList <String> paises = new ArrayList<String>(Arrays.asList(linea.split(",")));

                boolean v = paises.get(0).contains("u");
                boolean v2 = paises.get(0).contains("U");

                if (v == true || v2 == true) {
                    System.out.printf("%s %s\n", paises.get(0), paises.get(1));
                }

            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
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
