/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Jose Abad
 */
public class Ejecutor {

    public static void main(String[] args) {
        Factura factura = new Factura(); 
        factura.abrir_archivo();
        factura.agregar_informacion();
        factura.cerrar_archivo();
    }

}
