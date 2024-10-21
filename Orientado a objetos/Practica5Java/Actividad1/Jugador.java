public class Jugador extends Empleado {
    private int partidosJugados;
    private int goles;
    
    public Jugador(){}
    
    public Jugador(int partidosJugados, int goles, int jDNI, int jEdad, double jSueldoBasico, String jNombre) {
        super(jDNI,jEdad,jSueldoBasico, jNombre);
        this.partidosJugados = partidosJugados;
        this.goles = goles;
    }
    
    public double calcularSueldo() {
        if  (((double) goles / partidosJugados) > 0.5) {return 2*super.getSueldoBasico();}
        return super.getSueldoBasico();
    }
    
    
    //Setters
    public void setPartidosJugados(int p) {partidosJugados = p;}
    public void setGoles(int g){goles = g;}
    
    //Getters
    public int getPartidosJugados() {return partidosJugados;}
    public int getGoles() {return goles;}
}