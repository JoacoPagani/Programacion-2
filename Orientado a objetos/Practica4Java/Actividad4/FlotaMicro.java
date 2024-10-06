
public class FlotaMicro {
    private micro[] flota;
    private int dimL;

    public FlotaMicro()
    {
        flota = new micro[15];
        dimL = 0;
    }
    
    public boolean estaCompleta() {
        return (dimL == 15);
    }
    
    public boolean agregarMicro(micro m) {
        if (!estaCompleta()) {
            flota[dimL] = m;
            dimL++;
            return true; //Se agrego correctamente
        }
        return false; //No se pudo agregar el micro
    }
    
    public boolean eliminarMicro(String p) {
        for (int i = 0; i < dimL; i++) {
            if (flota[i].getPatente().equalsIgnoreCase(p)) {
                // Encontramos el micro con la patente dada
                // Desplazar todos los micros siguientes hacia la izquierda para llenar el hueco
                for (int j = i; j < dimL - 1; j++) {
                    flota[j] = flota[j + 1];
                }
                flota[dimL - 1] = null;  // Eliminar el último micro
                dimL--;  // Reducir la cantidad de micros
                return true;  // Micro eliminado exitosamente
            }
        }
        return false;  // No se encontró un micro con la patente dada    
    }
    
    public micro buscarMicroPorPatente(String p) {
        for (int i = 0; i < dimL; i++) {
            if (flota[i].getPatente().equalsIgnoreCase(p)) {return flota[i];}
        } return null;
    }
    
    public micro buscarMicroPorDestino(String d) {
        for (int i = 0; i < dimL; i++) {
            if (flota[i].getDestino().equalsIgnoreCase(d)) {return flota[i];}
        } return null;
    }
    
}
