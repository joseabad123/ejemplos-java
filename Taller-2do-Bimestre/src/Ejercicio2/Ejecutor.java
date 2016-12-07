/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Jose Abad
 */
public class Ejecutor {

    public static void main(String[] args) {

        LecturaEstudiantes app = new LecturaEstudiantes();

        app.abrirArchivo();
        app.leer_informacion();
        app.cerrarArchivo();

    }

}
