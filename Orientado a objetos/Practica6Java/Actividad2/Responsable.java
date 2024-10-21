public class Responsable {
    private int DNI;
    private String nombre;
    private String apellido;
    
    public Responsable(){}
    
    public Responsable(int unDNI, String unNombre, String unApellido){
        DNI = unDNI;
        nombre = unNombre;
        apellido = unApellido;
    }
    
    //Setters
    public void setDNI(int unDNI) {DNI = unDNI;}
    public void setNombre(String n) {nombre = n;}
    public void setApellido(String a) {apellido = a;}
    
    //Getters
    public int getDNI(){return DNI;}
    public String getNombre(){return nombre;}
    public String getApellido() {return apellido;}
    
    //toString
    public String toString(){
        String aux = "El dni de " +this.nombre + " " + this.apellido+" es "+this.DNI;
        return aux;
    }
    
}