abstract class SistemaRegistro {
    Estacion estacion;
    int anoInicio;
    int nAnos;
    double[][] temperaturas;
    
    public SistemaRegistro(){}
    
    public SistemaRegistro(Estacion estacion, int anoInicio, int nAnos) {
        
        this.estacion = estacion;
        this.anoInicio = anoInicio;
        this.nAnos = nAnos;
        this.temperaturas = new double[nAnos][12];
        
        for (int i = 0; i < nAnos; i++) {
            for (int j = 0; j < 12; j++) {
                temperaturas[i][j] = 100; //Inicializo en valor alto
            }
        }
    }
    
    public void registrarTemperatura(int ano, int mes, double temperatura) {
        if (ano >= anoInicio && ano < anoInicio + nAnos && mes >= 1 && mes <= 12) {
            temperaturas[ano - anoInicio][mes - 1] = temperatura;
        }
    }
    
    public double obtenerTemperatura(int ano, int mes) {
        if (ano >= anoInicio && ano < anoInicio + nAnos && mes >= 1 && mes <= 12) {
            return temperaturas[ano - anoInicio][mes - 1];
        }
        return 100;
    }
    
    public String obtenerMayorTemperatura() {
        double mayorTemp = -100;
        int mesMayor = -1, anoMayor = -1;
        for (int i = 0; i < nAnos; i++) {
            for (int j = 0; j < 12; j++) {
                if (temperaturas[i][j] > mayorTemp) {
                    mayorTemp = temperaturas[i][j];
                    anoMayor = anoInicio + i;
                    mesMayor = j + 1;
                }
            }
        }
        return "Mes: " + mesMayor + ", Año: " + anoMayor;
    }

    // Método abstracto para reportes (se implementará en las subclases)
    public abstract String reportarPromedio();
    
}