
package tareatema4parte1;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        // Supplier que nos devuelva un numero leído por pantalla  
        
        Supplier <Integer> numeroPorPantalla  = () -> {
            
            System.out.println("Escriba un número entero por pantalla ");
            //Devolvemos directamente el número introducido por el usuario
            return new Scanner (System.in).nextInt();
        };
        
        //Lo asignamos a una variable, mediante la que haremos la comprobación
        //Usamos el método .get de Supplier
        int numero = numeroPorPantalla.get();
        
        // Predicate esPrimo para comprobar si un número es primo
        Predicate <Integer> esPrimo = numeroComprobado -> { 
           //Bucle desde 2 hasta la raiz cuadrada del número a comprobar
           for (int i = 2; i <= Math.sqrt(numeroComprobado); i++) {
            /* Comprobamos si el número es divisible por cualquier otro número antes 
            de llegar a la raiz cuadrada */  
            if (numeroComprobado % i == 0) {
                return false;
            }
        }
            //Si llegamos a la raiz cuadrada, devolvemos true   
            return true;     
        };
        
        if (esPrimo.test(numero)) {
            System.out.println("El número generado por el supplierPantalla " + numero + " es primo");
                       
        } else {
            System.out.println("El número generado por el supplierPantalla " + numero + " no es primo");
        }
       
    }

}
    