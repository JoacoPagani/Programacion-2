public class Entrenador extends Empleado {
    private int trofeosGanados;
    
    public Entrenador() {}
    
    public Entrenador(int trofeosGanados, int eDNI, int eEdad, double eSueldoBasico, String eNombre) {
        super(eDNI,eEdad,eSueldoBasico, eNombre);
        this.setTrofeosGanados(trofeosGanados);   
    }
    
    
    
    public double calcularSueldo() {
                if (trofeosGanados> 10) {
            return (super.getSueldoBasico() + 50000);
        } else if (trofeosGanados>= 4) {
            return (super.getSueldoBasico() + 30000);
            } else if (trofeosGanados> 0) {
            return super.getSueldoBasico() + 5000;
            }
        return super.getSueldoBasico();
        }
    
    //Setters
    public void setTrofeosGanados(int t) {trofeosGanados = t;}
    
    //Getters
    public int getTrofeosGanados() {return trofeosGanados;}
    
}