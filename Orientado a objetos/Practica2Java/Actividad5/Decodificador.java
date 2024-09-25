public class Decodificador {
    private String[] vectorPalabras;
    int dimF;
    // Constructor
    public Decodificador(int dimF) {
        this.dimF = dimF;
        vectorPalabras = new String[dimF];
    }
    
    // Método para setear cada palabra en el vector
    public void setVectorPalabras(String p, int i) {
        vectorPalabras[i] = p;        
    }
    
    public String obtenerMensajeEscondido() {
        String mensaje = "";
        
        for (int i = 0; i < dimF; i++) {
            mensaje += vectorPalabras[i].charAt(0);
        }
        return mensaje;
    }
}