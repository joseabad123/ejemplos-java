/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Factura {
    

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrir_archivo() {
        try {
            salida = new Formatter("factura.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregar_informacion() {
        
        String continuar;
        double precio = 0;
        int cantidad = 0, i = 0;
        double subtotal = 0, total, iva;
        String producto = "";
        String datos = null; 
        String nombre = null; 
        String ciudad = null;
        // el archivo permite el ingreso
        // de edad, nombre, apellido de una persona

        Scanner entrada = new Scanner(System.in);
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar
                System.out.println("|||||||||||||||||||");
                System.out.println("|||||COMERCIAL|||||");
                System.out.println("|||||||||||||||||||\n");
                System.out.println("CLIENTE\n");
                System.out.print("Ingrese  Nombre: ");
                nombre = entrada.next();
                System.out.print("Ingrese Ciudad: ");
                ciudad = entrada.next();
                salida.format("\tComercial Ventas Y Reventas\n"
                        + "Nombre: %s\n"
                        + "Ciudad: %s\n"
                        + "-----------------------------------\n"
                        + "Producto\tCantidad\tPrecio\n", nombre, ciudad);
                do {
                    System.out.println("    **  MENÚ DE COMPRAS **\n"
                            + "1) Arroz; costo del kilo $2.50\n"
                            + "2) Azúcar; costo del kilo $1.50\n"
                            + "3) Aceite; costo $ 1.30 por unidad\n"
                            + "4) Tallarines; costo $ 1.50 por unidad\n"
                            + "5) Sal; costo del kilo $1.00");
                    System.out.print("Digite su opcion de compra: ");
                    
                    int opcion = entrada.nextInt();
                    
                    if (opcion == 1) {
                        System.out.print("Ingrese Cantidad: ");
                        cantidad = entrada.nextInt();
                        precio = cantidad * 2.5;
                        producto = "Arroz";
                    }
                    if (opcion == 2) {
                        System.out.print("Ingrese Cantidad: ");
                        cantidad = entrada.nextInt();
                        precio = cantidad * 1.50;
                        producto = "Azúcar";
                    }
                    if (opcion == 3) {
                        System.out.print("Ingrese Cantidad: ");
                        cantidad = entrada.nextInt();
                        precio = cantidad * 1.30;
                        producto = "Aceite";
                    }
                    if (opcion == 4) {
                        System.out.print("Ingrese Cantidad: ");
                        cantidad = entrada.nextInt();
                        precio = cantidad * 1.50;
                        producto = "Tallarin";
                    }
                    if (opcion == 5) {
                        System.out.print("Ingrese Cantidad: ");
                        cantidad = entrada.nextInt();
                        precio = cantidad * 1.00;
                        producto = "Sal";
                    }
                    subtotal += precio;
                    salida.format("%s\t\t%d\t%.2f\n", producto, cantidad, precio);
                    System.out.print("Desea Continuar con la Compra (si/no): ");
                    continuar = entrada.next();
                } while (continuar.equals("si"));
                
                iva = (subtotal * 0.14);
                total = iva + subtotal;
                // escribe el nuevo registro (escribe en el archivo
                salida.format("-----------------------------------\n" +
                        "\tSubtotal: %.2f\n" +
                        "\tIVA 14: %.2f\n" +
                        "\tTotal: %.2f\n", subtotal, iva, total);
            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del método agregarRegistros

// cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
 }
