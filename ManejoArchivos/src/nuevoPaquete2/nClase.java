package nuevoPaquete2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class nClase {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("calificaciones2.txt"));
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
            double promedio = 0.0;
            while (entrada.hasNext()) {
                
                String linea = entrada.nextLine();
    
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                Persona per = new Persona(linea_partes.get(0), linea_partes.get(1),
                        Integer.parseInt(linea_partes.get(2)), Integer.parseInt(linea_partes.get(3)));

                System.out.printf("%s\t%s\t\t%d\t%d\tPromedio: %f\n", per.getNombre(), per.getApellido(),
                        per.getCal1(), per.getCal2(), per.promedio());

                if (promedio < per.promedio()) { //comparacón de promedio
                    promedio = per.promedio(); //asignación del valor más alto
                }

            } // fin de while
            System.out.printf("\nMejor promedio: %f\n", promedio);

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

