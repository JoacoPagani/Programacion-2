public class Carrera {
    
    /**Variables.*/
    private String Lugar;
    private Piloto[] pilotos;
    private int dimF = 10;
    private int dimL = 0;
    
    public Carrera() { this.pilotos = new Piloto[dimF];}
    
    public Carrera(String Lugar) {
        this.setLugar(Lugar);
        this.pilotos = new Piloto[dimF];
    }
    
     /**Getters.*/
    public String getLugar(){return Lugar;}
    public int getCantPilotos() {return dimL;}
    public Piloto getPiloto(int i) {return pilotos[i];}
    
    
     /**Setters.*/
    public void setLugar(String Lugar){this.Lugar = Lugar;}
    
    public void cargarVector(Piloto p) {
        pilotos[dimL] = p; //Nos esta dando Null Exception no pudo ser probado el codigo
        dimL++;
    }
        
     /**To String.*/
     public String toString() {
      return ("El lugar de la carrera fue " + getLugar());
        }
     
    
}