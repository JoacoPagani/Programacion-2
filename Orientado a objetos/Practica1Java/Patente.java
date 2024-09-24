public class Patente { 
    private int patente;
    
    public Patente(int p){
        this.patente = p;  
    }

    public boolean esPar() {
        return ((patente % 2) == 0);
    }
}