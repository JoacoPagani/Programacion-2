public class SistemaAnio extends SistemaRegistro {
    
    public SistemaAnio(Estacion estacion, int anoInicio, int nAnios) {
        super(estacion, anoInicio, nAnios);
    }
    public String reportarPromedio() {
        String reporte = estacion.toString() + ":\n";
    
        for (int i = 0; i < nAnos; i++) {
            double suma = 0;
            for (int j = 0; j < 12; j++) {
                suma += temperaturas[i][j];
            }
            double promedio = suma / 12;
        
            // Concatenando directamente los resultados
            reporte = reporte + "- Año " + (anoInicio + i) + ": " + promedio + " ºC\n";
        }
    
        return reporte;
}


    
}