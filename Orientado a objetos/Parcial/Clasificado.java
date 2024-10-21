public class Clasificado extends Piloto {
    private int TiempoLogrado;
    private TablaPuntajesF1 tabla = new TablaPuntajesF1();  
   
    /**Constructores.*/
    public Clasificado() {}
    
    public Clasificado(int TiempoLogrado, String Nombre, String Apellido, int Ranking) {
        super(Nombre, Apellido, Ranking);
        this.setTiempoLogrado(TiempoLogrado);
    }

    
    /**Setters.*/
    public void setTiempoLogrado(int t) {TiempoLogrado = t;}
    
    /**Getters.*/
    public int getTiempoLogrado() {return TiempoLogrado;} 
    
    public void calcularPuntaje(String lugar, int pos) {
        int puntaje = super.getPuntaje();
        if ((lugar.equalsIgnoreCase("Japon") || lugar.equalsIgnoreCase("China"))) {puntaje += 3;
        } else if (lugar.equalsIgnoreCase("Belgica") || lugar.equalsIgnoreCase("Hungria")){puntaje += 1;
        }
        if (TiempoLogrado > 60 && TiempoLogrado < 65 ) {puntaje += 2;}
        puntaje +=  tabla.obtenerPuntaje(pos);
        super.setPuntaje(puntaje);
    }
}