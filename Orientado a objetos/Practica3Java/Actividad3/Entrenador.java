public class Entrenador {
    private String nombre;
    private double sueldoBasico, sueldo;
    private int titulosGanados; 
    
    public Entrenador(String unNombre, int sueldoBasico, int titulosGanados){
        nombre = unNombre;
        this.sueldoBasico = sueldoBasico;
        this.titulosGanados = titulosGanados; 
    }
    
    public Entrenador(){
     
    }

    
    public double calcularSueldoACobrar() {
        sueldo = sueldoBasico;
        if (titulosGanados > 10) {
            sueldo += 50000;
        } else if (titulosGanados >= 4) {
            sueldo += 30000;
        } else if (titulosGanados > 0) {
            sueldo += 5000;
        }
        return sueldo;
    }
    
    //Getters
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getTitulosGanados() {
        return titulosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    
    //Setters
    public void setSueldoBasico(double unSueldoBasico) {
        sueldoBasico = unSueldoBasico;
    }

    public void setTitulosGanados(int unTitulosGanados ) {
        titulosGanados= unTitulosGanados;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi sueldo es: " + sueldo;
        return aux;
    }
    
    
    
    
}
