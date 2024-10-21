public class SistemaMes extends SistemaRegistro {
    
    public SistemaMes(Estacion estacion, int anoInicio, int nAnios) {
        super(estacion, anoInicio, nAnios);
    }
    public String reportarPromedio() {
        String reporte = estacion.toString() + ":\n";
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
        for (int j = 0; j < 12; j++) {
            double suma = 0;
            for (int i = 0; i < nAnos; i++) {
                suma += temperaturas[i][j];
            }
            double promedio = suma / nAnos;
            // Concatenando directamente los resultados
            reporte = reporte + "- " + meses[j] + ": " + promedio + " ºC\n";
        }
    
        return reporte;
}

    
}