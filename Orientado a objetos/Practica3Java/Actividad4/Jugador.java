public class Jugador {
    private String nombre;
    private int DNI;
    private int edad;
    private int partidosJugados;
    private int goles;
    
    public Jugador(String unNombre, int unDNI, int unaEdad, int unPartidosJugados, int unGoles){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
        partidosJugados = unPartidosJugados;
        goles = unGoles;
    }
    
    public Jugador(){
    }

    
    //Getters
    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getPartidosJugados() {
        return partidosJugados;
    }
    
    public int getGoles(){
        return goles;
    }
    

    public String getNombre() {
        return nombre;
    }
    
    

    //Setters
    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public void setPartidosJugados(int unPartidosJugados) {
        partidosJugados = unPartidosJugados;
    } 
    
    public void setGoles(int unGoles) {
        goles = unGoles;
    }
    
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi DNI es " + DNI + " y tengo " + edad + " años.";
        return aux;
    }
    
    
    
    
}
