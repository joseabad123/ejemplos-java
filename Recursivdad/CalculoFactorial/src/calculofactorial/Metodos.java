/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofactorial;

/**
 *
 * @author Jose Abad
 */
public class Metodos {
    
    public double factorial (double numero){ // se envía un argumento para factorial
        if (numero <= 1){ // Los factoriales de 1 y 0 son iguales a 1 (se contará desde 0 en el for)
            return 1; // Es el caso base de este ejercicio
        } else {
            return numero * factorial (numero - 1); // Para calcular los factoriales del 2 en 
            // adelante se volverá a hacer todo el proceso desde el factorial 0 para ir obteniendo los valores de los factoriales anteriores
        }
    }

    public void mostrarFactoriales () {
    
        for (int contador=0; contador<=10; contador++){
            System.out.printf("%d! = %.0f\n", contador, factorial(contador));
        }
        
    }
}
