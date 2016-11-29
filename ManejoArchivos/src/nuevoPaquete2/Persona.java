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
public class Persona {
    
    private String nombre;
    private String apellido;
    private int cal1;
    private int cal2;

    public Persona(String n, String ap, int c1, int c2) {
        nombre = n;
        apellido = ap;
        cal1 = c1;
        cal2 = c2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ap) {
        apellido = ap;
    }

    public int getCal1() {
        return cal1;
    }

    public void setCal1(int calf1) {
        cal1 = calf1;
    }

    public int getCal2() {
        return cal2;
    }

    public void setCal2(int calf2) {
        cal2 = calf2;
    }
    
    public double promedio (){
        double pro = (getCal1()+getCal2())/2;
        return pro;
    }
    
    
}
