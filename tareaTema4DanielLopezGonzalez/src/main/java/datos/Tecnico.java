package datos;

import almacenes.ConstantesAlmacen;

/**
 *
 * @author DaniLopez
 */
/*Tecnico extiende la clase Trabajador*/
public class Tecnico extends Trabajador{
    
 
    /*Constructor sin parametros*/
    
    public Tecnico() {
       categoria = ConstantesAlmacen.NUMERO_CATEGORIA_TECNICO; 
    }
    
    /*Constructor con super() que inicializa las variables de la clase superior*/
    public Tecnico (String nombre, int edad, int antiguedad, Fecha fecha_alta) {
        super(nombre, edad, antiguedad, fecha_alta);
        categoria = ConstantesAlmacen.NUMERO_CATEGORIA_TECNICO;
    }

   /*Implementamos el método nombreCategoría*/
   @Override
   public String nombreCategoria () {
       String categoriaString;
       categoriaString = switch (categoria) {
            case ConstantesAlmacen.NUMERO_CATEGORIA_EMPLEADO -> ConstantesAlmacen.NOMBRE_CATEGORIA_EMPLEADO;
            case ConstantesAlmacen.NUMERO_CATEGORIA_ENCARGADO -> ConstantesAlmacen.NOMBRE_CATEGORIA_ENCARGADO;
            case ConstantesAlmacen.NUMERO_CATEGORIA_DIRECTIVO -> ConstantesAlmacen.NOMBRE_CATEGORIA_DIRECTIVO;
            case ConstantesAlmacen.NUMERO_CATEGORIA_TECNICO -> ConstantesAlmacen.NOMBRE_CATEGORIA_TECNICO;
            default -> ConstantesAlmacen.CATEGORIA_ERRONEA;
        };
       
       return categoriaString;
   } 
   
    
    /*Implementamos el método sueldoTrabajador para calcular el sueldo */
 @Override
    public double sueldoTrabajador(int antiguedad) {
        
        double calculoSueldo;
        double importeAntiguedad;
                         
        /*mantenemos el switch para calcular en función de la antiguedad, pero utilizamos las constantes*/
        importeAntiguedad = switch (getAntiguedad()) {
            case ConstantesAlmacen.NUMERO_ANTIGUEDAD_NOVATO -> ConstantesAlmacen.SUELDO_PLUS_NOVATO;
            case ConstantesAlmacen.NUMERO_ANTIGUEDAD_MADURO -> ConstantesAlmacen.SUELDO_PLUS_MADURO;
            case ConstantesAlmacen.NUMERO_ANTIGUEDAD_EXPERTO -> ConstantesAlmacen.SUELDO_PLUS_EXPERTO;
            default -> 0;
        };
                          
        calculoSueldo = ConstantesAlmacen.SUELDO_BASE + (ConstantesAlmacen.SUELDO_BASE * ConstantesAlmacen.IMPCAT_TECNICO) + importeAntiguedad;
        return calculoSueldo;
           
    }
      
}