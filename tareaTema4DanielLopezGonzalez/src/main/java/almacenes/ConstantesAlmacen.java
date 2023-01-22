package almacenes;


public class ConstantesAlmacen {
	
   
    /*Almacenamos el sueldo base*/
    public static final double SUELDO_BASE = 607;
    
    /*Almacenamos los nombres de categoría*/
    public static final String NOMBRE_CATEGORIA_EMPLEADO = "EMPLEADO";
    public static final String NOMBRE_CATEGORIA_ENCARGADO = "ENCARGADO";
    public static final String NOMBRE_CATEGORIA_DIRECTIVO = "DIRECTIVO";
    public static final String NOMBRE_CATEGORIA_TECNICO = "TECNICO"; 
    
    /*Almacenamos las IDs de categoría*/
    public static final int NUMERO_CATEGORIA_EMPLEADO = 0;
    public static final int NUMERO_CATEGORIA_ENCARGADO = 1;
    public static final int NUMERO_CATEGORIA_DIRECTIVO = 2;
    public static final int NUMERO_CATEGORIA_TECNICO = 3;
    
    /*Almacenamos los porcentajes de sueldo por categoría*/
    public static final double IMPCAT_EMPLEADO = 0.15;
    public static final double IMPCAT_ENCARGADO = 0.35;
    public static final double IMPCAT_DIRECTIVO = 0.60;
    public static final double IMPCAT_TECNICO = 0.40;
    
    /*Almacenamos los nombres de antiguedad*/
    public static final String NOMBRE_ANTIGUEDAD_NOVATO = "NOVATO";
    public static final String NOMBRE_ANTIGUEDAD_MADURO = "MADURO";
    public static final String NOMBRE_ANTIGUEDAD_EXPERTO = "EXPERTO";

    /*Almacenamos las IDs de antiguedad*/
    public static final int NUMERO_ANTIGUEDAD_NOVATO = 0;
    public static final int NUMERO_ANTIGUEDAD_MADURO = 1;
    public static final int NUMERO_ANTIGUEDAD_EXPERTO = 2;
    
    /*Almacenamos los pluses por antiguedad*/
    public static final double SUELDO_PLUS_NOVATO = 150;
    public static final double SUELDO_PLUS_MADURO = 300;
    public static final double SUELDO_PLUS_EXPERTO = 600;

    /* Almacenamos los String de error*/
    public static final String CATEGORIA_ERRONEA = "CATEGORIA ERRÓNEA";
    public static final String ANTIGUEDAD_ERRONEA = "ANTIGUEDAD ERRÓNEA";
    
    public ConstantesAlmacen () {

    }
     
     
     
}
