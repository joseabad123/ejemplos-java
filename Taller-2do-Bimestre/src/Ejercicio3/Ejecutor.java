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
public class Ejecutor {

    public static void main(String[] args) {

        LeerArchivo aplicacion = new LeerArchivo();

        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
    }

}
