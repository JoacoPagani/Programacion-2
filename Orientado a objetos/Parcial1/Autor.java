public class Autor {

     /**Variables.*/
    private int DNI;
    private String Apellido;
    private String Nombre;
    private String Nacionalidad;
    
    /**Constructores.*/
    public Autor() {}
    
    public Autor(int DNI, String Apellido, String Nombre, String Nacionalidad) {
        this.setDNI(DNI);
        this.setApellido(Apellido);
        this.setNombre(Nombre);
        this.setNacionalidad(Nacionalidad);
    }
    
     /**Getters.*/
    public int getDNI(){return DNI;}
    public String getApellido(){return Apellido;}
    public String getNombre(){return Nombre;}
    public String getNacionalidad(){return Nacionalidad;}
    
     /**Setters.*/
    public void setDNI(int DNI){this.DNI = DNI;}
    public void setApellido(String Apellido){this.Apellido = Apellido;}
    public void setNombre(String Nombre){this.Nombre = Nombre;}
    public void setNacionalidad(String Nacionalidad){this.Nacionalidad = Nacionalidad;}
    
        
    
}