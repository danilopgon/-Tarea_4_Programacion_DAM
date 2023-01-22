package datos;

abstract public class Trabajador implements Antiguedad {
    
/* declaramos los atributos de trabajador */
    
    private String nombre;
    private int edad;
    private int antiguedad;
    private Fecha fecha_alta;
    /*el atributo categoría se declara como protected, siendo accesible para las subclases*/
    protected int categoria;
    
    
    
  
/* constructor sin parametros */

    public Trabajador() {
    }

    
/* constructor con parametros */
/* Respecto al ejercicio 3.2 eliminamos categoría porque cada subclase pasa a representar lo que antes era el atributo */

    public Trabajador(String nombre, int edad, int antiguedad, Fecha fecha_alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.fecha_alta = fecha_alta;
    }
    
/* métodos get y set para cada uno de los atributos */
    
    /* get y set para nombre*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*get y set para edad*/

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
           this.edad = edad;
        } else {
            System.out.println("Introduzca una edad adecuada");
        }        
    }
    
         
   /* get y set para antiguedad*/

    public int getAntiguedad() {
        return antiguedad;
    }

   

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad; // comprobacion con el boolean al igual que con la categoria
    }
    
    /* get y set para la fecha */

    public Fecha getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Fecha fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    


/* metodo string para devolver el nombre de la categoria del empleado,  */

  abstract public String nombreCategoria(); 
         
/* metodo string para devolver el nombre de la antiguedad */
 @Override
 public String nombreAntiguedad (int antiguedad) {
     String antiguedadString;
       antiguedadString = switch (antiguedad) {
            case 0 -> "NOVATO";
            case 1 -> "MADURO";
            case 2 -> "EXPERTO";
            default -> "ANTIGÜEDAD ERRÓNEA";
        };
       
       return antiguedadString; 
    }
       
  /* metodo boolean para comprobar la antiguedad */

  @Override
   public boolean antiguedadCorrecta () {
        return (this.antiguedad >= 0 && this.antiguedad <= 2); 
    }

 

/* Método abstract para calcular el sueldo */
/* Respecto al ejercicio 3.2: aquí sueldoTrabajador y nombreCategoría son abstractos*/
/* La implementación pasa a hacerse en las clases hijas*/

   
  abstract public double sueldoTrabajador (int antiguedad);
  
  
   
   /* metodo para devolver los datos del trabajador, reemplazamos datosTrabajador por un ToString*/
  
  
    @Override
   public String toString () {
        
        return nombre + ", edad: " + getEdad() + "\nCategoría: " + nombreCategoria() + "\nAntigüedad: " + nombreAntiguedad(getAntiguedad()) + "\nFecha de Alta: " + fecha_alta.laFechaEs() + "\nSueldo: " + sueldoTrabajador(getAntiguedad());
   }
   
   public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

   
}

