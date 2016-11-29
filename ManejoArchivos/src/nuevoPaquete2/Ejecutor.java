/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoPaquete2;

/**
 *
 * @author Jose Abad
 */
public class Ejecutor {

    public static void main(String args[]) {
        
        nClase app = new nClase();//creación de objeto de tipon nClase

        app.abrirArchivo();
        app.leer_informacion();
        app.cerrarArchivo();
    } //

}
