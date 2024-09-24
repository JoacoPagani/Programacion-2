public class Restaurante {
    private double[][] cal;
    private double promedio;
    private double suma;
    private String[] aspectos = {"Atención al cliente", "Calidad de la comida", "Precio", "Ambiente"};
    
    // Constructor
    public Restaurante() {
        cal = new double[4][5]; // Inicializo la matriz: 4 aspectos, 5 clientes
        suma = 0;
        promedio = 0;
    }
    
    // Setter para la calificación
    public void setCalificacion(int i, int j, double c) {
        cal[i][j] = c;
    }
    
    // Método para calcular y mostrar promedios por aspecto
    public void calcularPromedio() {
        for (int i = 0; i < 4; i++) { // Recorrer aspectos (filas)
            suma = 0; // Reiniciar la suma para cada fila (aspecto)
            for (int j = 0; j < 5; j++) { // Recorrer clientes (columnas)
                suma += cal[i][j];
            }
            promedio = suma / 5; // Calcular promedio para el aspecto actual
            mostrarResultado(i); // Mostrar el promedio
        }
    }
    
    // Método privado para mostrar el resultado
    private void mostrarResultado(int a) {
        System.out.println("El promedio de las clasificaciones del aspecto " + aspectos[a] + " es: " + promedio);
    }
}
