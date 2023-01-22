package tareatema4parte1;

import java.util.Scanner;


public class Ejercicio6 {
    //Calculamos la serie de Fibonacci de manera recursiva
    public static int fibonacciRecursivo(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
		return 1;
		}
        
        return fibonacciRecursivo(n-2) + fibonacciRecursivo(n-1);
        
    }
    
    //Lo probamos en un main que pide la cantidad de números que hay que mostrar en la serie al usuario
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números que generar en la sucesión: ");
	int sucesion = sc.nextInt();
        
	System.out.print("Serie de Fibonacci de " + sucesion + " numeros: ");
        
        //Los números se van escribiendo mediante un for loop que utiliza la función fibonacciRecursivo
	for(int i = 0; i < sucesion; i++){
			System.out.print(fibonacciRecursivo(i) + ", ");
		}
	}
}

