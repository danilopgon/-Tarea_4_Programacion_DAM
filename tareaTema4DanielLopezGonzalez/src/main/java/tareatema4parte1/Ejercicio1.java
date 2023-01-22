package tareatema4parte1;
import java.util.Scanner;

//Declaramos la interfaz funcional propia
interface MiInterfazFuncional<Double> {
        public Double pruebaLambda (Double valor);
    }

 
      
public class Ejercicio1 {
  public static void main(String[] args) {
     
      
    //Expresion lambda para calcular el inverso o reciproco de un número + 1
    MiInterfazFuncional<Double> reciprocoMasUno = (Double valor) -> 1.0 / valor + 1;
     
      
    //Solicitamos un número por pantalla
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce un número decimal: ");
    double numero = sc.nextDouble(); 
  
 
      
    //Probamos con la interfaz funcional y escribimos el número por pantalla
    Double resultado = reciprocoMasUno.pruebaLambda(numero);
    System.out.println("Resultado de reciproco + 1 es: " + resultado);
    
    //Expresión lambda para calcular numero^3(numero+4)  
    MiInterfazFuncional<Double> calculoCubo = (Double valor) -> (Math.pow(valor, 3)) / (valor + 4);
   
    
    //Probamos con la interfaz funcional y escribimos el resultado por pantalla
    resultado = calculoCubo.pruebaLambda(numero);
    System.out.println("Resultado cubo de " + numero + " dividido por " + numero + " más 4 es: " + resultado);
    
    
    //Generamos un número aleatorio
    double random = Math.random();
    
    //Expresión lambda que calcule el cuadrado de un número dividido por un número aleatorio más cuatro
    MiInterfazFuncional<Double> calculoConAleatorio = (Double valor) -> (Math.pow(numero, 2)) / (random + 4);
    
    
    //Probamos con la interfaz funcional y escribimos el resultado por pantalla
    resultado = calculoConAleatorio.pruebaLambda(numero);
    System.out.println("Resultado cuadrado de " + numero + " dividido por el aleatorio " + random + " más 4 es: " + resultado);
    
    }
   
}   