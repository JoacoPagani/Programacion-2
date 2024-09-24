public class Triangulo {
    private double a, b, c;

    // Constructor para inicializar los lados del triángulo
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para verificar si es un triángulo válido
    public boolean esValido() {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return a + b + c;
    }
}

