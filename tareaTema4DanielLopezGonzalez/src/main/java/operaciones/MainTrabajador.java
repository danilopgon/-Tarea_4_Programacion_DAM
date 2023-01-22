/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import datos.*;

import java.util.Scanner;

import almacenes.ConstantesAlmacen;

/**
 *
 * @author carlo
 */



public class MainTrabajador {
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        int categoria;
        int antiguedad;
        
        //LECTURA DE DATOS DE EMPLEADO:
        System.out.printf("Introduce el nombre: ");        
        nombre=sc.nextLine();
        
        System.out.printf("Introduce la edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        
        System.out.printf("Introduce la categoría (0 a 3): ");
        categoria = sc.nextInt();
        sc.nextLine();
        
         System.out.printf("Introduce la antiguedad (0 a 2): ");
        antiguedad = sc.nextInt();
        sc.nextLine();
        
        //LECTURA DE LA FECHA
        
        System.out.println("FECHA DE ALTA: ");
        System.out.printf("\tIntroduce el dÍa: ");
        int dia = sc.nextInt();
        sc.nextLine();

        System.out.printf("\tIntroduce el mes: ");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.printf("\tIntroduce el año: ");
        int anio = sc.nextInt();
        sc.nextLine();

        Fecha fec = new Fecha(dia, mes, anio);
        Trabajador t;
        switch (categoria)  {
            
            case ConstantesAlmacen.NUMERO_CATEGORIA_EMPLEADO : 
                t =new Empleado(nombre, edad, antiguedad, fec);
            break;
            case ConstantesAlmacen.NUMERO_CATEGORIA_DIRECTIVO : 
                t =new Directivo(nombre, edad, antiguedad, fec);
            break;
            
            case ConstantesAlmacen.NUMERO_CATEGORIA_ENCARGADO :
                t =new Encargado(nombre, edad, antiguedad, fec);
            break;
            
            case ConstantesAlmacen.NUMERO_CATEGORIA_TECNICO :
                t =new Tecnico(nombre, edad, antiguedad, fec);
            break;
            
            default:            
                 t =new Empleado(nombre, edad, antiguedad, fec);
                 t.setCategoria(categoria);
            
            
        }
            
       
        System.out.println("==================================================");
        System.out.println("CONTROL DE  DATOS DE ENTRADA: ");
        System.out.println("\t¿Es correcto el mes:? " + fec.mesCorrecto());
        System.out.println("\tEl nombre del mes es: " + fec.nombreMes());       
           
         
        System.out.println("\tNombre de la categorÍa: " + t.nombreCategoria());      
        
        System.out.println("\t¿Es correcta la antiguedad:? " + t.antiguedadCorrecta());      
        System.out.println("\tNombre de la antiguedad: " + t.nombreAntiguedad(antiguedad));      
        
            
        System.out.println("DATOS DEL TRABAJADOR: " + t.toString());

        System.out.println("==================================================");
    }//main
}//FIN
