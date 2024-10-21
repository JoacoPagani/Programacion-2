public abstract class Piloto {
         /**Variables.*/
    private String Nombre;
    private String Apellido;
    private int Ranking;
    private int Puntaje;
    private boolean Termino5;
    
     /**Constructores.*/
    public Piloto() {}
    
    public Piloto(String Nombre, String Apellido, int Ranking) {
        this.Nombre= Nombre;
        this.setApellido(Apellido);
        this.setRanking(Ranking); 
        Puntaje = 0;
        Termino5 = false;
    }
     
     
     
     /**Getters.*/
    public String getNombre(){return Nombre;}
    public String getApellido(){return Apellido;}
    public int getRanking(){return Ranking;}
    public int getPuntaje(){return Puntaje;}
    public boolean getTermino5(){return Termino5;}
    
    
     /**Setters.*/
    public void setNombre(String Nombre){this.Nombre = Nombre;}
    public void setApellido(String Apellido){this.Apellido = Apellido;}
    public void setRanking(int Ranking){this.Ranking = Ranking;}
    public void setPuntaje(int Puntaje){this.Puntaje = Puntaje;}
    public void setTermino5(boolean Termino5){this.Termino5 = Termino5;}
    
     /**to String.*/
    public String toString() {
       return ("El piloto " + getNombre() + " " + getApellido() + " y obtuvo el puntaje " + getPuntaje()); 
        }
        
    public abstract void calcularPuntaje(String lugar, int pos);
}