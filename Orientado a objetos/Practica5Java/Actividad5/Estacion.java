public class Estacion {
    private String Nombre;
    private double Long;
    private double Lat;
    
    
    public Estacion () {}
    
    public Estacion(String unNombre, double unaLatitud, double unaLongitud) {
         this.setNombre(unNombre);
         this.setLatitud(unaLatitud);
         this.setLongitud(unaLongitud);
    }
    
    
    
    //Setters
    public void setNombre(String n) {Nombre = n;}
    public void setLatitud(double L) {Long = L;}
    public void setLongitud(double L) {Lat = L;} 
    
    
    //Getters
    public String getNombre() {return Nombre;}
    public double getLatitud() {return Lat;}
    public double getLongitud() {return Long;}
    
    //toString
    public String toString() {
        return Nombre + " (" + Lat + " S - " + Long + " O)";
    }
}
    