package tareatema4parte1;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Supplier para generar un número aleatorio entre 1 y 50;
        Supplier<Integer> aleatorioCincuenta  = () -> {
           Random aleatorio = new Random();
           return aleatorio.nextInt(50) + 1; //Excluímos el 0
        };
        
        //Predicate para comprobar si el número es divisible por 5       
        Predicate<Integer> divisiblePorCinco = divisible -> {
            if (divisible % 5 == 0) {
                System.out.println("Numero supplier aleatorioCincuenta " + divisible + " es divisible por 5");
            } else {
                System.out.println("Numero supplier aleatorioCincuenta " + divisible + " no es divisible por 5");
            }
            
         return true;
        };
    
        //Predicate para comprobar si el número es mayor que 5 y menor que 30
        Predicate<Integer> menorQue30 = menorMayor -> {
            if (menorMayor > 5 && menorMayor < 30) {
                System.out.println("Numero supplier aleatorioCincuenta " + menorMayor + " es mayor que 5 y menor que 30");
            } else {
                System.out.println("Numero supplier aleatorioCincuenta " + menorMayor + " no es mayor que 5 y menor que 30");
            }
            
           return true;  
        };
        
        
        Predicate<Integer> combinaDos = divisiblePorCinco.and(menorQue30);
        
        
       int numero = aleatorioCincuenta.get();
       
       if (combinaDos.test(numero)) {
        System.out.println("Numero supplier aleatorioCincuenta " + numero + " no es mayor que 5 y menor que 30 o no es divisible por 5");
         
       } else {
        System.out.println("Numero supplier aleatorioCincuenta " + numero + " es mayor que 5 y menor que 30 y divisible por 5");
       }
      
    }
}
