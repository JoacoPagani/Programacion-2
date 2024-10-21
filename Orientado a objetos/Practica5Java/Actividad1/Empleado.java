public abstract class Empleado {
    private int DNI;
    private int edad;
    private double sueldoBasico;
    private String nombre;
    
    public Empleado(){}
    
    public Empleado(int unDNI, int unaEdad, double unSueldoBasico,String unNombre) {
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad;
        sueldoBasico = unSueldoBasico;
    }
    
    //defino el metodo abstracto 
    public abstract double calcularSueldo();
    
    //Setters
    public void setDNI(int d) {DNI = d;}
    public void setEdad(int e) {edad = e;}
    public void setDNI(double s) {sueldoBasico = s;}
    public void setNombre(String n) {nombre = n;}
    //Getters
    public int getDNI() {return DNI;}
    public int getEdad() {return edad;}
    public double getSueldoBasico() {return sueldoBasico;}
    public String getNombre() {return nombre;}
    //toString
    public String toString() { return "El sueldo de " + this.getNombre() + " es " + calcularSueldo();}
}