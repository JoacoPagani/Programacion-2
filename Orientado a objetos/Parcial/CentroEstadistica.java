public class CentroEstadistica {
    private int dimF = 5, dimL = 0;
    private Carrera[] carreras;
    private int puntajeTotal;
    
    public CentroEstadistica() {carreras = new Carrera[dimF];}
    
    public void cargarVector(Carrera c) {
        carreras[dimL] = c;
        dimL ++;
    }
    
    public int obtenerPuntaje() {
        int puntaje = 0;
        for (int i = 0; i < dimL; i++ ) {
            for (int j = 0; j < carreras[i].getCantPilotos(); j++) {
             puntaje += carreras[i].getPiloto(j).getPuntaje(); 
            }
                
        }
     return puntaje;   
    }
    
    public String toString() {
        String aux="";
        for (int i = 0; i< dimL; i++) {
            aux += "\n" + carreras[i].toString();
            for (int j = 0; j < carreras[i].getCantPilotos(); j++ ) {
              aux += "\n" + carreras[i].getPiloto(j).toString() ;
            }
        }
        return aux;
    } 


}