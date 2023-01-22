
package tareatema4parte1;
import java.util.Scanner;

interface MiInterfazFuncionalBloque<Integer> {
    public Integer pruebaLambdaBloque (Integer valor);
}


public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Pedimos un número por pantalla
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();  
        
        
        /*Escribimos una expresión lambda que escriba la lista de los n primeros números pares, 
        calcule la suma de los n primeros números pares y la muestre por pantalla*/
        
        MiInterfazFuncionalBloque<Integer> numerosPares = (Integer valor) -> {
            //Almacenamos los números pares en un array para poder mostrarlos en el formato correcto
            int[] pares = new int [numero];
            int i = 0;
            int x = 0;
            int suma = 0;
            System.out.print("Los " + numero + " primeros números pares son: ");
            
            //Recorremos el bucle hasta que alcanzamos el valor indicado por el usuario
            while (i < numero) {
                int par = 2 * i;
                pares [i] = par;
                suma += par;
                i++;
             }
            
            //Usamos un segundo bucle while para escribir los números del array separados por comas
            while  (x < numero) {
                if (x == numero - 1) {
                    System.out.println(pares[x] + ". ");
                } else {
                    System.out.print(pares[x] + ", ");
                }
              x++;
            }
            
            System.out.println("La suma de los " + numero + " primeros números pares es: " + suma); 
            return suma;
        };
                 
       numerosPares.pruebaLambdaBloque(numero);
       
    
       /*Escribimos una interfaz lambda que escriba los números primos entre 1 y n que acaben en 3*/
       
      MiInterfazFuncionalBloque<Integer> numerosPrimos = (Integer valor) -> {
           //Almacenamos los números primos en un array para poder mostrarlos en el formato correcto
          int [] arrayPrimos = new int [numero];
          int suma = 0;
          System.out.print("La serie de los " + numero + " primeros numeros primos que acaban en 3 es: ");
         
          
          
          
          //Utilizamos un bucle for para escribir los números primos
          int contador = 0;
          for (int i = 3; contador < numero; i++) {
              if (esPrimo(i) && acabaEnTres(i)) { // utilizamos booleans para realizar la comprobación
                  arrayPrimos [contador] = i;
                  suma += i;
                  contador++;
              }
       
            }
          
          //Utilizamos otro for loop para escribir los números del array separados por comas
          for (int x = 0; x < numero; x++) {
              if (x == numero - 1) {
                    System.out.println(arrayPrimos[x] + ". ");
                } else {
                    System.out.print(arrayPrimos[x] + ", ");
                }
            }
          
          
            System.out.println("Y la suma de los " + numero + " primeros números primos es: " + suma); 
            return suma;
        }; 
      
      numerosPrimos.pruebaLambdaBloque(numero);
    }     
   
    //Establecemos booleans para comprobar las condiciones de los números primos
    
    //Comprobamos si el número es primo buscando sus divisores, si el loop no los encuentra devuelve true
    public static boolean esPrimo(int x) {
        if (x < 2) return false;
        for (int i = 2; i < x; i++) {
          if (x % i == 0) return false; 
        }
        return true;
    }
    
    //Comprobamos si el número acaba en 3  mediante el operador %
    public static boolean acabaEnTres(int x) {
        return x % 10 == 3;
    }
    
}