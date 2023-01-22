
package tareatema4parte1;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        /* Usamos el interface Supplier numeroPorPantalla del ejercicio anterior y
        lo transformamos para que recoja un decimal. */
        Supplier <Double> numeroPorPantalla  = () -> {
                        System.out.println("Escriba un número decimal por pantalla ");
            //Devolvemos directamente el número introducido por el usuario
            return new Scanner (System.in).nextDouble();
        };
        
        //recogemos el número
        double numero = numeroPorPantalla.get();
        
        /*Creamos un interface Function funcionTrigo para decimales para calcular
        la función (seno(x)^2 + cos(x)^3)/5 */
        Function <Double,Double> funcionTrigo = x -> {
            double resultado = ((Math.pow(Math.sin(x), 2)) + Math.pow(Math.cos(x), 3)) / 5; 
            return resultado;
        };
        
        /*Creamos un interface Function cifrasNumero para decimales que nos
        devuelva un entero con el número de cifras enteras tiene un número con
        la instrucción do While.*/
        Function <Double, Integer> cifrasNumero = x -> {
            int cifras = 0;
            //Usamos Math.floor para quedarnos con la parte entera
            x = Math.floor(x);
            //Utilizamos un do while que divide entre 10 en cada vuelta del bucle y suma 1 a cifras. 
            do {
                x /= 10;
                cifras++; 
            } while (x >= 1); 
            return cifras;    
        };
        
        //Consumer para escribir por pantalla los resultados
        Consumer <String> escribePantalla = x -> System.out.println(x);
        
         // Aplica la funcion trigonometrica al numero
        double resultado = funcionTrigo.apply(numero);
        escribePantalla.accept("El resultado de aplicar la función trigonométrica al numero " + numero + " es " + resultado);
        
        // Aplica la funcion cifrasNumero al numero
        int cifras = cifrasNumero.apply(numero);
        escribePantalla.accept("El numero total de cifras del numero " + numero + " es " + cifras);
        
    }
}
